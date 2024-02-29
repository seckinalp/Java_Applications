// This is Seçkin Alp Kargı's code for Movie stream pirated movies

public class Lab01_Q1_Kargi // error 1 wrong name
{
	public static void main(String[] args) 
	{
		System.out.println("Movie Stream Pirated Movies:"); // error 2 "
		System.out.println("Movie Stream offers 1323 movies for streaming"); // error erase //

		int noOfPiratedMovies = 1323; //error 3 wrong int name and number
		double moviePrice = 10;
		
		// calculate the revenue amassed
		
		double totalRevenueGained = noOfPiratedMovies * moviePrice; // error 4 replace x to *
		
		System.out.println("Movie Stream earns " + moviePrice + " TL per movie (total of " + totalRevenueGained + " TL)."); // error 5 missing +
		
		double fine = 0.3; // error 6 replace , to .
		double penaltyPerMovie = 3000;
		
		// calculate his total debt and and fine
		double totaldebt = noOfPiratedMovies * penaltyPerMovie;
		double totalFine = totalRevenueGained * fine;
		
		System.out.println("Recently Movie Rights Protection Agency (MRPA) started to crackdown.");
		System.out.println("MRPA sued them " + penaltyPerMovie + " for every movie they streamed and claimed " + fine * 100 + "% of their income.");
		System.out.println("Now they owe a total of " + totaldebt + " TLs and " + totalFine + " TL worth fine for their actions.");
		
		// now calculate debt if they choose to repay with suspension error 7 wrong comment type
		int hoursOfPrisonTimePerMovie = 900;
		System.out.println("They can either choose to pay this or the company license will be suspended" + hoursOfPrisonTimePerMovie + " hours for every movie pirated.");
		
		int totalHours = hoursOfPrisonTimePerMovie * noOfPiratedMovies; // error 9 double to int
		
		// convert hours to year:day:hour format 
		int hours = totalHours % 24; 
		int days = totalHours / 24; 
		int years = days / 365; // error 10 365.0 to 365
		days = days % 365;
		
		// Now print what is calculated and be done with this question
		System.out.println("Which is equal to " + years + " years " + days + " days and " + hours + " hours of prison time."); // error 8 wrong system out print name
	}
}
