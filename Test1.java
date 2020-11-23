import java.text.NumberFormat;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // scanner
        
        final double minHrs = 8; // Minimum Hours to start get 125% bonus 
		final double minHrsSecondtBon = 10; // Minimum Hours to start get 150% bonus
		final double firstBon = 1.25; // Amount of first bonus
		final double secondBon = 1.5; // Amount of second bonus
		
		double salaryForHour = 0;
		double hours = 0; // Amount of working hours per day
		double bon1= 0;
		double salary = 0; 

        long numOfMiliSeconds = System.currentTimeMillis();
		long numOfSeconds = numOfMiliSeconds / 1000;
		long numOfMinutes = numOfSeconds / 60;
		long numOfHours = numOfMinutes / 60;
		
        long numOfMiliSeconds2 = System.currentTimeMillis();
		long numOfSeconds2 = numOfMiliSeconds / 1000;
		long numOfMinutes2 = numOfSeconds / 60;
		long numOfHours2 = numOfMinutes / 60;
		
		//started work
		do {
		System.out.println("in what hour did you started to work?");
		numOfHours = s.nextLong();
		}while (numOfHours > 24 || numOfHours < 1);
		do {
		System.out.println("in what minute did you started to work?");
		numOfMinutes = s.nextLong();
		}while (numOfMinutes > 61 || numOfMinutes < 0);
		//finished work
		do {
		System.out.println("in what hour did you finished to work?");
		numOfHours2 = s.nextLong();
		}while (numOfHours > 24 || numOfHours < 1);
		do {
		System.out.println("in what minute did you finished to work?");
		numOfMinutes2 = s.nextLong();
		}while (numOfMinutes > 61 || numOfMinutes < 0);
		
		double currentHour = (double) (Math.abs(numOfHours2%24-numOfHours%24));
		double currentMin = (double) (Math.abs(numOfMinutes2%60-numOfMinutes%60));
		System.out.println("Today you worked: "+currentHour + " hours and " + currentMin + " minutes");
		
		System.out.println("What is your salary for 1 hour?");
		salaryForHour = s.nextDouble();
		
		if(salaryForHour < 29.48 || salaryForHour > 200 || currentHour < 1) {
			System.out.println("Invalid number.");
		}else if(currentHour <= minHrs){
			salary = (currentHour*salaryForHour)+((currentMin/60)*salaryForHour);
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String result = price.format(salary);
			System.out.println("Your salary per day is: "+result);
		}else if(currentHour>minHrs && currentHour < minHrsSecondtBon) {
			salary = (currentHour-minHrs)*salaryForHour*firstBon+(minHrs*salaryForHour)+((currentMin/60)*salaryForHour*firstBon);
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String result = price.format(salary);
			System.out.println("Your salary per day is: "+result);
		}else if(currentHour>minHrsSecondtBon) {
			bon1 = (minHrsSecondtBon-minHrs)*salaryForHour*firstBon;
			salary = (currentHour-minHrsSecondtBon)*salaryForHour*secondBon+(minHrs*salaryForHour)+((currentMin/60)*salaryForHour*secondBon)+bon1;
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String result = price.format(salary);
			System.out.println("Your salary per day is: "+result);
			
		}
		
		
    }

}