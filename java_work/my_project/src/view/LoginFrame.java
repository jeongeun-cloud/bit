package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LoginFrame extends JFrame {
	
	public LoginFrame() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		add(BorderLayout.NORTH, new TitleView());
		add(BorderLayout.CENTER, new LoginView());
		add(BorderLayout.SOUTH, new ButtonView());
		
		setSize(500, 420);
		setVisible(true);
	}

}
