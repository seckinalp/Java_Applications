// This is Seçkin Alp Kargı's code for weight
import java.util.Scanner;
public class Lab03_Q2_Kargi 
{
    public static void main(String[] args) 
    {
        //constants
        final Double SATURNG = 1.17;
        final Double URANUSG = 1.05;
        final Double VENUSG = 0.78;
        final Double JUPITERG = 2.65;
        final Double NEPTUNEG = 1.23;
        final Double MARSG = 0.39;
        
        final String empty = "";
        final String invalid = "Invalid choice - quitting...";
        final String writing1 = "Your weight on planet";
        final String is = " is ";

        //scanner, inputs, variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        Double weight = input.nextDouble();
        Double gravity = 0.0;
        int choice = 0;

        //choosing part
        if (weight >= 0)
        {
            System.out.printf("Choose the planet:  %n%-8s%s%n%-8s%s%n%-8s%s%n%-8s%s%n%-8s%s%n%-8s%s%n%s", empty, "1-Venus" , empty, "2-Mars", empty, "3-Jupiter", empty, "4-Saturn", empty,"5-Uranus", empty, "6-Neptune" , "Choice: ");
            choice = input.nextInt();
            if (choice == 1)
            {
                gravity = VENUSG;
            }
            else if (choice == 2)
            {
                gravity = MARSG;
            }
            else if (choice == 3)
            {
                gravity = JUPITERG;
            }
            else if (choice == 4)
            {
                gravity = SATURNG;
            }
            else if (choice == 5)
            {
                gravity = URANUSG;
            }
            else if (choice == 6)
            {
                gravity = NEPTUNEG;
            }
            else 
            {
                System.out.println(invalid);
            }
            //calculation and printing
            Double finalWeight = gravity * weight;
            System.out.printf("%s%d%s%.1f", writing1, choice, is, finalWeight);
        }
        else
        {
            System.out.println(invalid);
        }
        
        
        
        input.close();
    }
}
