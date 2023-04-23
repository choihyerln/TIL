package codingTest;

public class Q1097 {
	
	public static void main(String[] args) {
		
		String number = "12156";
    	
        int[] numPad = {1,2,3,4,5,6,7,8,9,0};
        int count = 0;
        int index = 0;
        
        for (int i = 0; i < number.length(); i++) {
            int current = number.charAt(i) - '0'; // char to int 변환
            
            // 인덱스 계산
            int left = index - current;
            int right = index + current;
            
            // 더 적은 버튼 수로 이동
            if (left >= 0 && (right >= numPad.length || numPad[left] < numPad[right])) {
                count += left - index;
                index = left;
            } else if (right < numPad.length) {
                count += right - index;
                index = right;
            }
        }
        System.out.println(count);
    }
}