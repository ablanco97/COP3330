package blanco_03;

import java.util.Scanner;

public class blanco_03 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"Battery Life", "Camera Quality", "Processor Type", "Water Resistance", "Color Options"};
		int[][] responses = new int[5][10];
		
		int[] sum = new int[] {0,0,0,0,0};
		int average = 0;
		
		
		//asking the polling question
		System.out.print("How many people are taking the poll? ");
		int numPeople = scnr.nextInt();
		
		System.out.println("How important are these features to you when buying a new phone? (1-10)");
		
		//loop for recording responses
		for(int i=0; i<numPeople; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(topics[j] + ": ");
				responses[j][i] = scnr.nextInt();
			}
			if(i<numPeople-1) {
			System.out.println("** Next person **");
			}
		}
		
		//display results
		System.out.println("*** Results Summary ***");
		System.out.format("%20s%10s", "Topics", "| Responses");
		
		//table data
		for(int i=0; i<5; i++) {
			System.out.format("\n%20s: ",topics[i]);
			
			for(int j=0; j<numPeople; j++) {
				System.out.format("%2d", responses[i][j]);
				sum[i] += responses[i][j];
			}
			
			average = sum[i]/numPeople;
			System.out.format("\tAverage: %2d", average);
		}
		
		//highest & lowest result
		int high = sum[0];
		int low = sum[0];
		int highNum=0, lowNum=0;
		
		for(int i=0; i<5; i++) {
			if(high < sum[i]) {
				high = sum[i];
				highNum = i;
			}
			if(low > sum[0]) {
				low = sum[0];
				lowNum = i;
			}
		}
		
		System.out.println("\nHighest Point Total: " + topics[highNum] + " with " + high + " points.");
		System.out.println("Lowest Point Total: " + topics[lowNum] + " with " + low + " points.");
	}

}
