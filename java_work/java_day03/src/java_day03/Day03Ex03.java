package java_day03;

public class Day03Ex03 {
	
	//함수를 선언한다.
	static void output(){ 
	//void 대신 String, int도 가능한데, 그럴 경우 타입과 맞는 return 을 해줘야 함 (예: return ""; or return 0;)
	//static int output()
		
		String name = "Ju";
		int age = 16;
		
		System.out.printf("[2] 성명: %s, 나이 : %d\n", name, age);
		
		//return 0; or return age;
	}
	
	public static void main(String[] args){
		//static 멤버는 static 멤버만 접근 가능하다.
		System.out.println("[1] 메인함수...");
		output(); //호출
		// int 로 선언후 return 정수로 해줬으면, int result = output(); 이렇게 정수로 받아야 함 
		// int result = output();
		
		//System.out.println("result => " + result);
		System.out.println("[3] 프로그램 종료! ");

	}
}
