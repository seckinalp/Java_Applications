import java.util.Scanner;

public class Lab02_Q2 
{
    public static void main(String[] args) 
    {
        //definations
        final int PERCENTAGE_OF_OIL;
        final int PERCENTAGE_OF_BATTERY;
        final int PERCENTAGE_OF_BRAKES;
        final int PERCENTAGE_OF_TIRE;
        final int PERCENTAGE_OF_OTHER;
        final String TOTAL;
        String PERCENTAGE = "%";
        int oilChangeMaintain;
        int batteryMaintain;
        int brakesMaintain;
        int tireMaintain;
        int otherMaintain;
        int totalMaintain;
        String STAR;

        //scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers: ");
        int carInput = input.nextInt();

        //values
        PERCENTAGE_OF_OIL = 30;
        PERCENTAGE_OF_BATTERY = 15;
        PERCENTAGE_OF_BRAKES = 25;
        PERCENTAGE_OF_TIRE = 13;
        PERCENTAGE_OF_OTHER = 17;
        TOTAL = "TOTAL";
        PERCENTAGE = "%";
        STAR = "*";

        //calculations
        oilChangeMaintain = carInput * PERCENTAGE_OF_OIL / 100;
        batteryMaintain = carInput * PERCENTAGE_OF_BATTERY / 100;
        brakesMaintain = carInput * PERCENTAGE_OF_BRAKES / 100;
        tireMaintain = carInput * PERCENTAGE_OF_TIRE / 100;
        otherMaintain = carInput * PERCENTAGE_OF_OTHER / 100;
        totalMaintain = carInput / 10;
        
        //prints
        System.out.println("***********************************************");
        System.out.println("***** Maintenance Cost Distribution Table *****");
        System.out.printf("*Oil Change %10s%d%15d%8s%n", PERCENTAGE, PERCENTAGE_OF_OIL, oilChangeMaintain, STAR);
        System.out.printf("*Battery %13s%d%15d%8s%n", PERCENTAGE, PERCENTAGE_OF_BATTERY, batteryMaintain, STAR);
        System.out.printf("*Brakes %14s%s%15d%8s%n", PERCENTAGE, PERCENTAGE_OF_BRAKES, brakesMaintain, STAR);
        System.out.printf("*Tire %16s%s%15d%8s%n", PERCENTAGE, PERCENTAGE_OF_TIRE, tireMaintain, STAR);
        System.out.printf("*Other %15s%s%15d%8s%n", PERCENTAGE, PERCENTAGE_OF_OTHER, otherMaintain, STAR);
        System.out.printf("* %24s%13d%8s%n",TOTAL,totalMaintain, STAR);
        System.out.println("***********************************************");

        input.close();

    }
}
