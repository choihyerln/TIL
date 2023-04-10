package codingTest;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[3];
		
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				System.out.println("짝수: " + arr[i]);
		}
	}
}