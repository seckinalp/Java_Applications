


public class Date 
{
    
    private int year, month, day;

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /*private static void initDaysInMonth()
    {
        ArrayList<Integer> sayilar = new ArrayList<Integer>(12);
        sayilar.add(31);
        sayilar.add(30);
        sayilar.add(31);
        sayilar.add(28);
        sayilar.add(31);
        sayilar.add(30);
        sayilar.add(31);
        sayilar.add(31);
        sayilar.add(30);
        sayilar.add(31);
        sayilar.add(30);
        sayilar.add(31);

    }
    */
   public int getYear()
   {
        return year;
   }

   public int getMonth()
   {
        return month;
   }

   public int getDay()
   {
        return day;
   }
   
    

    public boolean isLeapYear(int year)
    {
        boolean result;
        boolean check = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (check)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public String toString(int year, int month, int day)
    {
        String yearstr = Integer.toString(year);
        String monthstr = Integer.toString(month);
        String daystr = Integer.toString(day);
        if (year % 100 == year)
        {
            for (int i = 0; i < 4 - yearstr.length(); i++)
            {
                yearstr = 0 + yearstr;
            }
        }
        if (month % 10 == year)
        {
            monthstr = 0 + monthstr;
        }
        if (day % 10 == year)
        {
            daystr = 0 + daystr;
        }
        return yearstr + "-" + monthstr + "-" + daystr;
    }

    public int daysBetween()
    {
        int x = 0;
        return x;
    }

    public int addDays()
    {
        int x = 0;
        return x;
        
    }

    public boolean isBefore()
    {
        boolean x = true;

        return x;
    }

    





























}