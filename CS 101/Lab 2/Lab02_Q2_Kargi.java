// This is Seçkin Alp Kargı's code for number
import java.util.Scanner;
public class Lab02_Q2_Kargi 
{
    public static void main(String[] args) 
    {
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine(); 

        /*
        String phoneNumberFormat1 = phoneNumber.replaceAll("\\W", "" );
        String countryCode = phoneNumberFormat1.substring(0,2);
        String areaCode = phoneNumberFormat1.substring(2,5);
        String phoneNumber1 = phoneNumberFormat1.substring(5,8);
        String phoneNumber2 = phoneNumberFormat1.substring(8,10);
        String phoneNumber3 = phoneNumberFormat1.substring(10,12);
        String phoneNumberLast = phoneNumber1 + " - " + phoneNumber2 + " " + phoneNumber3;
        */
        
        //calculations
        int number = phoneNumber.length();
        phoneNumber = phoneNumber.trim();
        int parant1 = phoneNumber.indexOf("(");
        int parant2 = phoneNumber.indexOf(")");
        int line1 = phoneNumber.indexOf("-");
        int line2 = phoneNumber.indexOf("-", line1 + 1);
        String countryCode = phoneNumber.substring(parant1 + 1, parant2);
        countryCode = countryCode.trim();
        String areaCode = phoneNumber.substring(parant2 + 1, line1);
        areaCode = areaCode.trim();
        String phoneNumber1 = phoneNumber.substring(line1 + 1, line2);
        phoneNumber1 = phoneNumber1.trim();
        String phoneNumber2 = phoneNumber.substring(line2 + 1, number);
        phoneNumber2 = phoneNumber2.trim();
        String phoneNumber21 = phoneNumber2.substring(0,2);
        String phoneNumber22 = phoneNumber2.substring(2,4);
        String phoneNumberLast =  phoneNumber1 + " - " + phoneNumber21 + " " + phoneNumber22;
        
        //prints
        System.out.printf("Country Code: %s\n" , countryCode);
        System.out.printf("City\\Area Code: %s\n" , areaCode);
        System.out.printf("Phone Number: %s\n" , phoneNumberLast);
        
        input.close();
    }
}
