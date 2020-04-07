package org.comstudy21.ch04.access;

public class AccessSuper {
	private int m_pri = 10;
	int m_def = 20;
	protected int m_pro = 30;
	public int m_pub = 40;
	
	public void ShowAccessSuper() {
		printLine(60);
		System.out.println("m_pri = " + m_pri);
		System.out.println("m_def = " + m_def);
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
