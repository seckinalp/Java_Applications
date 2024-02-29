import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FlashCardApp {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Player> playerArray = new ArrayList<Player>();
        Scanner inp = new Scanner(System.in);
        Player p1 = new Player("");
        int choice = 0;
        while (choice != 3)
        {
        System.out.println(" ");
        System.out.println("1 - Play Game");
        System.out.println("2 - View");
        System.out.println("3 - Quit");
        System.out.print("Choice: ");
        choice = inp.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter player name: ");
            String playerNamee = inp.next();
            p1 = new Player(playerNamee);
             
            playerArray.add(p1);
            FlashCardQuiz fck = new FlashCardQuiz("turkish_english_words.txt", p1);
            fck.takeQuiz();
            

        }
        else if (choice == 2)
        {
            if (p1.equals(p1))
            {
                p1.increaseGamesPlayed();
                p1.setHighScore(p1.getHighScore());
                System.out.println(p1.toString());
            } 
            else
            {
                System.out.println(p1.toString());
            }
        }
        else if (choice == 3)
        {

        }
    }
        inp.close();

    }
}
