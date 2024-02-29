import java.util.Scanner;

public class Lav02_Q3 
{
    public static void main(String[] args) 
    {
        //definations
        String first;
        String middle;
        String last;
        String title;
        String removeBlanks;
        int numberOfCharacters;
        String allUppercase;
        char indexPositionfive;
        String sub;
        char findNemo;
        int firstA;
        int lastA;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the title: ");
        //title = in.nextLine();
        first = in.next(); 
        middle = in.next(); 
        last = in.next();
        title = "    " + first + " " + middle + " " + last + "   ";
        removeBlanks = first + " " + middle + " " + last;

        //equations
        numberOfCharacters = title.length();
        allUppercase = title.toUpperCase();
        indexPositionfive = title.charAt(5);
        sub = title.substring(3,7);
        findNemo = 'a';
        firstA = title.indexOf(findNemo);
        lastA = title.lastIndexOf(findNemo);

        //prints
        System.out.println("-------------------------------");
        System.out.printf("Number of characters: %d%n", numberOfCharacters);
        System.out.printf("All uppercase: %s%n", allUppercase);
        System.out.printf("Remove leading and trailing blank characters: %s%n", removeBlanks);
        System.out.printf("Character at index position 5: %s%n", indexPositionfive);
        System.out.printf("Title from 3rd character to 8th character (not included): %s%n", sub);
        System.out.printf("First occurence of character 'a': %d%n", firstA);
        System.out.printf("Last occurence of character 'a': %d%n", lastA);

        in.close();

    }
}
