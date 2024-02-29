/*
 * This program prints information about design
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q4 
{
    public static void main(String[] args) 
    {
        //definitions
        int number;
        String asterisk = "*";
        String a = "";
       
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        number = in.nextInt();
        
        //while
        int i = 0;
        while(i < number)
        {
            i++;
            a = a + asterisk;
            System.out.println(a);
        }

        in.close();
    }
}
