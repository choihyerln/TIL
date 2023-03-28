package codingTest;

import java.util.Scanner;

public class Q1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] arr = a.toCharArray();
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+arr[i]);
			for(int k=arr.length-1; k>i; k--) {
				System.out.print("0");
			}
			System.out.print("]\n");
		}
	}
}