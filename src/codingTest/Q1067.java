package codingTest;

import java.util.Scanner;

public class Q1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a>0) {
			if (a%2==0)
				System.out.println("plus+even");
			else
				System.out.println("plus+odd");
		}
		else if (a==0)
			System.out.println(0);
		else {
			if (a%2==0)
				System.out.println("minus+even");
			else
				System.out.println("minus+odd");
		}
	}
}