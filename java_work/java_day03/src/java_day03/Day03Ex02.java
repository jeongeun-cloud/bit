package java_day03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day03Ex02 {

	public static void main(String[] args) {
		// window â ����
		
		Frame win = new Frame("My window");
		
		win.setSize(600,400);
		win.setVisible(true);
		
		win.add(new Button("Ȯ�� ��ư"), BorderLayout.SOUTH);
		
		win.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("â�� �ݽ��ϴ�!");
				win.dispose();
				System.exit(0);
			}
			
		});

	}

}
