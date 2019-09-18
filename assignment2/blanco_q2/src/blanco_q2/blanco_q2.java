package blanco_q2;

import java.util.Scanner;

public class blanco_q2 {

		public static void main(String[] args) {
			
			Scanner scnr = new Scanner(System.in);
			int weight = 0;
			double height = 0.0;
			double BMI = 0.0;
			
			System.out.print("BMI CALCULATOR\nSelect 1.Standard or 2.Metric : ");
			int choice = scnr.nextInt();
			
			
			if(choice == 1) {
			//standard
				System.out.print("Enter your weight(pounds): ");
				weight = scnr.nextInt();
				System.out.print("Enter your height(inches): ");
				height = scnr.nextDouble();
				
				BMI = (703 * weight)/(height * height);
				
				System.out.printf("Your BMI: %.1f\n", BMI);	
				
			}else if(choice == 2) { 
			//metric
				System.out.print("Enter your weight(kilograms): ");
				weight = scnr.nextInt();
				System.out.print("Enter your height(meters): ");
				height = scnr.nextDouble();
				
				BMI = weight / (height * height);
				
				System.out.printf("Your BMI: %.1f\n", BMI);
				
			}else {
				System.out.print("Not an option. Enter 1 or 2. Start again.");
			}
			
			System.out.println("*** BMI CATEGORIES ***");
			System.out.print("Underweight = <18.5\nNormal Weight = 18.5-24.9\nOverweight = 25-29.9\nObesity = 30+");
			

		}
}



