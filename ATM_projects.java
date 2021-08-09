package nameprojects;

import java.util.Scanner;

public class ATM_projects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insert your card:");
		int n = sc.nextInt();
		int balance = 500000;
		System.out.println("your balance is:"+balance);
		Scanner scn = new Scanner(System.in);
		System.out.println("withdraw");
		System.out.print("type your amount for withdraw:");
		int withdraw = scn.nextInt();
		int c = balance-withdraw;
		int d = balance;
		if (balance<withdraw) {
			System.out.println("invalid amount");		
			System.out.println("your updated balance is:"+d);
		}else if (withdraw<balance) {
			System.out.println("your updated balance:"+c);
		}
		
		System.out.println("wanna deposit,press any number");
		Scanner scm = new Scanner (System.in);
		int m = scm.nextInt();
		Scanner scc = new Scanner (System.in);
		System.out.println("deposit:");
		System.out.println("Enter your amount:");
		int r = scc.nextInt();
		int j = c+r;
		System.out.println("your updated balance is:"+j);
		System.out.println("Thank you!");
		
		
		
		
		
		
		
	}

}
