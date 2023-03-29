package codingTest;

import java.util.Scanner;

public class Q1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		int num = (int)a+1;		// 다음 문자를 +1하기위해 숫자로 변환
		char b = (char)num;		// num을 아스키코드 기반 문자로 변환
		System.out.println(b);
	}
}
