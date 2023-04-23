package codingTest;

import java.util.Arrays;

public class Q1098 {

	public static void main(String[] args) {
		
		String[] kor= {"AAA", "BCD", "AAAAA", "ZY"};
		String[] usa= {"AB", "AA", "TTTT"};
		String[] incs = {"AB BCD AA AAA TTTT AAAAA", "BCD AAA", "AB AAA TTTT BCD", "AA AAAAA AB", "AAA AB BCD"};
		
		for (int i=0; i<incs.length; i++) {
			String[] arr = incs[i].split(" ");
			System.out.println(Arrays.toString(arr));
			
			for (String str : arr) {
				if (str.equals(kor[i]))
					System.out.println("존재합니다.");
			}
				
			}

	}
}