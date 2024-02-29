public class Lab01_Q3_Revision
{
    public static void main(String[] args) 
    {
        // These are constants so I use final
        final long TOTAL_AREA_OF_WORLD;
        final double AREA_OF_TURKEY;

        // Variables
        double waterPercentageOfWorld;
        double turkeyWaterPercentage;
        double worldWater;
        double worldDry;
        double turkeyWater;
        double turkeyDry;
        double turkeyWorldDryPercentage;
        double turkeyWorldWaterPercentage;

        // First define informations that we know
        TOTAL_AREA_OF_WORLD = 510072000;
        waterPercentageOfWorld = 70.8 / 100;
        AREA_OF_TURKEY = 783469;
        turkeyWaterPercentage = 1.3 / 100;

        // Then I make the computer calculate the desired expressions 
        worldWater = TOTAL_AREA_OF_WORLD * waterPercentageOfWorld;
        worldDry = TOTAL_AREA_OF_WORLD - worldWater;
        turkeyWater = AREA_OF_TURKEY * turkeyWaterPercentage;
        turkeyDry = AREA_OF_TURKEY - turkeyWater;
        turkeyWorldDryPercentage = (turkeyDry * 100) / worldDry;
        turkeyWorldWaterPercentage = (turkeyWater * 100) / worldWater;

        // Use long for sensitive calculations
        long worldWaterLong = (long) worldWater;
        long worldDryLong = (long) worldDry;
        long turkeyWaterLong = (long) turkeyWater;
        long turkeyDryLong = (long) turkeyDry;

        // Finally print out the informations
        System.out.println( "Earth has " + worldDryLong + " km2 dry land and " + worldWaterLong + " km2 water." );
        System.out.println( "Turkey has " + turkeyDryLong + " km2 dry land and " + turkeyWaterLong + " km2 water." );    
        System.out.println( "Turkey has " + turkeyWorldDryPercentage + " percent of the Earth's dry land." );
        System.out.println( "Turkey has " + turkeyWorldWaterPercentage + " percent of the Earth's water." );
    }
}
