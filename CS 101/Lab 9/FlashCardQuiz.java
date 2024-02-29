import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class FlashCardQuiz 
{
    public static Scanner input1 = new Scanner(System.in);

    static ArrayList<FlashCard> cardList = new ArrayList<FlashCard>();
    

    static ArrayList<FlashCard> quizList = new ArrayList<FlashCard>();

    Player p = new Player("seckin");


    String fileName ;
    static Player p1;


    FlashCardQuiz(String fileName, Player p1) throws FileNotFoundException
    {
        this.fileName = fileName;
        FlashCardQuiz.p1 = p1;
        
        loadCards();
        initializeQuiz();
    }

    public  static void loadCards() throws FileNotFoundException
    {
       
        Scanner sc = new Scanner(new File("turkish_english_words.txt"));
      
        int ii = 1;
        while (ii < 983)
        {
            FlashCard fc = new FlashCard(sc.next(), sc.next(), Integer.valueOf(sc.next()));
            cardList.add(fc);
            ii++;
        } 
    }
    
    public static void initializeQuiz()
    {
        quizList.removeAll(quizList);
        System.out.print("Enter the number of flash cards to generate: ");
        int x = input1.nextInt();
        Random rand = new Random();
        ArrayList<Integer> ints =  new ArrayList<Integer>();
        for (int i = 0; i < x; i++)
        {
            int a = rand.nextInt(900);
            if(!ints.contains(a))
            {
                ints.add(a);
                quizList.add(cardList.get(a));
            }
            else 
            {
                i--;
            }

        }
    }
    public void takeQuiz()
    {
        int check = 0;
        for(int a = 0; a < quizList.size(); a++)
        {
            
            String question = quizList.get(a).getQuestion();
            FlashCard f1 = new FlashCard(question, "aaaa", 3);
            f1.showFlashCard();
            System.out.print("Answer: ");
            String answer = input1.next();
            if (answer.equals(quizList.get(a).getAnswer()))
            {
                System.out.println("Corect!");
                check ++;
            }
            else
            {
                System.out.println("Wrong Answer");
                
                String answertrue = quizList.get(a).getAnswer();
                FlashCard f2 = new FlashCard(question, answertrue, 3);
                f2.flipFlashCard();
                
            }
        }
        System.out.println("Your score: " + check + "/" + quizList.size());
        p1.increaseGamesPlayed();
        p1.setHighScore(check);
    }

    

}
