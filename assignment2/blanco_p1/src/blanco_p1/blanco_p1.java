package blanco_p1;

import java.util.Scanner;

public class blanco_p1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a 4-digit number: ");
		int originalNum = scnr.nextInt();
		
		//getting each digit
		int four = originalNum % 10;
		originalNum /= 10;
		
		int three = originalNum % 10;
		originalNum /= 10;
		
		int two = originalNum % 10;
		originalNum /= 10;
		
		int one = originalNum % 10;
		originalNum /= 10;
		
		//encrypting
		one = (one + 7) % 10;
		two = (two + 7) % 10;
		three = (three + 7) % 10;
		four = (four + 7) % 10;
		
		System.out.println("Encrypted: " + three + " " + four + " " + one + " " + two);
	}
}
