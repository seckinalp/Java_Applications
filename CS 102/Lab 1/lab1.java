import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class lab1 {

    public static void main(String[] args) throws IOException {
        int check = 0;
        Scanner in = new Scanner(System.in);
    
        while (check!=5)
        {
            System.out.println();
            System.out.println();
            System.out.println(" ....................................Math Solver..............................................");
            System.out.println("1 - First Problem");
            System.out.println("2 - Second Problem");
            System.out.println("3 - Third Problem");
            System.out.println("4 - Options");
            System.out.println("5 - Quit");
            System.out.print("--> ");
            check = in.nextInt();
            if(check == 1)
            {
                System.out.println("Question 1 --> Around a rectangular flowerbed with dimensions X meters and Y meters are to \n be planted roses equally spaced so that the roses are found in every corner of the  \n flowerbed and consumed as little as possible. At what distance are planted roses?");
                System.out.println();

                System.out.print("Please Enter X: ");
                int x = in.nextInt();
                System.out.print("Please Enter Y: ");
                int y = in.nextInt();

                int answer = greatCommonDivisorFinder(x, y);

                System.out.println();
                System.out.println();
                System.out.println(" .....................................Answer................................................");
                System.out.println("--> " + answer);
                System.out.println(" .................................Solving Steps.............................................");
                System.out.println("1) First understand the elements: We have rectangle, " + x + " meters and " + y + " meters");
                System.out.println("2) If we want plant equally distance should be divisor of both " + x + " and " + y);
                System.out.println("3) We want to most efficient way so the divisor should be great common divisor");
                System.out.println("4) We are checking every divisor of " + x + " and " + y + " for finding to great common divisor");
                System.out.println("The answer is --> " + answer);
            }
            else if(check == 2)
            {
                System.out.println("Question 2 --> Find whole numbers between A and B that are divisible by X, Y, and Z.");
                System.out.println();

                System.out.print("Please Enter A: ");
                int a = in.nextInt();
                System.out.print("Please Enter B: ");
                int b = in.nextInt();
                System.out.print("Please Enter X: ");
                int x = in.nextInt();
                System.out.print("Please Enter Y: ");
                int y = in.nextInt();
                System.out.print("Please Enter Z: ");
                int z = in.nextInt();

                String answer = sameDivisorFinderInCertainRange(a, b, x, y, z);
                
                System.out.println();
                System.out.println();
                System.out.println(" .....................................Answer................................................");
                System.out.println("--> " + answer);
                System.out.println(" .................................Solving Steps.............................................");
                System.out.println("1) First understand the elements: We have range, " + a + " and " + b + " and we have divisors:  " + x + " " + y + " " + z);
                System.out.println("2) If we want to find that number we should check every number in  " + a + " and " + b + " for they are divisible to " + x + " " + y + " " + z + " or not");
                System.out.println("3) The computer is checking ... ");
                System.out.println("The answer is --> " + answer);
            }
            else if(check == 3)
            {
                System.out.println("Question 3 --> Louise is X years old. Her daughter is Y years old. In how many years will Louise be double her daughter’s age?");
                System.out.println();

                System.out.println("Please Enter X: ");
                int x = in.nextInt();
                System.out.println("Please Enter Y: ");
                int y = in.nextInt();
                
                int answer = whenDoubleYourAge(x, y);

                System.out.println();
                System.out.println();
                System.out.println(" .....................................Answer................................................");
                System.out.println("--> " + answer);
                System.out.println(" .................................Solving Steps.............................................");
                System.out.println("1) First understand the elements: We have two age, " + x + " and " + y + " and we want to know when double ");
                System.out.println("2) We can use one equation to find this: x - ( 2 * y )");
                System.out.println("3) But this is work for only if (2 * y) < x) because in other cases there are no solution");
                System.out.println("4) We are solving to equation for this question " + x + " - (2 * " + y + ")");
                System.out.println("The answer is --> " + answer);
            }
            else if(check == 4)
            {
                Random random = new Random();
                System.out.print("Please Enter the txt file name --> ");
                String fileName = in.next();
                String txtFile = fileName + ".txt";

                FileWriter fileWrite = new FileWriter (txtFile);
                BufferedWriter bufferWrite = new BufferedWriter (fileWrite);
                PrintWriter outTxtFile = new PrintWriter (bufferWrite);

                int counter = 0;
                int q = 1;
                while(counter !=5)
                {
                    System.out.println();
                    System.out.println("1 --> Around a rectangular flowerbed with dimensions X meters and Y meters......");
                    System.out.println("2 --> Find whole numbers between A and B that are divisible by X, Y, and Z.");
                    System.out.println("3 --> Louise is X years old. Her daughter is Y years old. In how many years will Louise be double her daughter’s age?");
                    System.out.println();
                    System.out.print("Choose Question Template for " + q + ". question --> ");
                    int choice = in.nextInt();

                    if(choice == 1)
                    {
                        int x = random.nextInt(59) + 1;
                        int y = random.nextInt(59) + 1;
                        outTxtFile.println("Question " + q + ")");
                        outTxtFile.println("--> Around a rectangular flowerbed with dimensions " + x + " meters and " + y + " meters are to \n be planted roses equally spaced so that the roses are found in every corner of the  \n flowerbed and consumed as little as possible. At what distance are planted roses?");
                        int answer = greatCommonDivisorFinder(x, y);
                        outTxtFile.println();
                        outTxtFile.println();
                        outTxtFile.println("Answer " + q + ":");
                        outTxtFile.println("--> " + answer);
                        outTxtFile.println("    Solving Steps:");
                        outTxtFile.println("    1) First understand the elements: We have rectangle, " + x + " meters and " + y + " meters");
                        outTxtFile.println("    2) If we want plant equally distance should be divisor of both " + x + " and " + y);
                        outTxtFile.println("    3) We want to most efficient way so the divisor should be great common divisor");
                        outTxtFile.println("    4) We are checking every divisor of " + x + " and " + y + " for finding to great common divisor");
                        outTxtFile.println("    The answer is --> " + answer);
                        outTxtFile.println();
                        outTxtFile.println();
                    }
                    else if(choice == 2)
                    {
                        int b = random.nextInt(50) + 60;
                        int a = random.nextInt(19) + 1;
                        int x = random.nextInt(3) + 1;
                        int y = random.nextInt(3) + x + 1;
                        int z = random.nextInt(2) + y + 1;
                        outTxtFile.println("Question " + q + ")");
                        outTxtFile.println("--> Find whole numbers between " + a + " and " + b + " that are divisible by " + x + ", " + y +", and "+ z);

                        String answer = sameDivisorFinderInCertainRange(a, b, x, y, z);
                
                        outTxtFile.println();
                        outTxtFile.println();
                        outTxtFile.println("Answer " + q + ":");
                        outTxtFile.println("--> " + answer);
                        outTxtFile.println("    Solving Steps:");
                        outTxtFile.println("    1) First understand the elements: We have range, " + a + " and " + b + " and we have divisors:  " + x + " " + y + " " + z);
                        outTxtFile.println("    2) If we want to find that number we should check every number in  " + a + " and " + b + " for they are divisible to " + x + " " + y + " " + z + " or not");
                        outTxtFile.println("    3) The computer is checking ... ");
                        outTxtFile.println("    The answer is --> " + answer);
                        outTxtFile.println();
                        outTxtFile.println();
                    }
                    else if(choice == 3)
                    {
                        int y = random.nextInt(30) + 1;
                        int x = random.nextInt(10) + (2 * y) + 1;
                        outTxtFile.println("Question " + q + ")");
                        outTxtFile.println("--> Louise is " + x + " years old. Her daughter is " + y + " years old. In how many years will Louise be double her daughter’s age?");

                        int answer = whenDoubleYourAge(x, y);

                        outTxtFile.println();
                        outTxtFile.println();
                        outTxtFile.println("Answer " + q + ":");
                        outTxtFile.println("--> " + answer);
                        outTxtFile.println("    Solving Steps:");
                        outTxtFile.println("    1) First understand the elements: We have two age, " + x + " and " + y + " and we want to know when double ");
                        outTxtFile.println("    2) We can use one equation to find this: x - ( 2 * y )");
                        outTxtFile.println("    3) But this is work for only if (2 * y) < x) because in other cases there are no solution");
                        outTxtFile.println("    4) We are solving to equation for this question " + x + " - (2 * " + y + ")");
                        outTxtFile.println("    The answer is --> " + answer);
                        outTxtFile.println();
                        outTxtFile.println();

                    }
                    else
                    {
                        System.out.println("Please input 1 or 2 or 3.");
                        counter--;
                        q--;
                    }

                    counter++;
                    q++;
                }
                System.out.println();
                System.out.println("--> " + txtFile + " have been created and added 5 questions and their answers.");            
                outTxtFile.close();

            }
            else if(check == 5)
            {
                System.out.println();
                System.out.println("Have a nice day. Good Bye");
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("Please select 1,2,3,4 or 5... Try Again...");
                System.out.println();
            }
        }
        
        in.close();
    }

    public static int greatCommonDivisorFinder(int x, int y)
    {
        int common = 1;

        for(int i = 1; i<= x && i<= y; i++)
        {
            if(x % i == 0 && y % i == 0)
            {
                common = i;
            }
        }
        return common;
    }

    public static String sameDivisorFinderInCertainRange(int a, int b, int x, int y, int z)
    {
        String numbers = "";

        for(int i = a; i<= b; i++)
        {
            if (i % x == 0 && i % y == 0 && i % z == 0)
            {
                numbers +=  " " + i;
            }
        }

        return numbers;
    }

    public static int whenDoubleYourAge(int x, int y)
    {
        if(2 * y > x)
        {
            System.out.println("This Problem have no solution");
            return -1;
        }
        else if(2 * y == x)
        {
            System.out.println("Already double and never be double again");
            return -1;
        }
        else
        {
            return x - (2 * y);
        }
    }









}