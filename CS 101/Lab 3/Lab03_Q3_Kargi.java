// This is Seçkin Alp Kargı's code for the game
import java.util.Scanner;
public class Lab03_Q3_Kargi
 {
    public static void main(String[] args) 
    {
        //constants
        final String writing1 = "I don't understand, \"";
        final String writing2 = "\" is not a valid answer.";
        final String writing3 = "Is the object bigger than a shoe box?";
        final String writing4 = "Answer: ";
        
        //scanner
        Scanner input = new Scanner(System.in);
        System.out.printf("Is the oject an Animal/Vegetabe/Mineral? %n%s", "Answer: ");
        String answer1 = input.next();

        // if statement, choosing part
        if (answer1.equalsIgnoreCase("Animal") )
        {
            System.out.printf("%s%n%s", writing3, writing4);
            String answer2 = input.next();
            if (answer2.equalsIgnoreCase("yes"))
            {
                System.out.println("You're thinking of a elephant right?");
            }
            else if(answer2.equalsIgnoreCase("no"))
            {
                System.out.println("I know, it's a squirrel!");
            }
            else
            {
                System.out.println(writing1 + answer2 + writing2);
            }
        }
        else if (answer1.equalsIgnoreCase("Vegetable"))
        {
            System.out.printf("%s%n%s", writing3, writing4);
            String answer2 = input.next();
            if (answer2.equalsIgnoreCase("yes"))
            {
                System.out.println("You're thinking of a pumpkin right?");
            }
            else if(answer2.equalsIgnoreCase("no"))
            {
                System.out.println("I know, it's a carrot!");
            }
            else
            {
                System.out.println(writing1 + answer2 + writing2);
            }
        }
        else if (answer1.equalsIgnoreCase("mineral"))
        {
            System.out.printf("%s%n%s", writing3, writing4);
            String answer2 = input.next();
            if (answer2.equalsIgnoreCase("yes"))
            {
                System.out.println("You're thinking of a bus right?");
            }
            else if(answer2.equalsIgnoreCase("no"))
            {
                System.out.println("I know, it's a pencil!");
            }
            else
            {
                System.out.println(writing1 + answer2 + writing2);
            }
        }
        else
        {
            System.out.println(writing1 + answer1 + writing2);
        }

        input.close();
    }
}
