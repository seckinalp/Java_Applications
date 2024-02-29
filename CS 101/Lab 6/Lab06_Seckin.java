// This is Seçkin Alp Kargı's code for soundEx finding
import java.util.Scanner;
public class Lab06_Seckin 
{
    /** * This is a simple description of the isAlphaWord
    * @param word check for alpabetical
    * @return true or false if alpabetical true if not false
    */
    public static Boolean isAlphaWord(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char k = word.charAt(i);
            if (!(k >= 'A' && k <= 'Z') && !(k >= 'a' && k <= 'z')) 
            {
                return false;
            }
        }
        
        return true;
    }
    
    /** * This is a simple description of the method getCode
    * @param x check for soundEx algoritm
    * @return 1,2,3,4,5,6,-1 according the soundEx algoritm
    */
    public static int getCode(char x)
    {
		if ( x == 'B' || x == 'F' || x == 'P' || x == 'V' || x == 'b' || x == 'f' || x == 'p' || x == 'v')
        {
            return 1;
        }
        else if ( x == 'C' || x == 'c' || x == 'G' || x == 'g' || x == 'j' || x == 'J' || x == 'K' || x == 'k' || x == 'Q' || x == 'q' || x == 'S' || x == 's' || x == 'X' || x == 'x' || x == 'Z' || x == 'z')
        {
            return 2;
        }
        else if ( x == 'D' || x == 'd' || x == 'T' || x == 't')
        {
            return 3;
        }
        else if ( x == 'L' || x == 'l' )
        {
            return 4;
        }
        else if ( x == 'M' || x == 'm' || x == 'N' || x == 'n')
        {
            return 5;
        }
        else if ( x == 'R' || x == 'r')
        {
            return 6;
        }
        return -1;
	}
    
    /** * This is a simple description of the method buildCode
    * @param word0 we use chars at word0
    * @return word0 edited word 0 according to getCode method
    */
    public static String buildCode(String word0)
    {
      	for (int c = 0; c < word0.length(); c++)
        {
            
            char x = word0.charAt(c);
            if (getCode(x) == 1)
            {
                word0 = word0.replace(x , '1');
            }
            else if (getCode(x) == 2)
            {
                word0 = word0.replace(x , '2');
            }
            else if (getCode(x) == 3)
            {
                word0 = word0.replace(x , '3');
            }
            else if (getCode(x) == 4)
            {
                word0 = word0.replace(x , '4');
            }
            else if (getCode(x) == 5)
            {
                word0 = word0.replace(x , '5');
            }
            else if (getCode(x) == 6)
            {
                word0 = word0.replace(x , '6');
            }
        }
        return word0;
    }

    /** * This is a simple description of the method removeAdjacentDuplicates
    * @param word2 check for duplicates
    * @return word2 edited version of word2 remove duplicates
    */
    public static String removeAdjacentDuplicates(String word2)
    {
        word2 = word2.toUpperCase();
        String wordx = "";
        String wordy = "";
        for (int p = 0; p < word2.length() - 1; p++)    
        {   
            char charFind2 = word2.charAt(p);
            char charFind3 = word2.charAt(p + 1);   
            if (charFind2 == charFind3)
            {
            wordx = word2.substring(p + 2, word2.length());
            wordy = word2.substring(0, p + 1);
            word2 = wordy + wordx;
            }
        }     
        return word2;
    }
 
    /** * This is a simple description of the method removeLetters
    * @param update, lettersRemove update is what we change according to lettersRemove
    * @return update updated version of update
    */
    public static String removeLetters(String update, String lettersRemove)
    {
        String wordxx;
        String wordyy;
        update = update.toLowerCase();
        lettersRemove = lettersRemove.toLowerCase();   
        for(int y = 0; y < lettersRemove.length(); y++)
        {
            char lettersRemove1 = lettersRemove.charAt(y);
            for(int x = 0; x < update.length(); x++)
            {
                char update1 = update.charAt(x);
                if (lettersRemove1== update1)
                {
                    wordxx = update.substring(x + 1, update.length());
                    wordyy = update.substring(0, x);
                    update = wordyy + wordxx;
                    x = x - 1;
                }

            }
        }
        
        return update;
    }
    
    /** * This is a simple description of the method padCode
    * @param word5 is what we changed
    * @return word6 is new code after the usage of padCode calculation
    */
    public static String padCode(String word5)
    {
        String word6 = "";
        if (word5.length() >= 4)
        {
            word6 = word5.substring(0, 4);
        }
        else if (word5.length() == 3)
        {
            word6 = word5 + "0";
        }
        else if (word5.length() == 2)
        {
            word6 = word5 + "00";
        }
        else if (word5.length() == 1)
        {
            word6 = word5 + "000";
        }
        else 
        {
            word6 = "0000";
        }
        return word6;
    }

    /** * This is a simple description of the method getSoundex
    * @param word7 what we will change
    * @return soundEx our result according to soundEx
    */
    public static String getSoundex(String word7)
    {
        if (isAlphaWord(word7))
        {   word7 = removeAdjacentDuplicates(word7);
            String firstLetter = word7.substring(0,1);
            firstLetter = firstLetter.toUpperCase();
            String others = word7.substring(1, word7.length());
            others = buildCode(others);
            others = removeLetters(others, "hwyaeiuo");
            String soundEx = firstLetter + others;
            soundEx = padCode(soundEx);
            return soundEx;
        }
        else
        {
            word7 = "";
            return word7;
        } 
    }

    public static void main(String[] args) 
    {
        String input = "";
        Scanner in = new Scanner(System.in);

        //while for checking exit
        while (!input.equalsIgnoreCase("exit"))
        {   
            System.out.print("Enter a string: ");
            input = in.next();
            if (getSoundex(input) == "")
            {
                System.out.printf("%s\n\n", "Characters must be alphabetic...");   
            }
            else
            {
                System.out.printf("%s\n\n","Soundex: " + getSoundex(input));
            }
        }
        
        //if it is exit we print special thing
        if (input.equalsIgnoreCase("exit"))
        {
            System.out.printf("\n%s", "Goodbye!");
        }
       
        in.close();
    }
}