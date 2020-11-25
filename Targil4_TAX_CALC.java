import javax.swing.JOptionPane;

public class Targil4_TAX_CALC {

	public static void main(String[] args) {
		
		final int discOnKid = 300;
		final int discOnGuliver = 400;
		int salary = 0;
		int age = 0;
		int kids = 0;
		int guliver = 0;
		
		
		salary = Integer.parseInt(JOptionPane.showInputDialog("What is your salary?"));
		age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		kids = Integer.parseInt(JOptionPane.showInputDialog("How a=many kids do you have?"));
		guliver = JOptionPane.showConfirmDialog(null, "Do you live next to guliver?");
		
		if (salary < 0 || age < 0 || kids < 0) {
			JOptionPane.showMessageDialog(null, "Invalid Inputs"); return;
		}
		
		final double FIRST_STEP = (salary-5000)*0;
		final double SECOND_STEP = (salary-5000)*0.1;
		final double THIRD_STEP = (salary-10000)*0.35;
		final double FOURTH_STEP = (salary-15000)*0.5;
		final double UNDER_AGE_FIRST_STEP = (salary-5000)*0;
		final double UNDER_AGE_SECOND_STEP = (salary-5000)*0.05;
		final double UNDER_AGE_THIRD_STEP = (salary-5000-5000)*0.175;
		final double UNDER_AGE_FOURTH_STEP = (salary-5000-5000-5000)*0.25;
		
		//System.out.println(UNDER_AGE_FIRST_STEP);
		//System.out.println(UNDER_AGE_SECOND_STEP);
		//System.out.println(UNDER_AGE_THIRD_STEP);
		//System.out.println(UNDER_AGE_FOURTH_STEP);
		
		if (salary <= 5000 && age < 18 && kids == 0) { //UNDER WITHOUT KIDS
			JOptionPane.showMessageDialog(null, "Your salary is: "+salary +"\n"+
												"You need to pay "+UNDER_AGE_FIRST_STEP+"¤ tax");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 0) {
			JOptionPane.showMessageDialog(null, "Your salary is: "+salary+"\n"+
                    "You need to pay "+UNDER_AGE_SECOND_STEP+"¤ tax");
		}else if (salary <= 15000 && salary > 10000 && age < 18 && kids == 0) {
			JOptionPane.showMessageDialog(null, "Your salary is: "+salary+"\n"+
							"You need to pay "+((salary-5000-5000)*0.05+UNDER_AGE_THIRD_STEP)+"¤ tax");	
		}else if (salary > 15000 && age < 18 && kids == 0) {
			JOptionPane.showMessageDialog(null, "Your salary is: "+salary+"\n"+
				"You need to pay "+(((salary-5000-5000-5000)*0.05)+((salary-5000-5000-5000)*0.175)+UNDER_AGE_FOURTH_STEP)+"¤ tax");
			
		}else if (salary <= 5000 && age < 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) { //UNDER AGE WITH KIDS **DOESNT** LIVE NEXT TO GILVER
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 5000 && age < 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) { 
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 5000 && age < 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 5000 && age < 18 && kids > 3 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids > 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
				"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
				"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids > 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000 && age < 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids > 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kid");
			
			
		}else if (salary <= 5000 && age < 18 && kids == 1 && guliver == JOptionPane.YES_OPTION) { //UNDER AGE WITH KIDS **LIVE NEXT TO GULIVER**
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 5000 && age < 18 && kids == 2 && guliver == JOptionPane.YES_OPTION) { 
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 5000 && age < 18 && kids == 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 5000 && age < 18 && kids > 3 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 1 && guliver == JOptionPane.YES_OPTION) { //SECOND TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 2 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids == 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 10000 && salary > 5000 && age < 18 && kids > 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need to get "+discOnGuliver+"¤ since you live next to guliver.");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 1 && guliver == JOptionPane.YES_OPTION) { //THIRD TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
				"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
				"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 2 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids == 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary >10000 && age < 18 && kids > 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((salary-10000)*0.1+THIRD_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000 && age < 18 && kids == 1 && guliver == JOptionPane.YES_OPTION) { // FOURTH TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids == 2 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids == 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000 && age < 18 && kids > 3 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You also need to get "+(3*discOnKid)+"¤ fund on your kid");
		
			
			
			
			
			//ADULTS***************************************************************
		}else if (salary <= 5000 && age >= 18 && kids < 1 && guliver == JOptionPane.NO_OPTION ) { //ADULT WITHOUT KIDS , DOESNT LIVE NEXT TO GULIVER
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You have no kids!");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids < 1 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You have no kids!");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids < 1 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You have no kids!");
		}else if (salary > 15000  && age >= 18 && kids < 1 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You have no kids!");
			
			
		}else if (salary <= 5000 && age >= 18 && kids < 1 && guliver == JOptionPane.YES_OPTION ) { //ADULT WITHOUT KIDS , LIVE NEXT TO GULIVER
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids < 1 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids < 1 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax");
		}else if (salary > 15000  && age >= 18 && kids < 1 && guliver == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax");
		
		
			
			
		}else if (salary <= 5000 && age >= 18 && kids == 1 && guliver == JOptionPane.NO_OPTION ) { //ADULT WITH KIDS , DOESNT LIVE NEXT TO GULIVER
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 5000 && age >= 18 && kids == 2 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 5000 && age >= 18 && kids == 3 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 5000 && age >= 18 && kids > 3 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 1 && guliver == JOptionPane.NO_OPTION ) { //SECOND TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 2 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 3 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids > 3 && guliver == JOptionPane.NO_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) { //THIRD TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids > 3 && guliver == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
						"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
						"You need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids == 1 && guliver == JOptionPane.NO_OPTION) { //FOURTH TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000  && age >= 18 && kids == 2 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids == 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids > 3 && guliver == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids");
			
			
			
			
			
			
		}else if (salary <= 5000 && age >= 18 && kids == 1 && guliver == JOptionPane.YES_OPTION ) { //ADULT WITH KIDS , LIVE NEXT TO GULIVER
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 5000 && age >= 18 && kids == 2 && guliver == JOptionPane.YES_OPTION  ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 5000 && age >= 18 && kids == 3 && guliver == JOptionPane.YES_OPTION  ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 5000 && age >= 18 && kids > 3 && guliver == JOptionPane.YES_OPTION  ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+FIRST_STEP+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 1 && guliver == JOptionPane.YES_OPTION ) { //SECOND TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 2 && guliver == JOptionPane.YES_OPTION  ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids == 3 && guliver == JOptionPane.YES_OPTION  ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 10000 && salary > 5000 && age >= 18 && kids > 3 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+SECOND_STEP+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids"+"\n"+
					"You also need get "+discOnGuliver+"¤ since you live next to guliver");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 1 && guliver == JOptionPane.YES_OPTION ) { //THIRD TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 2 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids == 3 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary <= 15000 && salary > 10000 && age >= 18 && kids > 3 && guliver == JOptionPane.YES_OPTION ) {
				JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
						"You need to pay "+((5000*0.1)+THIRD_STEP)+"¤ tax"+"\n"+
						"You need to get "+(3*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids == 1 && guliver == JOptionPane.YES_OPTION ) { //FOURTH TAX STEP
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kid");
		}else if (salary > 15000  && age >= 18 && kids == 2 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids == 3 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(kids*discOnKid)+"¤ fund on your kids");
		}else if (salary > 15000  && age >= 18 && kids > 3 && guliver == JOptionPane.YES_OPTION ) {
			JOptionPane.showMessageDialog(null, "Your salary is "+salary+"¤\n"+
					"You need to pay "+((5000*0.1)+(5000*0.35)+FOURTH_STEP)+"¤ tax"+"\n"+
					"You need to get "+(3*discOnKid)+"¤ fund on your kids");
		}
	}

}
