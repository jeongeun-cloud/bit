package org.comstudy21.view;

import org.comstudy21.model.People;

public class Input implements PhonebookView {
	public static int sequence = 0;
	@Override
	public void display() {
		People p = new People(); // 객체 생성
		
		System.out.println(":::: 입력 기능 ::::");
		p.setIdx(sequence++);
		System.out.print("성명 입력 : ");
		p.setName(scan.next());
		System.out.print("번호 입력 : ");
		p.setPhone(scan.next());
		
		data.people = p; // p를 data의 people에 저장
		System.out.println("정보 입력 완료!");

	}

}
