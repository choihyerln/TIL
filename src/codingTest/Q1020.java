package codingTest;

import java.util.Scanner;

public class Q1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = a.split("-");	// 2개의 문자열로 -> 주민번호 앞자리,뒷자리 나뉨
		System.out.println(b[0]+b[1]);
	}
}