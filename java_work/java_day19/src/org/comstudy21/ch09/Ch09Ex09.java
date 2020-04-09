package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener {
	Ch09Ex09 window;
	
	// ���� �ٲ�� �ϱ� ���ؼ��� (Ŭ������ ������ ������ ��)
	// ButtonHandler(this)��ü�� ������ �����ڸ� �����ؼ� ���� �� actionPerformed
	public ButtonHandler(Ch09Ex09 window) {
		this.window = window; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			//System.out.println(btn.getLabel() + " ��ư ������!");
			window.label.setText(btn.getLabel() + " ��ư ������!");
		}	
	}
}

public class Ch09Ex09 extends MyFrame {
	Button playBtn = new Button("Play");
	Button stopBtn = new Button("Stop");
	Button nextBtn = new Button("Next");
	Button prevBtn = new Button("Prev");
	
	Label label = new Label("��ư�� �����ּ���!");
	
	Panel panel = new Panel(new GridLayout(1, 3, 0, 5));
	Panel panel2 = new Panel(new GridLayout(2, 1, 5, 0));
	Panel center = new Panel(new GridBagLayout());
	
	public Ch09Ex09() {
		panel.add(playBtn);
		panel.add(stopBtn);
		panel.add(panel2);
		panel2.add(nextBtn);
		panel2.add(prevBtn);
		
		this.add("South", panel);
		
		center.add(label);
		this.add("Center", center);
		
		play();
		
		setVisible(true);
	}
	
	private void play() {
		ButtonHandler handler = new ButtonHandler(this);
		playBtn.addActionListener(handler);
		stopBtn.addActionListener(handler);
		nextBtn.addActionListener(handler);
		prevBtn.addActionListener(handler);
	}

	public static void main(String[] args) {
		new Ch09Ex09();
	}


}