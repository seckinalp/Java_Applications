import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SolarSystem
{
   public static void main ( String[] args )
   {
      JFrame frame = new window( "Samanyolu" );
    
      SolarSystemContent solarSystem1 = new SolarSystemContent();
      
      frame.getContentPane().add(solarSystem1);
     
      frame.pack();
      frame.setVisible( true );
      while(((window)frame).check == 0 || ((window)frame).check == 1)
      {
         try 
         {
            Thread.sleep(10);
         } 
         catch (Exception ex) 
         {
            ex.printStackTrace();
         }

         if(((window)frame).check == 0)
         {
            if(((window)frame).newPlanetCheck == 1)
            {
               SolarSystemContent.Planet q = solarSystem1.new Planet(Integer.parseInt(window.field1.getText()),Integer.parseInt(window.field2.getText()),Integer.parseInt(window.field3.getText()),Integer.parseInt(window.field4.getText()),Double.parseDouble(window.field5.getText()));
               solarSystem1.planetList.add(q);
               frame.pack();
               frame.repaint();
               ((window)frame).newPlanetCheck = 0;
            }
         }
         else
         {
            frame.repaint();
         }
      }

   }
}
class SolarSystemContent extends JPanel
{  
   public static int rewind = 1;
   public ArrayList<Planet> planetList;
   public SolarSystemContent()
   {
      planetList = new ArrayList<>();
   }
   public void paintComponent(Graphics g)
   {  
      int cntrX = getWidth()/2;
      int cntrY = getHeight()/2;
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, getWidth(), getHeight());
      g.setColor(Color.YELLOW);
      g.fillOval(cntrX - 35, cntrY - 35 , 70 , 70);
      for(Planet i : planetList)
      {
         i.draw(g);
      }
   }

   class Planet
   {
      public double angle;
      public double time = 0;
      public int orbitRadiusX;
      public int orbitRadiusY;
      public int planetRadius;
      public double angularSpeed;
      public Color color;
      public int currentX;
      public int currentY;
      public Planet(int orbitRadiusX, int orbitRadiusY, int planetRadius, int startingAngle, double angularSpeed)
      {
         this.orbitRadiusX = orbitRadiusX;
         this.orbitRadiusY = orbitRadiusY;
         this.planetRadius = planetRadius;
         this.time = startingAngle;
         this.angularSpeed = angularSpeed;
         color = new Color((int)(Math.random() * 0x1000000));
      }
      public void draw(Graphics g)
      {
         int cntrX = getWidth()/2;
         int cntrY = getHeight()/2;
         setPosition(time);
         g.setColor( Color.GRAY );
         g.drawOval( cntrX-(orbitRadiusX/ 2), cntrY - (orbitRadiusY/2), orbitRadiusX, orbitRadiusY);
         g.setColor(color);
         g.fillOval(currentX , currentY , planetRadius,planetRadius);
      }
      public void setPosition(double anglee)
      {
         int cntrX = getWidth()/2;
         int cntrY = getHeight()/2;
         if(rewind == 1)
         {
            time += angularSpeed;
            if(time > 360)
            {
               time = 0;
            }
            angle = (Math.PI / 180) * time;
         }
         else
         {
            time -= angularSpeed;
            if(time < 0 )
            {
               time = 360;
            }
            angle = (Math.PI / 180) * time;
         }
         currentX = (int) ((cntrX - planetRadius / 2)+ ((orbitRadiusX/2) * Math.cos(angle) ));
         currentY = (int) ((cntrY - planetRadius / 2)+ ((orbitRadiusY/2) * Math.sin(angle) ));
      }  
   }
}

class window extends JFrame
{
   public JMenuBar x;
   static JTextField field1;
   static JTextField field2;
   static JTextField field3;
   static JTextField field4;
   static JTextField field5;
   public int check = 0;
   public int newPlanetCheck = 0;
   public window(String name)
   {
      super(name);
      setPreferredSize( new Dimension(1920, 1080) );
      JButton button = new JButton("Play");
      button.setSize(200, 40);
      ActionListener listener = new buttonListener();
      button.addActionListener(listener);
      JButton button2 = new JButton("Pause");
      button2.setSize(200, 40);
      ActionListener listener2 = new button2Listener();
      button2.addActionListener(listener2);
      JButton button3 = new JButton("Rewind");
      button3.setSize(200, 40);
      ActionListener listener3 = new button3Listener();
      button3.addActionListener(listener3);
      JLabel label1 = new JLabel("Orbit Radius X (0-1920): ");
      field1 = new JTextField();
      JLabel label2 = new JLabel("Orbit Radius Y (0-1080): ");
      field2 = new JTextField();
      JLabel label3 = new JLabel("Planet Radius (0-50): ");
      field3 = new JTextField();
      JLabel label4 = new JLabel("Starting Angle (0-360): ");
      field4 = new JTextField();
      JLabel label5 = new JLabel("Angular Speed (0.0-10.0): ");
      field5 = new JTextField();
      JButton button4 = new JButton("New Planet");
      button4.setSize(200, 40);
      ActionListener listener4 = new button4Listener();
      button4.addActionListener(listener4);
      x = new JMenuBar();
      x.add(button);
      x.add(button2);
      x.add(button3);
      x.add(label1);
      x.add(field1);
      x.add(label2);
      x.add(field2);
      x.add(label3);
      x.add(field3);
      x.add(label4);
      x.add(field4);
      x.add(label5);
      x.add(field5);
      x.add(button4);
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setJMenuBar(x); 
   }

   class buttonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         check = 1;
         SolarSystemContent.rewind = 1;
      }
   }
 
   class button2Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         check = 0;
      }
   }
 
   class button3Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         check = 1;
         SolarSystemContent.rewind = 0;
      }
   }

   class button4Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         check = 0;
         newPlanetCheck = 1;
      }
   }
}
