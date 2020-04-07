package org.comstudy21.ch04;

import org.comstudy21.ch04.access.AccessSuper;

public class AccessSub extends AccessSuper {

	public void ShowAccessSuper() {
		printLine(60);
		// private 멤버는 서브클래스에서도 접근 불가능
		//System.out.println("m_pri = " + m_pri);
		// default 는 다른 패키지라서 안됨
		//System.out.println("m_def = " + m_def);
		// protected 멤버는 패키지가 달라도 상속 받으면 public이다.
		System.out.println("m_pro = " + m_pro);
		System.out.println("m_pub = " + m_pub);
		printLine(60);
	}
	
	public void printLine(int size) {
		for(int i=0; i<50; i++) {
			System.out.println("-");
		}
		System.out.println();
	}
}
