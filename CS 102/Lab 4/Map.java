
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Map
 */
public class Map {

    static String[][] treasureMap;
    static ArrayList<Path> pathList = new ArrayList<Path>();
    static int column = 0;
    static int row = 1;
    static String mapString = "";
    static Path path;
    static int currentPositionX = 0;
    static int currentPositionY = 0;
    static int startPositionX = 0;
    static int startPositionY = 0;

    public static void readMap(String fileName) throws IOException
    {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        
        String rowString = sc.nextLine();
        column = rowString.length();
        mapString += rowString;
        while(sc.hasNextLine())
        {
            mapString += sc.nextLine();
            row++;
        }
        treasureMap = new String[row][column];
        int c = 0;

        for(int i = 0; i < row; i ++)
        {
            for(int k = 0; k < column; k++)
            {
               String temp = "" + mapString.charAt(c);
               treasureMap[i][k] = temp;
               if(temp.equalsIgnoreCase("S"))
               {
                    currentPositionX = i;
                    currentPositionY = k;
                    startPositionX = i;
                    startPositionY = k;
               }
               c++;
            }
        }
        sc.close();
    }

    public static void createPath(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        String directions = "";

        while(sc.hasNext())
        {
            directions +=  sc.next() + " ";
        }
        fileName = fileName.substring(6);
        path = new Path(directions, fileName);
        sc.close();
    }

    public static boolean isPathToTreasure(Path p)
    {
        for(int i = 0; i < p.instructions.size(); i ++)
        {
            if(!isMovePossible(p.instructions.get(i)))
            {

            }
            else
            {
                if(p.instructions.get(i).direction.equalsIgnoreCase("E"))
                {
                    currentPositionY += p.instructions.get(i).number;
                }
                else if(p.instructions.get(i).direction.equalsIgnoreCase("N"))
                {
                    currentPositionX -= p.instructions.get(i).number;

                }
                else if(p.instructions.get(i).direction.equalsIgnoreCase("S"))
                {
                    currentPositionX += p.instructions.get(i).number;
       
                }
                else if(p.instructions.get(i).direction.equalsIgnoreCase("W"))
                {
                    currentPositionY -= p.instructions.get(i).number;
                }
            }
        }

        if(treasureMap[currentPositionX][currentPositionY].equalsIgnoreCase("T"))
        {
            currentPositionX = startPositionX;
            currentPositionY = startPositionY;
            return true;
        }

        currentPositionX = startPositionX;
        currentPositionY = startPositionY;
        return false;
    }
    public static boolean isMovePossible(Instruction ins)
    {
        if(ins.direction.equalsIgnoreCase("E"))
        {
            if(currentPositionY + ins.number >= column)
            {
                return false;
            }
            else
            {
                for(int i = 1; i <= ins.number; i++)
                {
                    if(treasureMap[currentPositionX][currentPositionY + i].equalsIgnoreCase("B"))
                    {
                        return false;
                    }
                }    
            }
        }
        else if(ins.direction.equalsIgnoreCase("N"))
        {
            if(currentPositionX - ins.number <= 0)
            {
                return false;
            }
            else
            {
                for(int i = 1; i <= ins.number; i++)
                {
                    if(treasureMap[currentPositionX - i][currentPositionY].equalsIgnoreCase("B"))
                    {
                        return false;
                    }
                }    
            }
        }
        else if(ins.direction.equalsIgnoreCase("S"))
        {
            if(currentPositionX + ins.number >= row)
            {
                return false;
            }
            else
            {
                for(int i = 1; i <= ins.number; i++)
                {
                    if(treasureMap[currentPositionX + i][currentPositionY].equalsIgnoreCase("B"))
                    {
                        return false;
                    }
                }    
            }
        }
        else if(ins.direction.equalsIgnoreCase("W"))
        {
            if(currentPositionY - ins.number <= 0)
            {
                return false;
            }
            else
            {
                for(int i = 1; i <= ins.number; i++)
                {
                    if(treasureMap[currentPositionX][currentPositionY - i].equalsIgnoreCase("B"))
                    {
                        return false;
                    }
                }    
            }
        }
        return true;
    }

    public static void readFromFolder(String folderName) throws IOException
    {
        String fileName = "";
        File directory = new File(folderName);      
        File[] myarray;  
        myarray=new File[1];
        myarray=directory.listFiles();
        for (int j = 0; j < myarray.length; j++)
        {
            fileName = myarray[j] + "";
            createPath(fileName);
            pathList.add(path);
        }
    }
        


    public static void processPaths()
    {
        for(int i = 0; i < pathList.size(); i ++)
        {
            if(isPathToTreasure(pathList.get(i)))
            {
                System.out.println(pathList.get(i).fileName + " : reaches treasure. "); 
            }
                 
        }
    }

    public static boolean checkPathCombination(Path a, Path b)
    {
        for(int i = 0; i < a.instructions.size(); i ++)
        {
            if(!isMovePossible(a.instructions.get(i)))
            {

            }
            else
            {
                if(a.instructions.get(i).direction.equalsIgnoreCase("E"))
                {
                    currentPositionY += a.instructions.get(i).number;
                }
                else if(a.instructions.get(i).direction.equalsIgnoreCase("N"))
                {
                    currentPositionX -= a.instructions.get(i).number;

                }
                else if(a.instructions.get(i).direction.equalsIgnoreCase("S"))
                {
                    currentPositionX += a.instructions.get(i).number;
       
                }
                else if(a.instructions.get(i).direction.equalsIgnoreCase("W"))
                {
                    currentPositionY -= a.instructions.get(i).number;
                }
            }
        }
        for(int i = 0; i < b.instructions.size(); i ++)
        {
            if(!isMovePossible(b.instructions.get(i)))
            {

            }
            else
            {
                if(b.instructions.get(i).direction.equalsIgnoreCase("E"))
                {
                    currentPositionY += b.instructions.get(i).number;
                }
                else if(b.instructions.get(i).direction.equalsIgnoreCase("N"))
                {
                    currentPositionX -= b.instructions.get(i).number;

                }
                else if(b.instructions.get(i).direction.equalsIgnoreCase("S"))
                {
                    currentPositionX += b.instructions.get(i).number;
       
                }
                else if(b.instructions.get(i).direction.equalsIgnoreCase("W"))
                {
                    currentPositionY -= b.instructions.get(i).number;
                }
            }
        }
        
        if(treasureMap[currentPositionX][currentPositionY].equalsIgnoreCase("T"))
        {
            currentPositionX = startPositionX;
            currentPositionY = startPositionY;
            return true;
        }

        currentPositionX = startPositionX;
        currentPositionY = startPositionY;
        return false;
    }

    public static void processPathCombinations()
    {
        for(int i = 0; i < pathList.size() - 1; i ++)
        {
            for(int k = i + 1; k < pathList.size(); k++)
            {
                if(checkPathCombination(pathList.get(i), pathList.get(k)))
                {
                    System.out.println(pathList.get(i).fileName + " and " + pathList.get(k).fileName + " reach treasure.");
                }
            }
        }

        for(int i = 0; i < pathList.size() - 1; i ++)
        {
            for(int k = i + 1; k < pathList.size(); k++)
            {
                if(checkPathCombination(pathList.get(k), pathList.get(i)))
                {
                    System.out.println(pathList.get(k).fileName + " and " + pathList.get(i).fileName + " reach treasure.");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        readMap("Map.txt");
        readFromFolder("Paths");
        processPathCombinations();
        processPaths();
    }
}