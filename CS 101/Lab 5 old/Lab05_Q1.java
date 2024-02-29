/*
 * This program prints city plan
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab05_Q1 
{
    public static void main(String[] args) 
    {
        //definitions
        String cityString;
        int max = 0;
        int max1;
        char charFind; 
        char charFind2;
        int charNumber2;
        int charNumber;

        //scanner and first prints
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        cityString = in.next();
        System.out.println("City blueprint:");
        
        //for loops
        for (int t = 0; t < cityString.length(); t++)
        {
            charFind = cityString.charAt(t);
            charNumber = Character.getNumericValue(charFind);
            if (charNumber > max)
            {
                max = charNumber;
            }
        
        }
        for (int y = 0; y < max; y++) 
        {
            for (int x = 0; x < cityString.length(); x++) 
            {
                charFind2 = cityString.charAt(x);
                charNumber2= Character.getNumericValue(charFind2);
                max1 = max - 1;
                if (y <= max1 & y > max1 - charNumber2)
                {
                    System.out.print("*");   
                }
                else 
                {   
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}