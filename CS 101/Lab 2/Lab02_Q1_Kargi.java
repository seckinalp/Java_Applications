// This is Seçkin Alp Kargı's code for weight calculation
import java.util.Scanner;
public class Lab02_Q1_Kargi 
{
    public static void main(String[] args) 
    {
        //constans
        final double SATURNG = 9.2;
        final double PLUTONG = 0.06;
        final double URANUSG = 8.69;
        final double VENUSG = 0.91;

        //inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of first eathling(kg): ");
        double mass1 = input.nextDouble();
        System.out.print("Enter weight of second eathling(kg): ");
        double mass2 = input.nextDouble();

        //calculation 1
        double saturn1 = SATURNG * mass1;
        double pluton1 = PLUTONG * mass1;
        double uranus1 = URANUSG * mass1;
        double venus1 = VENUSG * mass1;

        //calculation 2
        double saturn2 = SATURNG * mass2;
        double pluton2 = PLUTONG * mass2;
        double uranus2 = URANUSG * mass2;
        double venus2 = VENUSG * mass2;

        //printings
        System.out.printf("%32s%10s%10s%10s%n", "SATURN", "PLUTON", "URANUS", "VENUS");
        System.out.printf("%13s%5.1f%s%10.1f%10.1f%10.1f%10.1f%n", "EARTHLING ONE(", mass1, "kg)", saturn1, pluton1, uranus1, venus1);
        System.out.printf("%13s%5.1f%s%10.1f%10.1f%10.1f%10.1f%n", "EARTHLING TWO(", mass2, "kg)", saturn2, pluton2, uranus2, venus2);
        
        input.close();
    }
}
