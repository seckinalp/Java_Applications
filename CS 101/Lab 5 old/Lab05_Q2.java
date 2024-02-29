/*/*
 * This program Blackjack
 * 
 * @author Seçkin Alp Kargı
 */
import java.util.Random;
import java.util.Scanner;

public class Lab05_Q2
{
    public static void main(String[] args) 
    {
        //definitions
        int sumPlayer = 0;
        int sumDealer = 0;
        int a;
        int c = 32;
        String playersHand = "";
        String dealerHand = "";
        String deck = "";
        String u = "0";
        String deck1;
        char chosen;
        String chosenString;
        int chosenInt;
        Random rand;
        int randomChoice;
        int choice = 1;
        
        for ( int y = 0 ; y < 36 ; y ++)
        {
            char charU = u.charAt(0);
            int uuu = Character.getNumericValue(charU);

            if (y % 4 == 0)
            {
                uuu = uuu + 1;
                u = String.valueOf(uuu);
            }
            deck = deck + u;
        }
        
        //scanner and random
        Scanner in = new Scanner(System.in);
        rand = new Random();
        
        //prints
        System.out.println("Starting the game with the following deck:");
        System.out.println(deck);
        System.out.println("");
        System.out.println("Dealer is now dealing cards...");
        System.out.println("Player's hand: ");

        //first 4 card
        for (int i = 0; i < 4; i++)
        {
            a = 36 - i;
            randomChoice = rand.nextInt(a);
            chosen = deck.charAt(randomChoice);
            chosenString = String.valueOf(chosen);
            chosenInt = Character.getNumericValue(chosen);
            deck1 = deck.replaceFirst(chosenString, "");
            deck = deck1;
            if (i < 2)
            {
                System.out.print(chosenString);
                sumPlayer = sumPlayer + chosenInt;
                playersHand = playersHand + chosenString;
            }
            else if (i == 2) 
            {
                dealerHand = dealerHand + chosenString;
                sumDealer = sumDealer + chosenInt;
                System.out.println("");
                System.out.println("Dealer's hand:");
                System.out.printf(chosenString + "?");
                System.out.println("");  
            }
            else if (i == 3)
            {
                sumDealer = sumDealer + chosenInt;
                dealerHand = dealerHand + chosenString;  
            }
        }
        
        //players turn
        do
        {
            System.out.println("");
            System.out.println("Please enter your choice: ");
            System.out.println("1) Hit");
            System.out.println("2) Stand");
            choice = in.nextInt();

            if (choice == 2) 
            { 
                System.out.println("");
                System.out.printf("Stand! Player's turn is now over. Player's hand sums to %d.%n", sumPlayer);
                System.out.println("");
                System.out.println("Dealer is drawing cards...");
                choice = 2;
            }
            if (choice == 1)
            {
                System.out.println("");
                System.out.println("Hit! Dealer is giving the player a card...");
                randomChoice = rand.nextInt(c);
                chosen = deck.charAt(randomChoice);
                chosenString = String.valueOf(chosen);
                chosenInt = Character.getNumericValue(chosen);
                deck1 = deck.replaceFirst(chosenString, "");
                deck = deck1;
                sumPlayer = sumPlayer + chosenInt;
                playersHand = playersHand + chosenString;
                c = c - 1;
                System.out.println("Player's hand:");
                System.out.println(playersHand);
                if (sumPlayer == 21)
                {
                    System.out.println("");
                    System.out.println("Player scored 21. Player wins!"); 
                    choice = 8;
                }
                else if (sumPlayer > 21)
                {
                    System.out.println("");
                    System.out.println("Player scored over 21. Player lost!");
                    choice = 8;
                }
            }
        }
        while (choice == 1);

        //dealers turn
        do
        {
            if (choice == 2){
            randomChoice = rand.nextInt(c);
            chosen = deck.charAt(randomChoice);
            chosenString = String.valueOf(chosen);
            chosenInt = Character.getNumericValue(chosen);
            deck1 = deck.replaceFirst(chosenString, "");
            deck = deck1;
            sumDealer = sumDealer + chosenInt;
            dealerHand = dealerHand + chosenString;
            c = c - 1;

            System.out.println("Dealer's hand: ");
            System.out.println(dealerHand);
            
            if (sumDealer > sumPlayer & sumDealer < 21)
            {
                System.out.println("");
                System.out.println("Dealer scored more than player. Dealer wins!");
                choice = 8;
            }
            else if (sumDealer == 21)
            {
                System.out.println("");
                System.out.println("Dealer scored 21. Dealer wins!"); 
                choice = 8;
            }
            else if (sumDealer > 21)
            {
                System.out.println("");
                System.out.println("Dealer scored over 21. Dealer lost!");
                choice = 8;
            }
        }
        }
        while (choice == 2);
        
        in.close();
    }
}