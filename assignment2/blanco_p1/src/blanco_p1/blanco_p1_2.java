package blanco_p1;

import java.util.Scanner;

public class blanco_p1_2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter encrypted number: ");
		int encryptedNum = scnr.nextInt();
		
		//getting each digit
		int fourth = encryptedNum % 10;
		encryptedNum /= 10;
		
		int third = encryptedNum % 10;
		encryptedNum /= 10;
		
		int second = encryptedNum % 10;
		encryptedNum /= 10;
		
		int first = encryptedNum % 10;
		encryptedNum /= 10;
		
		//System.out.println(first + " " + second + " " + third + " " + fourth);
		
		//decrypting
		first -= 7;
		second -= 7;
		third -= 7;
		fourth -= 7;
		
		if(first < 0) {
			first += 10;
		}
		if(second < 0) {
			second += 10;
		}
		if(third < 0) {
			third += 10;
		}
		if(fourth < 0) {
			fourth += 10;
		}
		
		System.out.println("Decrypted: " + third + " " + fourth + " " + first + " " + second);

	}

}
