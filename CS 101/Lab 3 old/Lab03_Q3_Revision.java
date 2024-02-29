/*
 * This program prints information about your Bank account
 * 
 * @author Seçkin Alp Kargı
 */

import java.util.Scanner;

public class Lab03_Q3_Revision 
{
    public static void main(String[] args)
    {
        //definitions
        double selection;
        double withdrawAmount;
        double newBalance;
        double currencySelection;
        double creditAmount;
        char index2;
        char index3;
        String newPinStar;
        String newPinStar2;
        String pin;
        String newPin;
    
        double amount1 = 1000;
        
        //scanner
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your PIN: ");
        pin = in.next();

        if (pin.equals("1234"))
        {
            //prints
            System.out.println("1- Request a credit card");
            System.out.println("2- Withdraw money");
            System.out.println("3- Open a new account");
            System.out.println("4- Change PIN");
            System.out.print("Select an operation: ");

            selection = in.nextDouble();

            //selection 1 options
            if(selection == 1)
            {
                System.out.println("Enter the card limit (cannot exceed 2 * your balance): ");
                creditAmount = in.nextDouble();
                if (creditAmount <= 2 * amount1 && creditAmount > 0)
                {
                    System.out.println("Your credit card request has been successfully received! Bye! ");
                }
                else
                {
                    System.out.println("You entered an invalid amount! Bye!");
                }
            }
            //selection 2 options
            else if ( selection == 2)
            {
                System.out.println("Enter the amount to withdraw: ");
                withdrawAmount = in.nextDouble();
                newBalance = amount1 - withdrawAmount;
                System.out.printf("Your new balance is " + newBalance + " TRY. Bye!");
            }
            //selection 3 options
            else if ( selection == 3)
            {
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.println("3- EUR");
                System.out.println("4- XAU");
                System.out.print("Select currency type: ");
                currencySelection = in.nextDouble();

                if (currencySelection == 1)
                {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if (currencySelection == 2)
                {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
                else if (currencySelection == 3)
                {
                    System.out.println("Your new EUR account is now opened! Bye!");
                }
                else if (currencySelection == 4)
                {
                    System.out.println("Your new XAU account is now opened! Bye!");
                }
                else
                {
                    System.out.println("Your selection is invalid! Bye!");
                }
            }
            //selection 4 options
            else if (selection == 4)
            {
                System.out.print("Enter your new PIN: ");
                newPin = in.next();
                String star = "*";
                char starchar = star.charAt(0);
                index2 = newPin.charAt(1);
                index3 = newPin.charAt(2);
                newPinStar = newPin.replace (index2, starchar );
                newPinStar2 = newPinStar.replace (index3, starchar );

                System.out.printf("Your PIN is changed to " + newPinStar2 + ". Bye!");
            }
        }
        else 
        {
          System.out.println("Invalid PIN! BYE!");
        }

        in.close();
    }
}
