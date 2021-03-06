package book_practice;

import java.util.StringTokenizer;

// 이론문제 4번
public class Ch06Ex04 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6",",=");
		int total = 0;
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
			if(Character.isDigit(token.charAt(0))){ // boolean isDisit(char ch); 문자를 숫자인지 판별
				total += Integer.parseInt(token); // String 을 Int형으로 형변환 하기 위한 메소드 Integer.parseInt
			}
		}
		System.out.println("합은 " + total);
	}
}
