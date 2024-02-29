

public class Page 
{
    private int arraySize;
    char [] a; 
    String print;

    public Page(int arraySize)
    {
        a = new char[arraySize];
        this.arraySize = arraySize;
        for(int i = 0; i < arraySize; i ++)
        {
            a[i] = '-';
        }
    }
    
    public void setarraySize(int arraySize)
    {
        this.arraySize = arraySize;
    }
    
    public String toString( )
    {
        String aa = "";


        for(int i = 0; i< a.length; i++ )
        {
            aa = aa + a[i];
        }
        return aa;
    }

   public void writePage(String notee)
    {
            if (notee.length() >= arraySize)
            {
                notee.getChars(0, arraySize, a, 0);
            }
            else if (notee.length() < arraySize)
            {
                notee.getChars(0, notee.length(), a, 0);
            }
    }
}

