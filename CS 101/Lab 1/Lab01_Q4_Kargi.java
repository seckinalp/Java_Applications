// This is Seçkin Alp Kargı's code for fibonnaci

public class Lab01_Q4_Kargi 
{
    public static void main(String[] args) 
    {
        //constans
        final double GOLDEN_RATIO = ((1 + Math.sqrt(5)) / 2);
        double REVERSE_GOLDEN_RATIO = -1 / GOLDEN_RATIO;
        
        // calculations
        int n = 100;
        double fibonnacci = (Math.pow(GOLDEN_RATIO, n) - Math.pow(REVERSE_GOLDEN_RATIO, n) ) / Math.sqrt(5);
        
        //prints
        System.out.println("Fibonnacci (" + n + ") is " + fibonnacci);
    }
}
