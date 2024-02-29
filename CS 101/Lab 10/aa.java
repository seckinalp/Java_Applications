import java.util.Arrays;

/**
 * aa
 */
public class aa {

    
    public static void main(String[] args) {
    
        /*
        Page page = new Page (10);
        page.writePage("aaaaa");
        System.out.println(page.toString());
        */
       ;
        
        Page [] pagearray = new Page[5];
        for (int i = 0; i < 5; i ++)
        {
            pagearray[i].writePage("");
        }
        System.out.println(Arrays.toString(pagearray));
    }
}