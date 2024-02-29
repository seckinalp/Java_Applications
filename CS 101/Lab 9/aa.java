import java.util.ArrayList;

import java.util.Scanner;

public class aa 
{    
    public static void main(String[] args) 
    {
       
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = fillList();
        System.out.print("Enter divisor: ");
        int divisor = in.nextInt();
        
        ArrayList<Integer> ListSum = new ArrayList<Integer>();
        sumDivisible(List, ListSum, divisor);
        System.out.println("List: " + List);
        System.out.println("Sum List: " + ListSum);
        removeDuplicates(ListSum);
        
        in.close();
    }

    
    public static void removeDuplicates(ArrayList<Integer> ListSum)
    {
        ArrayList<Integer> ListSumNoDublicate = new ArrayList<Integer>();
        for ( Integer x : ListSum)
        {
            if (!ListSumNoDublicate.contains(x))
            {
                ListSumNoDublicate.add(x);
            }
        }
        System.out.println("Sum List (no dublicates): " + ListSumNoDublicate);
    }
      
    public static ArrayList<Integer> fillList()
    {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<Integer>();

        System.out.println("Enter values: ");
       while(input.hasNextInt())
        {
            List.add(input.nextInt());
        }
        
        return List;
    }
    
    public static void sumDivisible(ArrayList<Integer> List, ArrayList<Integer> ListSum,int xx)
    {
       
        
        for (int i = 0; i< List.size();i++)
        {
            ListSum.add(List.get(i));
        }
        for (int i = 0; i < ListSum.size(); i++)
        {
            if (ListSum.get(i) % xx != 0)
            {
                ListSum.set(i, 0); 
            } 
        }
        int y = 0;
        for (int j = 0; j < ListSum.size(); j++)
        {
            int x1 = ListSum.get(j);
            y = y + x1;
            ListSum.set(j, y);
        }

    }
}

