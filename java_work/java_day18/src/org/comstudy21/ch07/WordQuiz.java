package org.comstudy21.ch07;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class Word<K, V> extends Hashtable<K, V> {
	public Word(K key, V value) {
		super.put(key, value);
	}

}

public class WordQuiz {
	Vector<Word> v = new Vector<>();
	{
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("society", "사회"));
		v.add(new Word("human", "사람"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("emotion", "감정"));
	}
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	public WordQuiz() {
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 "+v.size()+"개의 단어가 들어 있습니다.");
		int no = 0;
		quiz : while(no != -1) {			
			// 단어 제시
			int idx = rand.nextInt(v.size());
			Word word = v.get(idx);
			String eng = (String)(word.keys()).nextElement(); // key 확보
			
			// 문제 보여주기
			System.out.println(eng + "?");
			
			// 지문을 set에 저장
			Set<String> values = new HashSet<>();
			String kor = (String)word.get(eng); // 답
			values.add(kor); // values.size() == 1
			
			// 지문 선정
			while(values.size() < 4) {
				idx = rand.nextInt(v.size()); // 새 랜덤 값
				word = v.get(idx); // 새 객체
				eng = (String)(word.keys()).nextElement(); // 영단어
				values.add((String)word.get(eng)); // 뜻을 set에 추가 
			}
			
			// 지문 출력
			String[] arr = new String[values.size()];
			values.toArray(arr);
			
			for(int i=0; i<arr.length; i++) {
				System.out.printf("(%d)%s ", i+1, arr[i]);
			}
			
			// no의 유효성 검사
			do {
				System.out.print(" :> ");
				no = scan.nextInt();
				if(no == -1) break quiz;
			} while(no<1 || no>arr.length);
			
			// 비교
			if(arr[no-1].equals(kor)) {
				System.out.println("Excellent !!");
			} else {
				System.out.println("No!!");
			}
			
			
		}
		System.out.println("\"명품영어\"를 종료합니다...");
		
	}

	public static void main(String[] args) {
		new WordQuiz();
		
	}

}
