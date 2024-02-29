/*
 * This program prints information about fibonnacci
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q1 
{
    public static void main(String[] args) 
    {
        //definitions
        int n;
        int i;
        int n1;
        int n2;
        int n3;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        n = in.nextInt();

        //while
        i = 0;
        n1 = 0;
        n2 = 1;

        while (i < n)
        {
            i++;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
        }
        
        System.out.printf("Fib(" + n +") is " + n1);

        in.close();
    }
}