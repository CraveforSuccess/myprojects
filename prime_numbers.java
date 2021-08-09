package nameprojects;

import java.util.Scanner;

public class prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		int n =sc.nextInt();
		int m = n%2;
		if (m!=0) {
			System.out.println("the number is odd");
		}else {
			System.out.println("the number is even");
		}

	}

}
