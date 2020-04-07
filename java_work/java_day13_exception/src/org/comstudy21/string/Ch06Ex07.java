package org.comstudy21.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


class People {
	String name;
	int age;
	String addr;
	String job;
	String phone;
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", addr=" + addr + ", job=" + job + ", phone=" + phone + "]";
	}

}


public class Ch06Ex07 {
	
	public static void main2(String[] args) {
		String str = "ȫ�浿|25|����� ���α�|���α׷���|010-1234-5678";
		StringTokenizer strtz = new StringTokenizer(str, "|");
		
		ArrayList<String> list = new ArrayList<>(); // ArrayList�� ó���� ����� ���� �ʾƵ� ��
		while(strtz.hasMoreTokens()) {
			list.add(strtz.nextToken());
		}
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		
		// CSV ����, TSV ...
		String str = "ȫ�浿|25|����� ���α�|���α׷���|010-1234-5678";
		StringTokenizer strtz = new StringTokenizer(str, "|");
		
		System.out.println(strtz.countTokens()); // 5���� ��������
		String[] strArr = new String[strtz.countTokens()]; // tokenũ�⸸ŭ �迭�� �����
		
		// �߶� ����ض�
//		while(strtz.hasMoreTokens()) {
//			System.out.println(strtz.nextToken());
//		}
		
		// �迭�� ��Ƽ� ����ض�
		int i = 0;
		while(strtz.hasMoreTokens()) {
			strArr[i++] = strtz.nextToken();
		}
		System.out.println(Arrays.toString(strArr));
		
		// ��ü�� ��Ƽ� ����ض� 
		People p = new People();
		p.name = strArr[0];
		p.age = Integer.parseInt(strArr[1]);
		p.addr = strArr[2];
		p.job = strArr[3];
		p.phone = strArr[4];
		
		System.out.println(p);
	}

}