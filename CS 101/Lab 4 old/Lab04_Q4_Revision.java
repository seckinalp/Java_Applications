/*
 * This program prints information about design
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q4_Revision 
{
    public static void main(String[] args) 
    {
        //definitions
        int number;
        String asterisk = "*";
        String a = "*";
        String format;
        String format2;
        int x;
        int i;
        
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        number = in.nextInt();

        //while
        i = 0;
        x = number + number - 1;
        int c = number  ;
        while(i < number)
        {
            i++;
            if (i == 1)
            {
                format = "%" + number + "s%n";
                System.out.printf(format , a);
            }
            else if (i > 1)
            {
                while (c < x)
                {    
                    c++;
                    a = asterisk + a + asterisk;
                    format2 = "%" + c + "s%n";
                    System.out.printf(format2, a); 
                }
            }
        }

        in.close();
    }
}
