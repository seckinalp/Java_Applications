
public class Notebook 
{
    private Page[] pages;
    int currentPageIndex = 0;
    int arraySize;
    private int pageCount;
    
    
    
    public Notebook (int pageCount, int arraySize)
    {
        pages = new Page [pageCount];
        if (currentPageIndex == 0)
        {
        Page xxx = new Page (arraySize);
        for ( int i = 0; i < pageCount; i ++)
        {
            pages[i] = xxx;
        }
        }
        this.arraySize = arraySize;
        this.pageCount = pageCount;
    }

    public void writeNote(String note)
    {
        /*
        Page current  = pages[currentPageIndex];
        current.writePage(note);
        */

        Page current  = new Page(arraySize); 
        current.writePage(note);
        pages[currentPageIndex] = current;

        currentPageIndex++;
    }

    public void printNotebook()
    {
        for(int k = 0; k < pageCount; k ++)
        {
        System.out.println(k + ".    " + pages[k]);
        }
    }


}
