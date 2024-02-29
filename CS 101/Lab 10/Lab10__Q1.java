import java.util.Arrays;

public class Lab10__Q1 
{

    public static void testAdjacent(int[] array)
    {
        int[] rearranged2 = new int[array.length];
        rearranged2 = array;
        System.out.println("Original: " + Arrays.toString(array) + " Result: " + Arrays.toString(makeAdjacent(rearranged2)));
    }

    public static int[] makeAdjacent(int[] array)
    {
    	int[] rearranged = new int[array.length];
    	rearranged = array;
        int check = 1;
        int check2 = 1;
        int check3 = 1;
        while (check == 1)
        {
            check2 = 1;
        for (int i = 0; i < rearranged.length ; i ++)
        {
            if (rearranged[i] == 5)
            {
            int[] arrDestination = new int[rearranged.length - 1];
            int remainingElements = rearranged.length - ( i + 1 );
            System.arraycopy(rearranged, 0, arrDestination, 0, i);
            System.arraycopy(rearranged, i+ 1, arrDestination, i, remainingElements);
            
            i = array.length ;
            rearranged = arrDestination;
            }
        }
        for (int k = 0; k < rearranged.length ; k ++)
        {
            if(rearranged[k] == 5)
            {
                check2 = 0;
            }
        }
        if ( check2 == 1)
            {
                check = 0;
            }
        }
        while (check == 0)
        {
        for (int i = 0; i < rearranged.length ; i ++)
        {
            if (rearranged[i] == 4)
            {
            int[] arrDestination2 = new int[rearranged.length + 1];
            int remainingElements = rearranged.length - ( i + 1 );
            System.arraycopy(rearranged, 0, arrDestination2, 0, i + 1 );
            arrDestination2[i + 1] = 5;
            System.arraycopy(rearranged, i+ 1, arrDestination2, i + 2, remainingElements);
            
            i ++;
            rearranged = arrDestination2;
            }
        }
        for (int k = 0; k < rearranged.length ; k ++)
        {
            if(rearranged[k] == 5)
            {
                check2  ++;
            }
            else if(rearranged[k] == 4)
            {
                check3  ++;
            }
        }
        if ( check2 == check3)
            {
                check = 1;
            }
        }
        return rearranged;
    }
    
   

    public static void main(String[] args) 
    {  
        int[] a = new int [] {5, 4, 9, 4, 9, 5};
        int[] b = new int [] {4, 2, 4, 5, 5};
        int[] c = new int [] {5, 4, 5, 4 ,1};
        int[] d = new int [] {5, 4, 1};
        int[] e = new int [] {1, 1, 1};
        int[] f = new int [] {4, 5};
       
        testAdjacent(a);
        testAdjacent(b);
        testAdjacent(c);
        testAdjacent(d);
        testAdjacent(e);
        testAdjacent(f);
    }
























}