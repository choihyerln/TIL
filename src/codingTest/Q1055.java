package codingTest;

import java.util.Scanner;

public class Q1055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a==0||a==1) && (b==0||b==1)) {
			if(a==1||b==1)
				System.out.println(1);
			else
				System.out.println(0);
		}
		else
			System.out.println("숫자 0 또는 1만 입력해주세요");
				
	}

}
