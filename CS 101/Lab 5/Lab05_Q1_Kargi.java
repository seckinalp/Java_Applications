// This is Seçkin Alp Kargı's code for special number or vowel number calc
import java.util.Scanner;
public class Lab05_Q1_Kargi 
{
    public static void main(String[] args) 
    {
        //constants
        final String sentence1 = "1 - Special Number";
        final String sentence2 = "2 - Vowel Word";
        final String sentence3 = "3 - Quit";
        final String sentence4 = "Choice must be between 1 and 3!";
        final String sentence5 = "Enter number: ";
        final String sentence6 = "Enter word: ";
        final String sentence7 = "Enter choice:";
        final String sentence8 = "Menu:";
        final String empty = "";

        //variables
        int number = 0;
        int input = 0;

        //scanner
        System.out.printf("%n%s%n%-8s%s%n%-8s%2s%n%-8s%s%n", sentence8, empty, sentence1, empty, sentence2, empty, sentence3);
        Scanner in = new Scanner(System.in);
        
        //do while loop
        do
        {
            System.out.print(sentence7);
            input = in.nextInt();

            //calculation for special number
            if (input == 1)
            {
                System.out.print(sentence5);
                do
                {
                    number = in.nextInt();
                    if(number > 999 & number < 10000)    
                    {
                        int reverse = 0;
                        for (int number1 = number; number1 > 0; number1 /= 10)
                        {
                            int last = number1 % 10;
                            reverse = reverse * 10 + last;
                        }
                        int number3 = 4 * number;

                        if (number3 == reverse)
                        {
                            System.out.println(number + " is a very special number");
                        }
                        else
                        {
                            System.out.println(number + " is not a very special number");
                        }
                    }      
                    else
                    {
                        System.out.print(sentence5);
                    }    
                } 
                while (number < 999 || number > 10000);
            }

            //calculation for vowel word
            else if ( input == 2)
            {
                System.out.print(sentence6);
                String word = in.next();
                word = word.toLowerCase(); 
                /*
                int a = word.indexOf("a");
                int e = word.indexOf("e");
                int i = word.indexOf("i");
                int o = word.indexOf("o");
                int u = word.indexOf("u");
                if (o >= 0 & u >= 0 & i >= 0 & e >= 0 & a >= 0)
                {
                    System.out.println(word + " is a vowel word");
                }
                else
                {
                    System.out.println(word + " is not a vowel word");
                }
                */
                if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u"))
                {
                    System.out.println(word + " is a vowel word");
                }
                else
                {
                    System.out.println(word + " is not a vowel word");
                }
            }

            //exit option
            else if (input == 3)
            {
                System.out.println("Goodbye!");
            }

            //wrong option
            else
            {
                System.out.println(sentence4);
            }

            //print menu
            if (input != 3)
            {
            System.out.printf("%n%s%n%-8s%s%n%-8s%2s%n%-8s%s%n", sentence8, empty, sentence1, empty, sentence2, empty, sentence3);
            }
        }
        while (input != 3);

        in.close();
    }
}
