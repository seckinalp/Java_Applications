import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputDocument {

    private int numberOfOccurences[];  
    private String fileName;
    private int totalVerbCount = 0;
    private Double frequencies[];
    private VerbDictionary vdc;

    public InputDocument(String fileName) throws FileNotFoundException
    {
        this.fileName = fileName;
        numberOfOccurences = new int[6710];
        vdc = new VerbDictionary();
        frequencies = new Double [6710];
        findVerbIndex();
        calculateAllFrequencies();
    }
    
    public void findVerbIndex() throws FileNotFoundException
    {
        
        File text = new File(fileName);
        Scanner textReader = new Scanner(text);
        String temp;

        while (textReader.hasNextLine()) 
        {
            String verbLine = textReader.nextLine();
            StringTokenizer token = new StringTokenizer(verbLine," .,;?!()[]{}'\"“”"); 
            
            while(token.hasMoreTokens())
            {
                temp = token.nextToken();
                if(vdc.findVerbIndex(temp) >= 0)
                {
                    numberOfOccurences[vdc.findVerbIndex(temp)]++;
                    totalVerbCount++;
                }           
            }
        }

        textReader.close();
    }

    public void printTop5() throws FileNotFoundException
    {
       
        int topFive[] = new int [] {-1,-1,-1,-1,-1};
        int temp;
        int max, secondMax, thirdMax, fourthMax, fifthMax ;
        String base1, base2, base3, base4, base5;
        base1 = base2 = base3 = base4 = base5 = "";
        max = secondMax = thirdMax = fourthMax = fifthMax = 0;

        for (int i = 0; i < numberOfOccurences.length; i++) 
        {
            temp = numberOfOccurences[i];
            if (temp > topFive[0]) 
            {
                topFive[4] = topFive[3];
                topFive[3] = topFive[2];
                topFive[2] = topFive[1];
                topFive[1] = topFive[0];
                topFive[0] = temp;

                max = topFive[0];
                base1 = vdc.verbs.get(i).verbBase;

            } 
            
            else if  (temp > topFive[1]) 
            {
                topFive[4] = topFive[3];
                topFive[3] = topFive[2];
                topFive[2] = topFive[1];
                topFive[1] = temp;

                secondMax = topFive[1];
                base2 = vdc.verbs.get(i).verbBase;
            } 
            
            else if (temp > topFive[2]) 
            {
                topFive[4] = topFive[3];
                topFive[3] = topFive[2];
                topFive[2] = temp;

                thirdMax = topFive[2];
                base3 = vdc.verbs.get(i).verbBase;
            } 

            else if (temp > topFive[3]) 
            {
                topFive[4] = topFive[3];
                topFive[3] = temp;

                fourthMax = topFive[3];
                base4 = vdc.verbs.get(i).verbBase;
            }

            else if(temp > topFive[4])
            {
                topFive[4] = temp;

                fifthMax = topFive[4];
                base5 = vdc.verbs.get(i).verbBase;
            }


        }

        System.out.println("\"" + base1 + "\": " + max + ", " + "\"" + base2 + "\": " + secondMax + ", " + "\"" + base3 + "\": " + thirdMax + ", " + "\"" + base4 + "\": " + fourthMax + ", " + "\"" + base5 + "\": " + fifthMax);
    }

    public double getFrequency(int verbIndex) 
    {
        return frequencies[verbIndex];
    }

    public void calculateAllFrequencies() throws FileNotFoundException
    {
        
        
        for(int i = 0; i < 6710;i++)
        {
            Double x =  (double) numberOfOccurences[vdc.findVerbIndex(vdc.verbs.get(i).verbBase)];
            frequencies[i] =  x / totalVerbCount;
        }
    }

    public double calculateDissimilarity(InputDocument other)
    {
        Double dissimilarity = 0.0;

        for(int i = 0; i < 6710; i++)
        {
           Double current = Math.abs(getFrequency(i) - other.getFrequency(i));
           dissimilarity += current;
        }
        return   dissimilarity;
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        VerbDictionary vd = new VerbDictionary();

        InputDocument d1 = new InputDocument("0.txt");
        InputDocument d2 = new InputDocument("1.txt");
        InputDocument d3 = new InputDocument("2.txt");
        InputDocument d4 = new InputDocument("3.txt");
        InputDocument d5 = new InputDocument("4.txt");
        InputDocument d6 = new InputDocument("5.txt");
        InputDocument d7 = new InputDocument("6.txt");
        InputDocument d8 = new InputDocument("7.txt");
        InputDocument d9 = new InputDocument("8.txt");
        InputDocument d10 = new InputDocument("9.txt");

        Scanner in = new Scanner(System.in);
        System.out.print("Input word 1 for try findVerbIndex(): ");
        String one = in.next();
        System.out.print("Input word 2 for try findVerbIndex(): ");
        String two = in.next();
        System.out.print("Input word 3 for try findVerbIndex(): ");
        String three = in.next();
        System.out.print("Input word 4 for try findVerbIndex(): ");
        String four = in.next();
        
        System.out.println();
        System.out.println("Index of \"" + one + "\" is " + vd.findVerbIndex(one));
        System.out.println("Index of \"" + two + "\" is " + vd.findVerbIndex(two));
        System.out.println("Index of \"" + three + "\" is " + vd.findVerbIndex(three));
        System.out.println("Index of \"" + four + "\" is " + vd.findVerbIndex(four));
        System.out.println();

        System.out.println("Top 5 verbs in each document:");
        
        System.out.print("0: " );
        d1.printTop5();
        System.out.print("1: " );
        d2.printTop5();     
        System.out.print("2: " );
        d3.printTop5();
        System.out.print("3: " );
        d4.printTop5();
        System.out.print("4: " );
        d5.printTop5();
        System.out.print("5: " );
        d6.printTop5();
        System.out.print("6: " );
        d7.printTop5();
        System.out.print("7: " );
        d8.printTop5();
        System.out.print("8: " );
        d9.printTop5();
        System.out.print("9: " );
        d10.printTop5();

        System.out.println();
        System.out.println("Dissimilarity matrix:");
        System.out.println("N 0      1      2      3      4      5      6      7      8      9 ");
        System.out.printf("0 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d1.calculateDissimilarity(d1),d1.calculateDissimilarity(d2),d1.calculateDissimilarity(d3),d1.calculateDissimilarity(d4),d1.calculateDissimilarity(d5),d1.calculateDissimilarity(d6),d1.calculateDissimilarity(d7),d1.calculateDissimilarity(d8),d1.calculateDissimilarity(d9),d1.calculateDissimilarity(d10));
        System.out.printf("1 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d2.calculateDissimilarity(d1),d2.calculateDissimilarity(d2),d2.calculateDissimilarity(d3),d2.calculateDissimilarity(d4),d2.calculateDissimilarity(d5),d2.calculateDissimilarity(d6),d2.calculateDissimilarity(d7),d2.calculateDissimilarity(d8),d2.calculateDissimilarity(d9),d2.calculateDissimilarity(d10));
        System.out.printf("2 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d3.calculateDissimilarity(d1),d3.calculateDissimilarity(d2),d3.calculateDissimilarity(d3),d3.calculateDissimilarity(d4),d3.calculateDissimilarity(d5),d3.calculateDissimilarity(d6),d3.calculateDissimilarity(d7),d3.calculateDissimilarity(d8),d3.calculateDissimilarity(d9),d3.calculateDissimilarity(d10));
        System.out.printf("3 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d4.calculateDissimilarity(d1),d4.calculateDissimilarity(d2),d4.calculateDissimilarity(d3),d4.calculateDissimilarity(d4),d4.calculateDissimilarity(d5),d4.calculateDissimilarity(d6),d4.calculateDissimilarity(d7),d4.calculateDissimilarity(d8),d4.calculateDissimilarity(d9),d4.calculateDissimilarity(d10));
        System.out.printf("4 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d5.calculateDissimilarity(d1),d5.calculateDissimilarity(d2),d5.calculateDissimilarity(d3),d5.calculateDissimilarity(d4),d5.calculateDissimilarity(d5),d5.calculateDissimilarity(d6),d5.calculateDissimilarity(d7),d5.calculateDissimilarity(d8),d5.calculateDissimilarity(d9),d5.calculateDissimilarity(d10));
        System.out.printf("5 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d6.calculateDissimilarity(d1),d6.calculateDissimilarity(d2),d6.calculateDissimilarity(d3),d6.calculateDissimilarity(d4),d6.calculateDissimilarity(d5),d6.calculateDissimilarity(d6),d6.calculateDissimilarity(d7),d6.calculateDissimilarity(d8),d6.calculateDissimilarity(d9),d6.calculateDissimilarity(d10));
        System.out.printf("6 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d7.calculateDissimilarity(d1),d7.calculateDissimilarity(d2),d7.calculateDissimilarity(d3),d7.calculateDissimilarity(d4),d7.calculateDissimilarity(d5),d7.calculateDissimilarity(d6),d7.calculateDissimilarity(d7),d7.calculateDissimilarity(d8),d7.calculateDissimilarity(d9),d7.calculateDissimilarity(d10));
        System.out.printf("7 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d8.calculateDissimilarity(d1),d8.calculateDissimilarity(d2),d8.calculateDissimilarity(d3),d8.calculateDissimilarity(d4),d8.calculateDissimilarity(d5),d8.calculateDissimilarity(d6),d8.calculateDissimilarity(d7),d8.calculateDissimilarity(d8),d8.calculateDissimilarity(d9),d8.calculateDissimilarity(d10));
        System.out.printf("8 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d9.calculateDissimilarity(d1),d9.calculateDissimilarity(d2),d9.calculateDissimilarity(d3),d9.calculateDissimilarity(d4),d9.calculateDissimilarity(d5),d9.calculateDissimilarity(d6),d9.calculateDissimilarity(d7),d9.calculateDissimilarity(d8),d9.calculateDissimilarity(d9),d9.calculateDissimilarity(d10));
        System.out.printf("9 %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f %.4f\n", d10.calculateDissimilarity(d1),d10.calculateDissimilarity(d2),d10.calculateDissimilarity(d3),d10.calculateDissimilarity(d4),d10.calculateDissimilarity(d5),d10.calculateDissimilarity(d6),d10.calculateDissimilarity(d7),d10.calculateDissimilarity(d8),d10.calculateDissimilarity(d9),d10.calculateDissimilarity(d10));
        System.out.println();

        in.close();
        
    }
}

