package codingTest;

import java.util.Scanner;

public class Q1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0 || a==1) {
			if(a==0)
				System.out.println(1);
			if(a==1)
				System.out.println(0);
		}
		else
			System.out.println("숫자 0 또는 1만 입력하세요");
	}

}
