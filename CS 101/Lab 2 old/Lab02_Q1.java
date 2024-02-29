import java.util.Scanner;

public class Lab02_Q1 
{

    public static void main(String[] args) 
    {
        //variables
        double rectangleHeight;
        double rectangleArea;
        double rectangleCircumference;
        double rectangleDioganal;
        double rectangleWidth;
        String COLON;
        
        //scanner and inputs
        Scanner rectangle = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        rectangleWidth = rectangle.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        rectangleHeight = rectangle.nextDouble();
        
        //calculations
        rectangleArea = rectangleHeight * rectangleWidth;
        rectangleCircumference = (rectangleHeight + rectangleWidth) * 2;
        rectangleDioganal = Math.sqrt((Math.pow(rectangleHeight, 2)+Math.pow(rectangleWidth, 2)));
        COLON = ":";
        
        //prints
        System.out.printf("%-40s%s%14.3f%n", "The area of the rectangle is", COLON , rectangleArea);
        System.out.printf("%-40s%s%14.3f%n", "The circumference of the rectangle is", COLON, rectangleCircumference);
        System.out.printf("%-40s%s%14.3f%n", "The diagonal of the rectangle is", COLON, rectangleDioganal);

        //close scanner
        rectangle.close();

    } 
}