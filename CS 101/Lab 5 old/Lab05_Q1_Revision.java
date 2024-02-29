/*
 * This program prints city plan
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Scanner;

public class Lab05_Q1_Revision {
    public static void main(String[] args) 
    {
        //definitions
        String cityString;
        String cityString2;
        int max = 0;
        int max1;
        char charFind; 
        char charFind2;
        int charNumber2;
        int charNumber;
        String p = "P";
        int lastlength ;
        String sum = "";
        

        //scanner and first prints
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        cityString = in.next();
        System.out.println("City blueprint:");
        cityString2 = cityString;
        
        for (int t = 0; t < cityString2.length(); t++)
        {
            charFind = cityString2.charAt(t);
            charNumber = Character.getNumericValue(charFind);
            String charString2 = String.valueOf(charFind);
            if (charNumber <= 9 & charNumber >= 0)
            {
                sum = sum + charString2;
            }
        }
        
        for (int t = 0; t < sum.length(); t++)
        {
            charFind = sum.charAt(t);
            charNumber = Character.getNumericValue(charFind);
            if (charNumber > max)
            {
                max = charNumber;
            }
        }

        lastlength = cityString.length();
        
        max1 = max - 1;
        for (int y = 0; y < max; y++) 
        {
            for (int x = 0; x < lastlength; x++) 
            {
                
                charFind2 = cityString.charAt(x);
                charNumber2 = Character.getNumericValue(charFind2);
                String charString2 = String.valueOf(charFind2);
                
                if (charString2.equals(p)) 
                {
                    int o = 0;
                    int xx = x +1;
                    charFind2 = cityString.charAt(xx);
                    charNumber2 = Character.getNumericValue(charFind2); 
                    
                    do  
                    {
                        o ++;
                        
                        if (y == max1)
                        {
                            System.out.print("*");   
                        }
                        else 
                        {   
                            System.out.print(" ");
                        }
                        
                    }
                    while (o < charNumber2);
                    
                    
                    x = x +1;
                }
               
                   else { 
                if (y <= max1 & y > max1 - charNumber2)
                {
                    System.out.print("*");   
                }
                else 
                {   
                    System.out.print(" ");
                }
                
            } 
        }
        System.out.println();
        }
        in.close();
    }
}
