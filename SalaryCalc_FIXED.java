import java.text.NumberFormat;
import java.util.Scanner;

public class SalaryCalc_FIXED {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		final int firstStage = 6330;
		final int secondStage = 9080;
		final int thirdStage = 14580;
		final int fourthStage = 20260;
		final int fifthStage = 42160;
		final int sixthStage = 54300;
		final int MONTH = 4;
		double salary = 0;
		int hours = 0;
		int days = 0;
		System.out.println("What is your salary per hour?");
		salary = s.nextDouble();
		System.out.println("How many hours do you work in a day?");
		hours = s.nextInt();
		System.out.println("How many days do you in a week?");
		days = s.nextInt();
		
		if(salary < 29.12 || hours < 1 || hours > 12 || days < 1 || days > 7) {
			System.out.println("Invalid Inputs");return;
		}
		double daySalary = salary*hours;
		double weekSalary = salary*hours*days;
		double monthSalary = salary*hours*days*MONTH;
		double firstBon = (hours-8)*salary*1.25;
		double secondBon = (hours-10)*salary*1.5;
		double daySalaryWithBon1 = (salary*8)+firstBon;
		double daySalaryWithBon2 = (salary*8)+firstBon+secondBon;
		double weekSalaryWithBon1 = ((salary*8)+firstBon) * days;
		double weekSalaryWithBon2 = ((salary*8)+firstBon+secondBon) * days;
		double monthSalaryWithBon1 = ((salary*8)+firstBon) * days * MONTH;
		double monthSalaryWithBon2 = ((salary*8)+firstBon+secondBon) * days * MONTH;
		//System.out.println(monthSalary);
		
		
		
		final double FIRST_STEP = (monthSalary)*0.1;			final double FIRST_STEP1 = (monthSalaryWithBon1)*0.1;		final double FIRST_STEP2 = (monthSalaryWithBon2)*0.1;
		final double SECOND_STEP = (monthSalary-6330)*0.14;		final double SECOND_STEP1 = (monthSalaryWithBon1-6330)*0.14;		final double SECOND_STEP2 = (monthSalaryWithBon2-6330)*0.14;
		final double THIRD_STEP = (monthSalary-9080)*0.2;		final double THIRD_STEP1 = (monthSalaryWithBon1-9080)*0.2;			final double THIRD_STEP2 = (monthSalaryWithBon2-9080)*0.2;
		final double FOURTH_STEP = (monthSalary-14850)*0.31;	final double FOURTH_STEP1 = (monthSalaryWithBon1-14850)*0.31;		final double FOURTH_STEP2 = (monthSalaryWithBon2-14850)*0.31;
		final double FIFTH_STEP = (monthSalary-20260)*0.35;		final double FIFTH_STEP1 = (monthSalaryWithBon1-20260)*0.35;			final double FIFTH_STEP2 = (monthSalaryWithBon2-20260)*0.35;
		final double SIXTH_STEP = (monthSalary-42160)*0.47;		final double SIXTH_STEP1 = (monthSalaryWithBon1-42160)*0.47;		final double SIXTH_STEP2 = (monthSalaryWithBon2-42160)*0.47;
		final double SEVENTH_STEP = (monthSalary-54300)*0.5;	final double SEVENTH_STEP1 = (monthSalaryWithBon1-54300)*0.5;		final double SEVENTH_STEP2 = (monthSalaryWithBon2-54300)*0.5;
		
		if(monthSalary <= firstStage && hours <= 8) {   											//FIRST STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - FIRST_STEP;
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(FIRST_STEP);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalaryWithBon1 <= firstStage && hours > 8 && hours <= 10) {   											//FIRST STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			
			monthSalaryWithBon1 = monthSalaryWithBon1 - FIRST_STEP1;
			
			
			String dayResult = price.format(daySalaryWithBon1);
			String weekResult = price.format(weekSalaryWithBon1);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(FIRST_STEP);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalaryWithBon2 <= firstStage && hours > 10 && hours <= 12) {   											//FIRST STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			
			monthSalaryWithBon2 = monthSalaryWithBon2 - FIRST_STEP2;
			
			
			String dayResult = price.format(daySalaryWithBon2);
			String weekResult = price.format(weekSalaryWithBon2);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(FIRST_STEP2);
			
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= secondStage && monthSalary > firstStage && hours <= 8) {   											//SECOND STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(SECOND_STEP));
			double tax = (6330*0.1)+(SECOND_STEP);
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= secondStage && monthSalary > firstStage && hours > 8 && hours <= 10) {   								//FIRST STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(SECOND_STEP1));
			double tax = (6330*0.1)+(SECOND_STEP1);
			
			
			String dayResult = price.format(daySalaryWithBon1);
			String weekResult = price.format(weekSalaryWithBon1);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= secondStage && monthSalary > firstStage && hours > 10 && hours <= 12) {   								//FIRST STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(SECOND_STEP2));
			double tax = (6330*0.1)+(SECOND_STEP2);
			
			
			String dayResult = price.format(daySalaryWithBon2);
			String weekResult = price.format(weekSalaryWithBon2);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= thirdStage && monthSalary > secondStage && hours <= 8) {   											//THIRD STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(2750*0.14)+(+THIRD_STEP));
			double tax = ((6330*0.1)+(2750*0.14)+(+THIRD_STEP));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= thirdStage && monthSalary > secondStage && hours <= 10 && hours > 8) {   								//THIRD STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(2750*0.14)+(+THIRD_STEP1));
			double tax = ((6330*0.1)+(2750*0.14)+(+THIRD_STEP1));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= thirdStage && monthSalary > secondStage && hours <= 12 && hours > 10) {   								//THIRD STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(2750*0.14)+(+THIRD_STEP2));
			double tax = ((6330*0.1)+(2750*0.14)+(+THIRD_STEP2));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= fourthStage && monthSalary > thirdStage && hours <= 8) {   											//FOURTH STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= fourthStage && monthSalary > thirdStage && hours <= 10 && hours > 8) {   								//FOURTH STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP1));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP1));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= fourthStage && monthSalary > thirdStage && hours <= 12 && hours > 10) {   								//FOURTH STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP2));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(FOURTH_STEP2));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
		
			
		}else if (monthSalary <= fifthStage && monthSalary > fourthStage && hours <= 8) {   											//FIFTH STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= fifthStage && monthSalary > fourthStage && hours <= 10 && hours > 8) {   								//FIFTH STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP1));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP1));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= fifthStage && monthSalary > fourthStage && hours <= 12 && hours > 10) {   								//FOURTH STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP2));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(FIFTH_STEP2));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
		
			
		}else if (monthSalary <= sixthStage && monthSalary > fifthStage && hours <= 8) {   											//SIXTH STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= sixthStage && monthSalary > fifthStage && hours <= 10 && hours > 8) {   								//SIXTH STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP1));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP1));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary <= sixthStage && monthSalary > fifthStage && hours <= 12 && hours > 10) {   								//SIXTH STEP with 150% bonus
			
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP2));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(SIXTH_STEP2));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
		
			
		}else if (monthSalary > fourthStage && hours <= 8) {   											//SEVENTH STEP
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalary);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalary = monthSalary - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalary);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary > sixthStage && hours <= 10 && hours > 8) {   								//SEVENTH STEP with 125% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon1);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon1 = monthSalaryWithBon1 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP1));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP1));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon1);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
			
		}else if (monthSalary > sixthStage && hours <= 12 && hours > 10) {   								//SIXTH STEP with 150% bonus
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String beforeTAX = price.format(monthSalaryWithBon2);
			System.out.println("Your salary per MONTH before TAX: "+beforeTAX);
			monthSalaryWithBon2 = monthSalaryWithBon2 - ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP2));
			double tax = ((6330*0.1)+(2750*0.14)+(5770*0.2)+(5410*0.31)+(21900*0.35)+(12140*0.47)+(SEVENTH_STEP2));
			
			
			String dayResult = price.format(daySalary);
			String weekResult = price.format(weekSalary);
			String monthResult = price.format(monthSalaryWithBon2);
			String taxResult = price.format(tax);
			
			System.out.println("Your salary per DAY is: "+dayResult+" before tax."+"\n"+
								"Your salary per WEEK is: "+weekResult+" before tax."+"\n"+
								"Your salary per MONTH is: "+monthResult+" after tax."+"\n"+
								"You paid "+taxResult+" tax"+"\n"+
								"You working "+hours*days*MONTH+" hours in a month!");
		
			
		}
		

	}

}									//monthSalary = monthSalary - ((6330*0.1)+(SECOND_STEP));
