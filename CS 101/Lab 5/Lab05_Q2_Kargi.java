// This is Seçkin Alp Kargı's code for create number mountain
import java.util.Scanner;
public class Lab05_Q2_Kargi
{
    public static void main(String[] args) 
    {
        //constants and variables
        final String blank = " ";
        int number;
        int sum = 0;
        
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter mountain width: ");
        
        //main do while check for odd
        do
        {
            number = in.nextInt();
            sum = 0;
            int count = 0;
            int k = 0;
            int row = number / 2 + 1;
            
            //if odd make pyramid
            if (number % 2 != 0)
            {
                
                for (int i = 1; i <= row; i++)
                {
                    System.out.printf("%23s", blank);
                    for (int space = 1; space <= row - i; space ++)
                    {
                        System.out.print("    ");
                        count++;
                    }

                    for (k = 0; k < 2 * i - 1; k++) 
                    {
                        if (count <= row - 1) 
                        {
                            int calc1 = (number - 2 * (i - 1) + k);
                            System.out.print(calc1 + "   ");
                            count++;
                            sum = sum + calc1;
                        } 
                        else 
                        {
                            int calc2 = (number - k );
                            System.out.print(calc2 + "   ");
                            sum = sum + calc2;
                        }
                    }
                    count = k = 0;
                    System.out.println();
                }
            }

            //if not odd
            else if (number % 2 == 0)
            {
                System.out.print("Enter mountain width: "); 
            }  
        }
        while (number % 2 == 0 );

        //last print
        System.out.println("Weight of mountain with width of " + number + " is " + sum);

        in.close();
    }
}
