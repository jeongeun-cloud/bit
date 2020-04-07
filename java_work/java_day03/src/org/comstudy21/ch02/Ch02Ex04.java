package org.comstudy21.ch02;

public class Ch02Ex04 {
	
	public static void main(String[] args) {
		// java.util 패키지
		// java.lang.String 클래스
		// 문자열 비교는 미교연산자 대신 equals() 함수를 사용한다.
		// == 연산으로 문자열을 비교하면 같은 객체인가를 비교한다.
		
		String str1 = "Korea Korea";
		String str2 = "Korea";
		
		if(str1.equals(str2)){
			System.out.println("같다");
		}else{
			System.out.println("같지 않다");
		}
		
		System.out.println("문자 r의 위치 : " + str1.indexOf('r')); // 앞에서 부터 찾기, 찾는 순간 종료
		System.out.println("문자 r의 위치2 : " + str1.lastIndexOf('r')); // 뒤에서부터 문자 찾기, 찾는 순간 종료
		System.out.println("str1의 2번 인덱스 : " + str1.charAt(2)); 
		
		
		String str3 = "korea apple mango banana hello";
		
		System.out.print("str3에 apple이 있나?");
		System.out.println(str3.contains("apple"));
		System.out.print("str3이 korea로 시작하는가?");
		System.out.println(str3.startsWith("korea"));
		System.out.print("str3이 hello로 끝나는가?");
		System.out.println(str3.endsWith("hello"));
		System.out.println("--------------------");
		System.out.println(str3.startsWith("korea") && str3.endsWith("hello"));
		
		System.out.println("종료!");
	}

}
