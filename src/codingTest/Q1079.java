package codingTest;

import java.util.Scanner;

public class Q1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		char q = 'q';
		
		while(true) {
			a = sc.nextLine().charAt(0);
			if (a==q) {
				System.out.println(a);
				break;
			}
			System.out.println(a);
		}
	}

}
