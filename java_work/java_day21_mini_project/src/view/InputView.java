package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends View {
	
	
	@Override
	public void display() {
		JPanel pane = new JPanel(new GridLayout(4,1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();

		p1.add(new JLabel("No : "));
		p2.add(new JLabel("성         명 : "));
		p2.add(nameField);
		p3.add(new JLabel("이  메  일 : "));
		p3.add(emailField);
		p4.add(new JLabel("전화번호 : "));
		p4.add(phoneField);
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		
		add(pane);

	}
	
}
