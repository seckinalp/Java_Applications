// This is Seçkin Alp Kargı's code for longest word
import java.util.Scanner;
public class Lab04_Q2_Kargi 
{
    public static void main(String[] args) 
    {
        //scanner and variables
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        
        String sentence = in.nextLine();
        sentence = sentence + " ";
        int length = sentence.length();
        int check1 = 0;
        String longest = "";
        String x1 = "", x3 = "";
        int x1Lenghth = 0,x3Length = 0;
        //while loop
        while (length != 0)
        {
            int blank = sentence.indexOf(" ");
            String x2 = sentence.substring(0, blank + 1);
            int x2L = x2.length();
            if(x2L == 2)
            {
                x1 = x2.substring(0);
                x1Lenghth = 1;
                x3 = x1.replaceAll("[^a-zA-Z]", "");
                x3Length = 1;
            }
            else
            {
                x1 = sentence.substring(0, blank);
                x1Lenghth = x1.length();
                x3 = x1.replaceAll("[^a-zA-Z]", "");
                x3Length = x3.length();
            }
            //check for numbers
            if (x3Length == x1Lenghth)
            {
                if (x1Lenghth > check1)
                {
                    longest = x1;
                    check1 = x1Lenghth;
                }
            }
            sentence = sentence.replace(x2 , "");
            length = sentence.length();
        }

        //check for a change at longest
        if (longest.equals(""))
        {
            System.out.print("-> longest block is zero");
        }
        else
        {
        System.out.print("-> longest block is " + check1);
        }

        in.close();
    }
}
