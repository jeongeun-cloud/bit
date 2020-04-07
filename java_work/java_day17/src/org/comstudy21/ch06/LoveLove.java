package org.comstudy21.ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LoveLove {
	private StringBuffer buffer;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	private String word;
	private StringTokenizer token;
	private String key, value;
	
	public LoveLove() {
		play();
	}
	
	public void play() {
		System.out.print(">> ");
		String str = scan.nextLine();
		buffer = new StringBuffer(str);
		System.out.println(buffer);
		
		while (true) {
			System.out.print("��� : ");
			word = scan2.next();
			if (word.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
			token = new StringTokenizer(word, "!");
			if (token.countTokens() != 2) {
				System.out.println("�߸� �� ����Դϴ�!");
			} else {
				key = token.nextToken();
				value = token.nextToken();
				int start = buffer.indexOf(key);
				if(start == -1){
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				int end = start + key.length();
				buffer.replace(start, end, value);
				System.out.println(buffer);
			}
		}
	}
	
	public static void main(String[] args) {
		new LoveLove();
	}
}
