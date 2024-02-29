// This is Seçkin Alp Kargı's code for boarding
import java.util.Scanner;
public class Lab03_Q1_Kargi 
{
    public static void main(String[] args) 
    {
        String writing = "BOARDING GROUP ";

        //Scanner, inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter names of passengers: ");
        String firstInput = input.nextLine();
        
        //Choosing names
        String names = firstInput.trim();
        int numberOfNames = names.length();
        String nameFinding1 = names.substring(0, names.indexOf("-") - 1);
        String name1 = nameFinding1.trim();
        String nameFinding2 = names.substring(names.indexOf("-") + 1,numberOfNames);
        String name2 = nameFinding2.trim();
        
        //calculation
        if (name1.compareToIgnoreCase("A") > 0 && name1.compareToIgnoreCase("F") < 0 || name2.compareToIgnoreCase("A") > 0 && name2.compareToIgnoreCase("F") < 0)
        {
            System.out.println(writing + "1");
        }
        else if (name1.compareToIgnoreCase("G") > 0 && name1.compareToIgnoreCase("N") < 0 || name2.compareToIgnoreCase("G") > 0 && name2.compareToIgnoreCase("N") < 0)
        {
            System.out.println(writing + "2");
        }
        else if (name1.compareToIgnoreCase("O") > 0 && name1.compareToIgnoreCase("T") < 0 || name2.compareToIgnoreCase("O") > 0 && name2.compareToIgnoreCase("T") < 0)
        {
            System.out.println(writing + "3");
        }
        else if (name1.compareToIgnoreCase("U") > 0 && name1.compareToIgnoreCase("Z") < 0 || name2.compareToIgnoreCase("U") > 0 && name2.compareToIgnoreCase("Z") < 0)
        {
            System.out.println(writing + "4"); 
        }
        
        /*
        int determinative = 0;
        char name1FirstLetter = name1.charAt(0);
        char name2FirstLetter = name2.charAt(0);
        char name1FirstLetterUp = Character.toUpperCase(name1FirstLetter);
        char name2FirstLetterUp = Character.toUpperCase(name2FirstLetter);
        int name1FirstLetterInt = name1FirstLetterUp;
        int name2FirstLetterInt = name2FirstLetterUp;

        if (name1FirstLetterInt > name2FirstLetterInt)
        {
            determinative = name2FirstLetterInt;
        }
        else if (name2FirstLetter > name1FirstLetterInt)
        {
            determinative = name1FirstLetterInt;
        }
        else 
        {
            determinative = name1FirstLetterInt;
        }

        if ( determinative > 64 && determinative < 71)
        {
            System.out.println(writing + "1");
        }
        else if ( determinative > 70 && determinative < 79)
        {
            System.out.println(writing + "2");
        }
        else if ( determinative > 78 &&  determinative < 85)
        {
            System.out.println(writing + "3");
        }
        else
        {
            System.out.println(writing + "4");
        }
        */
        
        input.close();
    }
}
