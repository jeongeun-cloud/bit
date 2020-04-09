package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ch09Ex07 extends MyFrame {
	Button playBtn = new Button("Play");
	Button stopBtn = new Button("Stop");
	Button openBtn = new Button("Open");
	
	
	Label label = new Label("버튼을 눌러주세요!");
	
	Panel panel = new Panel(new GridLayout(1, 3, 0, 5));
	Panel center = new Panel(new GridBagLayout());
	
	public Ch09Ex07() {
		panel.add(playBtn);
		panel.add(stopBtn);
		panel.add(openBtn);
		
		this.add("South", panel);
		
		center.add(label);
		this.add("Center", center);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch09Ex07();
	}

}
