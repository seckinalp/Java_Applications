// This is Seçkin Alp Kargı's code for decimal and hexa calculation
import java.util.Scanner;
public class Lab04_Q3_Kargi {
    public static void main(String[] args) 
    {
        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary number (exit to quit): ");
       
        //while loop
        while(in.hasNextLong())
        {
            //Variables
            Long code = in.nextLong();
            Long decimal = (long) 0;
            Long power = (long) 1;
            Long power1 = (long) 1;
            Long decimal1 = (long) 0;
            String hexadecimal = "";
            Long code1 = code;
            Long binary = code;

            //decimal
            while (code != 0) 
            { 
                Long lastOne = code % 10;
                decimal = decimal + lastOne * power;
                power = power * 2;
                code = code / 10;
            }
            
            //hexadecimal
            if (code1 == 0)
            {
                hexadecimal = "0";
            }
            while (code1 != 0)
            {
                Long i = (long) 0;
                decimal1 = (long) 0;
                power1 = (long) 1;
                while (i < 4)
                {
                    Long lastOne1 = code1 % 10;
                    decimal1 = decimal1 + lastOne1 * power1;
                    power1 = power1 * 2;
                    code1 = code1 / 10;
                    i++;
                }
                if (decimal1 > 9 && decimal1 < 16)
                {
                    decimal1 = decimal1 + 55;
                    char letter = (char) (long) decimal1; 
                    hexadecimal = letter + hexadecimal;
                }
                else 
                {
                    hexadecimal = decimal1 + hexadecimal;
                }
            } 

            //prints
            hexadecimal = "#" + hexadecimal;
            System.out.printf("%20s%20s%20s%n", "Binary", "Decimal", "Hexadecimal");
            System.out.printf("%20s%20s%20s%n", binary, decimal, hexadecimal);
            System.out.print("Enter binary number (exit to quit): ");
        }
        
        in.close();
    }
}
