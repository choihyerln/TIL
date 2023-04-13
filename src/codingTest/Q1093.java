package codingTest;

import java.util.Scanner;

public class Q1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[23];
        int n = sc.nextInt();
        
        // 입력문 : n회만큼 반복, i=0부터니까 sc.nextInt()-1
        for (int i=0; i<n; i++) {
            arr[sc.nextInt()-1]++;
        }
        
        // 배열 arr[0]~arr[22] 출력하라
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}