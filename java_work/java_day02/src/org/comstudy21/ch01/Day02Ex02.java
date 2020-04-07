package org.comstudy21.ch01;
/**
 * print(), println(), printf() g함수를 적절히 사용해서 다음 내용 출력
 * 1. 성명
 * 2. 나이
 * 3. 사는곳
 * 4. 전공
 * 5. 직업
 * 6. 특기
 * 7. 키
 * 8. 시력
 * 9. 혈액형
 * 10. 장래희망
 *
 */

// static import로 out 필드 객체 불러오기
// import 프로젝트 외부에 선언된 클래스나 객체를 불러온다.
// 원칙적으로 System 클래스도 import 해야 한다.
// java.lang 패키지는 디폴트 패키지이므로 import를 생략 가능 (import java.lang.System;)
// java.lang.System.out.println 원래 이렇게 써야함 


// import java.lang.System; -- 생략 가능 
import static java.lang.System.out;
import static java.lang.System.err;

public class Day02Ex02 {

	public static void main(String[] args){
		
//		java.lang.System.out.println(""); -- 원래 이렇게 써야함
		out.println("--- 자기 소개 ---");
		
		err.println("에러메세지 : 주의!"); // 쓰레드가 달라서 위치가 뒤바뀔수있음.
	
	}

}



/*public class Day02Ex02 {

public static void main(String[] args){
	
	System.out.println("--- 자기 소개 ---");
	System.out.printf("성명 : %s , 나이 : %d ", "주정은", 26 );
	System.out.println();
	System.out.println("사는곳 : 서울시 동대문구 용두동");
	System.out.println("전공 : " + "컴퓨터 과학과");
	System.out.print("직업 : 학원 수강생 \n");
	System.out.printf("키 : %d, 시력 : %.1f, 혈액형 : %s", 163 , 0.4, "O형\n");
	System.out.print("장래희망 : 개발자 ");
			
	}

}
*/