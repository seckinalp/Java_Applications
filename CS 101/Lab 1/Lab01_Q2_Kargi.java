// This is Seçkin Alp Kargı's code for time calculation

public class Lab01_Q2_Kargi 
{
   public static void main(String[] args) 
   {
       //constant
       final int n = 60;

       //calculations
       int numberOfSeconds = 12486;
       int minute = numberOfSeconds / n;
       int hour = minute / n;
       int minuteLast = minute - (hour * n);
       int secondLast = numberOfSeconds - (minute * n);

       //print
       System.out.println(numberOfSeconds + " seconds represents " + hour + " hours " + minuteLast + " minutes and " + secondLast + " seconds" );
   } 
}
