import java.util.Scanner;

public class Diary 
{
    public static void main(String[] args) 
    {
        String s = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        s = in.nextLine();
        int numberOfPage = Integer.parseInt(s);
        System.out.print("Enter page size: ");
        s = in.nextLine();
        int lengthOfsentence = Integer.parseInt(s);
        Notebook deathnote = new Notebook(numberOfPage, lengthOfsentence);
        int choice = 1;
        int sek = 0;
        while (choice != 3)
        {
            System.out.println("---------------------------------------------");
            System.out.println("What do you want to do?");
            System.out.println("(1) Take a note");
            System.out.println("(2) Browse notebook");
            System.out.println("(3) Exit ");
            System.out.print("Your choice: ");
            s = in.nextLine();
            choice = Integer.parseInt(s);
        
            if (choice == 1)
            {
                System.out.print("Enter note: ");
                String userNote = in.nextLine();
                if (sek < numberOfPage)
                {
                deathnote.writeNote(userNote);
                sek++;
                }
                else
                {
                    System.out.println("Notebook full! No pages remaining!");
                }
            }

            else if (choice == 2)
            {
                System.out.println("Here's your Notebook: ");
                deathnote.printNotebook();
                
            }

            else if (choice == 3)
            {
                System.out.println("");
                System.out.println("Goodbye...");
            }
        }
        in.close();
    }
}
