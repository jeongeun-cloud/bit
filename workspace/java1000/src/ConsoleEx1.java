
// [문제1] 에제를 실행하면 '>>'와 같은 프롬프트가 나타나서 사용자의 입력을 기다리고,
// 사용자가 입력한 내용을 화면에 출력한다. 만일 사용자가 'q' 또는 'Q'를 입력하면 프로그램을 종료한다.
// 다음의 예제를 완성하세요.

import java.util.*;

class ConsoleEx1 {
	public static void main(String[] args) {
		while(true) {
			String prompt = ">> ";
			System.out.print(prompt); 

			/*
                     다음과 같은 내용의 코드를 넣으세요.                  
             1. 화면으로부터 라인단위로 입력받는다.  - java.util.Scanner클래스 사용
             2. q 또는 Q를 입력하면 실행종료한다.
			 */
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			
			System.out.println(str);

		} // while(true)
	} // main
} // class
