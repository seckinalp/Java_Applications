// Seçkin Alp Kargı 22001942
public class Lab01_Q2 
{
    public static void main(String[] args) 
    {
        // Variables
        double expression1;
        double expression2;
        double expression3;
        double pow;

        // First computer calculates expressions
        expression1 = (32.2 - 1.7 / 2.2) / ((1.5 - 7.3) * (4.3 + 2.4));
        expression2 = (73.5 * 16.4 - Math.pow(3,6)) / (34 + Math.pow(2, 5));
        pow = -1.0 / 3.0; // Then we define powder
        expression3 = Math.pow((1.2 + 0.8), pow );
        
        // Now print out the results
        System.out.println("Result of expression 1 is: " + expression1);
        System.out.println("Result of expression 2 is: " + expression2);
        System.out.println("Result of expression 3 is: " + expression3);
    }
}

