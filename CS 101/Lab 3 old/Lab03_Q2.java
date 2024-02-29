/*
 * This program prints information about year.
 * 
 * @author Seçkin Alp Kargı
 */

import java.util.Scanner;

public class Lab03_Q2 
{
    public static void main(String[] args)
    {
        //definitions
        int year;
        int centuryNumber;
        int intSub;
        int numberOfCharacters;
        int firstCharacters;
        String sub;
        String century;
        String stringYear;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year to be evaluated: ");
        year = in.nextInt();

        //century calculation 
        stringYear = String.valueOf(year);
        numberOfCharacters = stringYear.length();

        if (year <= 100)
        {
            centuryNumber = 1;
        }
        else if (year % 100 == 0)
        {
            firstCharacters = numberOfCharacters - 2;
            sub = stringYear.substring(0,firstCharacters);
            intSub = Integer.valueOf(sub);
            centuryNumber = intSub ;
        }
        else
        {
            firstCharacters = numberOfCharacters - 2;
            sub = stringYear.substring(0,firstCharacters);
            intSub = Integer.valueOf(sub);
            centuryNumber = intSub + 1;
        }
        
        //th
        if (centuryNumber % 10 == 1 && centuryNumber % 100 != 11)
        {
            century ="st";
        }
        else if (centuryNumber % 10 == 2 && centuryNumber % 100 != 12)
        {
            century = "nd";
        }
        else if (centuryNumber % 10 == 3 && centuryNumber % 100 != 13)
        {
            century = "rd"; 
        }
        else 
        {
            century = "th";
        }
    
        //if 2
        if (year % 4 == 0)
        {
            if (year%100 == 0)
         {
                if(year%400 == 0)
            {
                System.out.printf("The year " + year  + " is in the " + centuryNumber + century + " century and is a leap year.");
            }
                else
            {
                System.out.printf("The year " + year  + " is in the " + centuryNumber + century + " century and is not a leap year.");
            }
         }
            else
         {
            System.out.printf("The year " + year  + " is in the " + centuryNumber + century +  " century and is a leap year.");
         }
        }
        else 
        {
            System.out.printf("The year " + year  + " is in the " + centuryNumber + century +  " century and is not a leap year.");
        }

        in.close();
    }
}
