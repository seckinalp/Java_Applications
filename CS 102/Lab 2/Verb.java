import java.util.Arrays;

public class Verb {

    String arrayVerbForms[];   
    String verb2,verb3,verb4,verb5;
    String verbBase;
    
    public Verb(String verbBase, String verb2, String verb3, String verb4, String verb5)
    {
        this.verbBase = verbBase;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
        this.verb5 = verb5;

        arrayVerbForms = new String[]{verb2, verb3, verb4, verb5};

    }

    public boolean check(String word)
    {
        if(Arrays.asList(arrayVerbForms).contains(word) || verbBase.equals(word))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}