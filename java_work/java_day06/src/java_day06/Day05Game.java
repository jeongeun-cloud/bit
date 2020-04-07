package java_day06;

import java.util.Scanner;

public class Day05Game {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		char yn = 'y'; // 재실행 여부
		do {
			int num = 0; // 시스템이 난수 발생 시켜 줄 것이다.
			int userNum = 0; // 사용자 입력
			int cnt = 5; // 시도 가능 횟수
			int min = 1, max = 100; // 입력 범위
			
			// 시스템이 난수를 만들어 준다.
			num = min + (int)Math.abs(Math.floor(Math.random()*max));
		//	System.out.printf("시스템이 번호를 선택했습니다. (힌트 : %d)\n", num);
			
			// cnt 만큼 반복한다
			while (cnt > 0) {
				System.out.println("시스템이 선택한 번호를 맞춰주세요!");
				System.out.printf("사용자 입력(%d~%d사이) : ", min , max );
				userNum = scan.nextInt();
				// 유효성 검사
				while(!(userNum>=min && userNum<=max)){
					System.out.println("경고 : 범위를 벗어난 값이 입력되었습니다!");
					System.out.printf("다시 입력(%d~%d사이) : ", min , max );
					userNum = scan.nextInt();
				}
				
		//		System.out.println("사용자 번호 입력 성공!");
				
				if(userNum == num){
					System.out.println("정답 입니다");
					break;
				} else if(userNum > num) {
					System.out.println("너무 큰 숫자를 입력했습니다");
					max = userNum - 1;
				} else if(userNum <num){
					System.out.println("너무 작은 숫자를 입력했습니다");
					min = userNum + 1;
				}
				cnt --;
				System.out.println("(남은 시도 횟수 : " + cnt);
			}
			
			if(cnt == 0){
				System.out.println("기회가 모두 소진되어 실격 했습니다");
			}
			
			System.out.print("게임을 다시 시도하시겠습니까? [y/n]");
			yn = scan.next().charAt(0);
			while(!(yn == 'y' || yn == 'n')){
				System.out.println("y또는 n만 입력 해 주세요");
				System.out.print("게임을 다시 시도하시겠습니까? [y/n]");
				yn = scan.next().charAt(0);
			}
			
		}while(yn == 'y');
		
		System.out.println("게임 종료! 다음에 또 만나요~");
	}

}
