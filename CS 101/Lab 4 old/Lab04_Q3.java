/*
 * This program prints information about integers
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q3 
{
    public static void main(String[] args) 
    {
        //definitions
        int n;  
        int a;
        int max;
        int min;
        double average;
        double sum = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        n = in.nextInt();
        System.out.printf ("Now input %d positive integers: %n", n);
        
        //while
        int i = 0;
        while(i < n)
        {
            i++;
            a = in.nextInt(); 
            sum = sum  + a;  
            if (a < min)
            {
                min = a;
            }
            if (a > max)
            {
                max = a;
            }
        } 
    
        //average calculation
        average = sum / n;

        //prints
        System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
        System.out.printf("Average: %.1f%n", average);

        in.close();
    }
}

