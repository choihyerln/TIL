package codingTest;

import java.util.Scanner;

public class Q1076doWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.nextLine().charAt(0);
		char a = 'a';
		
		do {
			System.out.print(a+" ");
			a+=1;
		} while(a<=n);
	}

}
