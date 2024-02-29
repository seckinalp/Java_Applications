import java.util.Scanner;

public class Lab02_Q3_Revision 
{
    public static void main(String[] args) 
    {
        //definations
        String warAndPeace;
        String warAndPeace2;
        String warAndPeace3;
        String warAndPeace4;
        String title1;
        String title2;
        String title3;
        String title;
        String removeBlanks;
        int numberOfCharacters;
        String allUppercase;
        char indexPositionfive;
        char indexA;
        String sub;
        char findNemo;
        int firstA;
        int lastA;

        //scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the title: ");
        title1 = in.next();
        title2 = in.next();
        title3 = in.next();
        title = "   " + title1 + " " + title2 + "  " + title3 + "   ";
        removeBlanks = title1 + " " + title2 + "  " + title3;

        //equations
        warAndPeace = "War and Peace";
        numberOfCharacters = title.length();
        allUppercase = title.toUpperCase();
        indexPositionfive = title.charAt(5);
        sub = title.substring(3,7);
        findNemo = 'a';
        firstA = title.indexOf(findNemo);
        lastA = title.lastIndexOf(findNemo);

        //transformation
        warAndPeace2 = warAndPeace.replace("and", "War");
        warAndPeace3 = warAndPeace2.replaceFirst("War", "and");
        indexA = warAndPeace3.charAt(10);
        char c = Character.toUpperCase(indexA);
        warAndPeace4 = warAndPeace3.replace (indexA, c);

        //char[] arr = warAndPeace3.toCharArray();
        //arr[10] = Character.toUpperCase(arr[10]);
        //warAndPeace4 = new String(arr);
    
        //prints
        System.out.println("-------------------------------");
        System.out.printf("Number of characters: %d%n", numberOfCharacters);
        System.out.printf("All uppercase: %s%n", allUppercase);
        System.out.printf("Remove leading and trailing blank characters: %s%n", removeBlanks);
        System.out.printf("Character at index position 5: %s%n", indexPositionfive);
        System.out.printf("Title from 3rd character to 8th character (not included): %s%n", sub);
        System.out.printf("First occurence of character 'a' : %d%n", firstA);
        System.out.printf("Last occurence of character 'a': %d%n", lastA);
        System.out.println(warAndPeace4);

        in.close();

    }
}
