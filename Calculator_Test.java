import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("How many hours do you work (per month)?");
		double hours = s.nextDouble();
		System.out.println("What is your salary? (per hour)?");
		double sal = s.nextDouble();

		double finSalary = sal * hours;
		NumberFormat price = NumberFormat.getCurrencyInstance();
		String curr = price.format(finSalary);
		System.out.println("Salary before tax: " + curr);

		int[] arr = { 6290, 9030, 14490, 20140, 41910, 53970, 53971 };
		double[] precent = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		double[] charge = new double[arr.length];
		charge[0] = arr[0] * precent[0];
		for (int i = 1; i < arr.length; i++) {
			charge[i] = (arr[i] - arr[i - 1]) * precent[i];
		}
		charge[arr.length - 1] = (finSalary - arr[arr.length - 1]) * precent[arr.length - 1];
		int step = 0;
		for (int i = 0; i < arr.length; i++) {
			if (finSalary > arr[i]) {
				step = i;
			}
		}
		int cut = 0;
		for (int i = 0; i <= step; i++) {
			cut += charge[i];
		}
		if (step < 6 && step != 0) {
			cut += (finSalary - arr[step]) * precent[step+1];
			finSalary -= cut;
		} else if (step == 0) {
			cut += (finSalary - arr[step]) * precent[step];
		} else {
			finSalary -= cut;
		}
		curr = price.format(cut);
		System.out.println("Tax to pay: " + curr);
		curr = price.format(finSalary);
		System.out.println("Final salary: " + curr);

	}

}
