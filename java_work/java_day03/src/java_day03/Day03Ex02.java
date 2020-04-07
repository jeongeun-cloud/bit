package java_day03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Day03Ex02 {

	public static void main(String[] args) {
		// window 창 생성
		
		Frame win = new Frame("My window");
		
		win.setSize(600,400);
		win.setVisible(true);
		
		win.add(new Button("확인 버튼"), BorderLayout.SOUTH);
		
		win.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("창을 닫습니다!");
				win.dispose();
				System.exit(0);
			}
			
		});

	}

}
