// This is Seçkin Alp Kargı's code for calculation

public class Lab01_Q3_Kargi 
{
    public static void main(String[] args) 
    {  
        //calculation
        double x = -5;
        double y = (Math.pow(x, 3) + (3 * Math.abs(x)) + 9) / Math.pow(x, 2);
        
        //double to int
        int intValueY = (int) y; //int intValueY = (int) Math.round(y);
        
        //print
        System.out.println("The result of expression: " + intValueY);
    }
}
