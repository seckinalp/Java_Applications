// This is Seçkin Alp Kargı's code for names
import java.util.Scanner;
public class Lab04_Q1_Kargi {
    
    public static void main(String[] args) {
        
        //constants
        final String noData = "Not enough input data...";

        //scanner and strings
        Scanner in = new Scanner(System.in);
        System.out.println("Enter strings (exit to stop) :");
        
        String input = in.next();
        String firstWord = input;
        String secondWord = "ztest-";

        //check for exit
        if (input.equalsIgnoreCase("Exit"))
        {
            System.out.println(noData);
        }
        else
        {
            input = in.next();

            //while loop
            while(!input.equalsIgnoreCase("Exit"))
            {
               if(input.compareToIgnoreCase(firstWord) < 0)
               {
                    secondWord = firstWord;
                    firstWord = input;
               }
               else if (input.compareToIgnoreCase(firstWord) > 0 && input.compareToIgnoreCase(secondWord) <= 0)
               {
                   secondWord = input;
               }
               
               input = in.next();
            }

            //check for second world is changed
            if(!secondWord.equals("ztest-"))
            {
                System.out.println("String that comes second alphabetically: " + secondWord);
            }
            else
            {
                System.out.println(noData);
            }
        }
        
        in.close();
    }
}
