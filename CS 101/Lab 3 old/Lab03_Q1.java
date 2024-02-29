/*
 * This program prints information about BMI
 * 
 * @author Seçkin Alp Kargı
 */

import java.util.Scanner;

public class Lab03_Q1 
{
    public static void main(String[] args) 
    {
        //definitions
        double weight;
        double height;
        double bmi;
        String health;
        
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        weight = in.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = in.nextDouble();

        //calculations
        bmi = weight / Math.pow(height, 2) ;
        
        //if
        if (bmi >= 30) 
        {
            health = "obese";
        }
        else if (bmi >= 25)
        {
            health = "overweight";
        }
        else if (bmi >= 18.5)
        {
            health = "healthy";
        }
        else 
        {
            health = "underweight";
        }
        
        System.out.printf("Your BMI is %.2f and you are in the category of %s." , bmi , health );
        
        in.close();
    }
    
}
