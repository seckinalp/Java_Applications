import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VerbDictionary {

    public ArrayList<Verb> verbs;
    private String one,two,three,four,five;
    public VerbDictionary() throws FileNotFoundException 
    {
        verbs = new ArrayList<Verb>(); 
        processDictionary("verbs-dictionaries.txt");
        
    }

    public void processDictionary(String fileName) throws FileNotFoundException
    {   
        Verb temp;
        

        File verbtext = new File(fileName);
        Scanner textReader = new Scanner(verbtext);

        while (textReader.hasNextLine()) 
        {
            String verbLine = textReader.nextLine();
            StringTokenizer token = new StringTokenizer(verbLine,"\t"); 
            
            while(token.hasMoreTokens())
            {
                one = token.nextToken();
                    
                two = token.nextToken();
                    
                three = token.nextToken();
                       
                four = token.nextToken();
                       
                five = token.nextToken();

                temp = new Verb(one, two, three, four, five);
                verbs.add(temp);    
            }
           
        }
       
        textReader.close();
        
    }

    public int findVerbIndex(String word)
    {
        int i = 0;
        for(i = 0; i < verbs.size();i++)
        {
            if(verbs.get(i).check(word))
            {
                return i ;
            }
        }
       
        return -1;
        
        
    }

}