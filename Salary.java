import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Salary {                                                   //** SALARY____CALCULATOR **//

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		final double stage1Tax = 0.9; // 6,330
		final double stage2Tax = 0.86; // 6,331 - 9,080
		final double stage3Tax = 0.8; // 9,081 - 14,580
		final double stage4Tax = 0.69; // 14,581 - 20,260
		final double stage5Tax = 0.65; // 20,261 - 42,160
		final double stage6Tax = 0.53; // 42,161 - 54,300
		final double stage7Tax = 0.5; // 54,301 +
		
		final double minHrs = 8.5; // Minimum Hours to start get 125% bonus 
		final double minHrsSecondtBon = 10.5; // Minimum Hours to start get 150% bonus
		final double firstBon = 1.25; // Amount of first bonus
		final double secondBon = 1.5; // Amount of second bonus
		
		double salaryForHour = 0;
		double hours = 0; // Amount of working hours per day
		double bon1= 0;
		double salary = 0; 
		
		
		//String salaryForHours = JOptionPane.showInputDialog("What is your salary for 1 hour?");
		System.out.println("What is your salary for 1 hour?");
		//salaryForHour = Double.parseDouble(salaryForHours);
		salaryForHour = s.nextDouble();
		
		System.out.println("How many hour do you work per day?");
		hours = s.nextDouble();
		
		if(salaryForHour < 29.48 || salaryForHour > 200 || hours < 1) {
			System.out.println("Invalid number.");
			
		}else if(hours <= minHrs){
			salary = hours*salaryForHour;
			
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String resDay = price.format(salary);
			String resWeek = price.format(salary*6);
			String resMonth = price.format(salary*26);
			System.out.println("Salary per day: "+resDay);
			System.out.println("Salary per week: " + resWeek);
			System.out.println("Salary per month: " + resMonth);
			String afterStage1Tax = price.format(salary*26*stage1Tax);
			String afterStage2Tax = price.format(salary*26*stage2Tax);
			String afterStage3Tax = price.format(salary*26*stage3Tax);
			String afterStage4Tax = price.format(salary*26*stage4Tax);
			String afterStage5Tax = price.format(salary*26*stage5Tax);
			String afterStage6Tax = price.format(salary*26*stage6Tax);
			String afterStage7Tax = price.format(salary*26*stage7Tax);
		if(salary*26 <= 6330) 
			System.out.println("Salary per month After Tax: "+afterStage1Tax); // Stage 1 of Tax: 10%
		if(salary*26 > 6330 && salary*26 <= 9080) 
			System.out.println("Salary per month After Tax: "+afterStage2Tax); // Stage 2 of Tax: 14%
		if(salary*26 > 9080 && salary*26 <= 14580) 
			System.out.println("Salary per month After Tax: "+afterStage3Tax); // Stage 3 of Tax: 20%
		if(salary*26 > 14580 && salary*26 <= 20260) 
			System.out.println("Salary per month After Tax: "+afterStage4Tax); // Stage 4 of Tax: 31%
		if(salary*26 > 20260 && salary*26 <= 42160) 
			System.out.println("Salary per month After Tax: "+afterStage5Tax); // Stage 5 of Tax: 35%
		if(salary*26 > 42160 && salary*26 <= 54300) 
			System.out.println("Salary per month After Tax: "+afterStage6Tax); // Stage 6 of Tax: 47%
		if(salary*26 > 54300) 
			System.out.println("Salary per month After Tax: "+afterStage7Tax); // Stage 7 of Tax: 50%
		
		
			
		}else if(hours > minHrs && hours <= minHrsSecondtBon) {
			salary = (hours-minHrs)*salaryForHour*firstBon+minHrs*salaryForHour;
			
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String resDay = price.format(salary);
			String resWeek = price.format(salary*6);
			String resMonth = price.format(salary*26);
			System.out.println("Salary per day: "+resDay);
			System.out.println("Salary per week: " + resWeek);
			System.out.println("Salary per month: " + resMonth);
			String afterStage1Tax = price.format(salary*26*stage1Tax);
			String afterStage2Tax = price.format(salary*26*stage2Tax);
			String afterStage3Tax = price.format(salary*26*stage3Tax);
			String afterStage4Tax = price.format(salary*26*stage4Tax);
			String afterStage5Tax = price.format(salary*26*stage5Tax);
			String afterStage6Tax = price.format(salary*26*stage6Tax);
			String afterStage7Tax = price.format(salary*26*stage7Tax);
		if(salary*26 <= 6330) 
			System.out.println("Salary per month After Tax: "+afterStage1Tax); // Stage 1 of Tax: 10%
		if(salary*26 > 6330 && salary*26 <= 9080) 
			System.out.println("Salary per month After Tax: "+afterStage2Tax); // Stage 2 of Tax: 14%
		if(salary*26 > 9080 && salary*26 <= 14580) 
			System.out.println("Salary per month After Tax: "+afterStage3Tax); // Stage 3 of Tax: 20%
		if(salary*26 > 14580 && salary*26 <= 20260) 
			System.out.println("Salary per month After Tax: "+afterStage4Tax); // Stage 4 of Tax: 31%
		if(salary*26 > 20260 && salary*26 <= 42160) 
			System.out.println("Salary per month After Tax: "+afterStage5Tax); // Stage 5 of Tax: 35%
		if(salary*26 > 42160 && salary*26 <= 54300) 
			System.out.println("Salary per month After Tax: "+afterStage6Tax); // Stage 6 of Tax: 47%
		if(salary*26 > 54300) 
			System.out.println("Salary per month After Tax: "+afterStage7Tax); // Stage 7 of Tax: 50%
		
		
			
		}else if (hours >= minHrsSecondtBon) {
			bon1 = (minHrsSecondtBon-minHrs)*(salaryForHour*firstBon);
			salary = (hours-minHrsSecondtBon)*salaryForHour*secondBon + minHrs*salaryForHour + bon1;		
			
			NumberFormat price = NumberFormat.getCurrencyInstance();
			String resDay = price.format(salary);
			String resWeek = price.format(salary*6);
			String resMonth = price.format(salary*26);
			System.out.println("Salary per day: "+resDay);
			System.out.println("Salary per week: " + resWeek);
			System.out.println("Salary per month: " + resMonth);
			String afterStage1Tax = price.format(salary*26*stage1Tax);
			String afterStage2Tax = price.format(salary*26*stage2Tax);
			String afterStage3Tax = price.format(salary*26*stage3Tax);
			String afterStage4Tax = price.format(salary*26*stage4Tax);
			String afterStage5Tax = price.format(salary*26*stage5Tax);
			String afterStage6Tax = price.format(salary*26*stage6Tax);
			String afterStage7Tax = price.format(salary*26*stage7Tax);
		if(salary*26 <= 6330) 
			System.out.println("Salary per month After Tax: "+afterStage1Tax); // Stage 1 of Tax: 10%
		if(salary*26 > 6330 && salary*26 <= 9080) 
			System.out.println("Salary per month After Tax: "+afterStage2Tax); // Stage 2 of Tax: 14%
		if(salary*26 > 9080 && salary*26 <= 14580) 
			System.out.println("Salary per month After Tax: "+afterStage3Tax); // Stage 3 of Tax: 20%
		if(salary*26 > 14580 && salary*26 <= 20260) 
			System.out.println("Salary per month After Tax: "+afterStage4Tax); // Stage 4 of Tax: 31%
		if(salary*26 > 20260 && salary*26 <= 42160) 
			System.out.println("Salary per month After Tax: "+afterStage5Tax); // Stage 5 of Tax: 35%
		if(salary*26 > 42160 && salary*26 <= 54300) 
			System.out.println("Salary per month After Tax: "+afterStage6Tax); // Stage 6 of Tax: 47%
		if(salary*26 > 54300) 
			System.out.println("Salary per month After Tax: "+afterStage7Tax); // Stage 7 of Tax: 50%
		
		}

	}

}
