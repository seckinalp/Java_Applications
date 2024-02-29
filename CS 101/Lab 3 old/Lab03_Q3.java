/*
 * This program prints information about your Bank account.
 * 
 * @author Seçkin Alp Kargı
 */

import java.util.Scanner;

public class Lab03_Q3 
{
    public static void main(String[] args) 
    {
        //definitions
        double selection;
        double withdrawAmount;
        double newBalance;
        double currencySelection;
        char index2;
        char index3;
        String newPinStar;
        String newPinStar2;
        String pin;
        String newPin;
        String pin1;
        pin1 = "1234";
        double amount;
        amount = 1000;
        //scanner
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your PIN: ");
        pin = in.next();

        if (pin.equals(pin1))
        {
            System.out.println("1- Withdraw money");
            System.out.println("2- Open a new account");
            System.out.println("3- Change PIN");
            System.out.print("Select an operation: ");

            selection = in.nextDouble();
            if ( selection == 1)
            {
                System.out.println("Enter the amount to withdraw: ");
                withdrawAmount = in.nextDouble();
                newBalance = amount - withdrawAmount;
                System.out.printf("Your new balance is %.2f TRY. Bye!" , newBalance);
            }
            else if ( selection == 2)
            {
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.print("Select currency type: ");
                currencySelection = in.nextDouble();
               
                if (currencySelection == 1)
                {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else 
                {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }
            else 
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
