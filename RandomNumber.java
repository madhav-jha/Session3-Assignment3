package session3.assignment3;

import java.util.Scanner;
import java.util.Random;;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		Random rn = new Random();
		
		System.out.println("Random number between 0 and "+number+" is "+rn.nextInt(number));

	}

}
