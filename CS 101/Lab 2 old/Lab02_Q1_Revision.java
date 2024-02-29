import java.util.Scanner;

public class Lab02_Q1_Revision {
    
    public static void main(String[] args) 
    {
        //variables
        double radiusOfCircle;
        double circleArea;
        double circleCircumference;
        String COLON;

        //scanner and inputs
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        radiusOfCircle = radius.nextDouble();
        
        //calculations
        circleArea = Math.PI * Math.pow(radiusOfCircle, 2);
        circleCircumference = Math.PI * radiusOfCircle * 2;
        COLON = ":";

        //prints
        System.out.printf("The area of the circle is %14s%14.3f%n", COLON, circleArea);
        System.out.printf("The circumference of the circle is %5s%14.3f%n", COLON, circleCircumference);

        radius.close();

    } 
}
