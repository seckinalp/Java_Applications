// This is Seçkin Alp Kargı's code for calories
import java.util.Scanner;
public class Lab02_Q3_Kargi 
{
    public static void main(String[] args) 
    {
        //constants
        final double PAL = 1.4;
        final double FAT_CALORIE_RATIO = 0.3;
        final double PROTEIN_CALORIE_RATIO = 0.25;
        final double CARB_CALORIE_RATIO = 0.45;

        //inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight(kg), height(cm) and age: ");
        int weight = input.nextInt();
        int height = input.nextInt();
        int age = input.nextInt();

        //calculations
        double bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        double calories = bmr * PAL;
        double targetFatCalorie = calories * FAT_CALORIE_RATIO;
        double targetProteinCalorie = calories * PROTEIN_CALORIE_RATIO;
        double targetCarbsCalorie = calories * CARB_CALORIE_RATIO;
        double gramsFat = targetFatCalorie / 9;
        double gramsProtein = targetProteinCalorie / 4;
        double gramsCarbs = targetCarbsCalorie / 4;

        //prints
        System.out.printf("Calories Required: %19.2f\n" , calories);
        System.out.printf("%18s%20.2f\n" , "GRAMS PROTEIN:", gramsProtein);
        System.out.printf("%18s%20.2f\n" , "GRAMS FAT:", gramsFat);
        System.out.printf("%18s%20.2f\n" , "GRAMS CARBS:", gramsCarbs);
        
        input.close();
    }
}
