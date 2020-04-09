package org.comstudy21.ch09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ch09Ex01 {
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640, 400);
		
		frame.addWindowListener(new WindowAdapter() {
			// WindowListener �������̽��� �ƴ���
			// ���Ǵ� �߻�޼��常 ���� ���� 
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void test(String[] args) {
		Frame frame = new Frame();
		frame.setSize(640, 400);
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		
		// �������� ����� �������� �����Ѵ�.
		frame.setVisible(true);
		
	}

}
