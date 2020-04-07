package org.comstudy21.ch06;

import java.util.Random;
import java.util.Scanner;

class Person {
	String name;
	int[] numArr = new int[3];
	Random rand = new Random();
	public Person(String name) {
		this.name = name;
	}
	
	public boolean init() {
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = 1 + rand.nextInt(3);
		}
		if(numArr[0] == numArr[1] && numArr[1] == numArr[2]) {
			System.out.printf("\t %d %d %d %s님이 이겼습니다!",numArr[0],numArr[1],numArr[2], name);
			return true;
		} else {
			System.out.printf("\t %d %d %d 아쉽군요!",numArr[0],numArr[1],numArr[2]);
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class Game {
	public Scanner scan = new Scanner(System.in);
	
	public void play() {
		// 2명의 정보 입력
		Person[] pArr = new Person[2];
		for(int i=0; i<pArr.length; i++) {
			System.out.print(i+1 + "번째 선수 이름 >> ");
			String name = scan.next();
			pArr[i] = new Person(name);
		}
		boolean isTrue = false;
		int cnt = 0;
		scan.nextLine();
		while(!isTrue) {
			Person person = pArr[cnt%pArr.length];
			System.out.print("[" + person +"] : <Enter>");
			scan.nextLine();
			isTrue = person.init();
			System.out.println();
			cnt++;
		}
	}
	
	public static void main(String[] args) {
		new Game().play();
	}
}
