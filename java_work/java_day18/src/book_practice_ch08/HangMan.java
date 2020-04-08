package book_practice_ch08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class HangMan {
	
	public static void game() throws FileNotFoundException {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(new FileReader("./words.txt"));
		Vector<String> wordVector = new Vector<>();
		
		while(scan.hasNext()) {
			String word = scan.nextLine();
			wordVector.add(word);	
		}
		
		// 랜덤으로 단어 하나 가져오기
		int idx = rand.nextInt(wordVector.size());
		String w = wordVector.get(idx);
		//System.out.println(w); // 테스트 (답확인)
		
		// 글자 가리기
		char re = '-';
		// 첫 번째 글자
		int hide = rand.nextInt(w.length());
		char c = w.charAt(hide);
		System.out.println( w.replace(c, re) );
				
		
		// 다섯 번 돌기
		int cnt = 0;
		while (cnt < 5) {
			System.out.print(">> ");
			String answer = scanner.next();

			// 답이 맞는지 확인
			if (answer.equals(Character.toString(c)) ) {
				System.out.println("정답");
				
				// 맞을 때
				System.out.print("Next(y/n)?");
				String yn = scanner.next();
				if (yn.equals("y")) {
					game();
				} else {
					System.exit(0);
				}
			} else {
				System.out.println("오답");
				cnt++;
				
				if(cnt == 5) {
					System.out.println("5번 실패 하였습니다");
					System.out.println("답은 : " + w);
					System.out.print("Next(y/n)? ");
					String yn = scanner.next();
					if (yn.equals("y")) {
						game();
					} else {
						System.exit(0);
					}
				}
			} 
		}
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		game();

	}

}
