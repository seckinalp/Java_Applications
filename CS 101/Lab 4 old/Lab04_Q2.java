/*
 * This program prints information about palindrome
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab04_Q2 
{
    public static void main(String[] args) 
    {
        //definitions
        String word;
        int numberOfCharacters;
        int half;
        String sub1;
        String sub2;
        String reverse = "";
        
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string: ");
        word = in.nextLine();

        //calculations
        numberOfCharacters = word.length();
        half = numberOfCharacters / 2;
        sub1 = word.substring(0,half);
        int a = numberOfCharacters - half;
        sub2 = word.substring(a,numberOfCharacters);
        int i = sub2.length();

        //while
        while(i > 0)
        {
            i--;
            reverse = reverse + sub2.charAt(i); 
        }

        //if
        if (sub1.equals(reverse))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }

        in.close();
    }
}
