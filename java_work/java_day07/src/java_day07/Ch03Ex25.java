package java_day07;

// enum 선언하기
// 1) .java 선언
// 2) 클래스 안에 선언
// 3) 클래스 외부에 선언
//

enum Case {
	가위, 바위, 보
}

public class Ch03Ex25 {
	
	public static void main(String[] args) {
		// values()함수 : 열거형 상수를 배열로 반환
		// valueOf()함수 : 인수로 주어진 String과 같은 열거형 원소 찾기 - 같은 원소가 없으면 예외발생
		// ordinal()함수 : 열거된 순서를 정수로 반환
		
		System.out.println(Case.바위);
		Case c1 = Case.가위;
		Case c2 = Case.바위;
		Case c3 = Case.보;
		
		switch(c2){
		case 가위 : System.out.println("가위 선택!");break;
		case 바위 : System.out.println("바위 선택!");break;
		case 보 : System.out.println("보 선택!");break;
		}
		
		if(c2 == Case.바위){
			System.out.println("바위 입니다!");
		}
	}

}
