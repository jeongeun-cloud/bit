package view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {
	
	@Override
	public void display() {
		JLabel title = new JLabel(":::::: 고객 관리 시스템 ::::::");
		title.setFont(new Font("바탕체", Font.BOLD, 25));
		add(title);

	}

}
