/*
 * This program prints information about integers
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q3_Revision 
{
    public static void main(String[] args)   
    {
        //definitions
        int n;  
        int c;
        int max;
        int min;
        int t;
        int k;
        double average;
        double sum;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        n = in.nextInt();
    
        //while
        t = 1;
        sum = 0;
        k = 0;
        while(t == 1)
        {
            System.out.print("Please input a positive integer: ");
            c = in.nextInt();
            if(c == n)
            {
                t = 0;
            }
            else
            {
                k++;
                sum = sum  + c;  
                if (c < min)
                {
                    min = c;
                }
                if (c > max)
                {
                    max = c;
                }
            }
        } 
        
        //average calculation
        average = sum / k;

        //prints
        System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
        System.out.printf("Average: %.1f%n", average);

        in.close();
   }
}
