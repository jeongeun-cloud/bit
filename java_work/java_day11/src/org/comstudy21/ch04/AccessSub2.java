package org.comstudy21.ch04;

import org.comstudy21.ch04.access.AccessSuper;

public class AccessSub2 {

	public void ShowAccessSuper() {
		printLine(60);
		AccessSuper as = new AccessSuper();
//		System.out.println("m_pri = " + as.m_pri);
//		System.out.println("m_def = " + as.m_def);
//		// �ܺ� ��Ű������ ��� ���� ������ protected ���� �Ұ���
//		System.out.println("m_pro = " + as.m_pro);
		// ��� ���� �ʾƵ� ��ü�� ���ؼ��� public ���� ����
		System.out.println("m_pub = " + as.m_pub);
		printLine(60);
	}
	
	public void printLine(int size) {
		for(int i=0; i<50; i++) {
			System.out.println("-");
		}
		System.out.println();
	}
}
