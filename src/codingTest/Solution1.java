package codingTest;

public class Solution1 {
	
	public static void main(String[] args) {
		
		String number = "12156";
		
	    int count = 0;
	    int prev = -1; // 이전 입력했던 숫자를 저장하는 변수
	    for (char c : number.toCharArray()) {
	        int cur = c - '0'; // 현재 입력할 숫자
	        if (prev == -1) {
	            count++; // 첫 번째 숫자는 그냥 입력해야 함
	        } else {
	            int diff = Math.abs(cur - prev); // 현재와 이전 숫자의 차이
	            if (diff == 0) {
	                count += 2; // 같은 숫자를 누르면 오른쪽 숫자가 같이 눌리므로 두 번 입력해야 함
	            } else {
	                count++; // 다른 숫자를 누르면 그냥 한 번 입력하면 됨
	                if (diff == 9) count++; // 차이가 9이면 백스페이스도 눌러야 함
	            }
	        }
	        prev = cur;
        }
        System.out.println(count);
    }
}