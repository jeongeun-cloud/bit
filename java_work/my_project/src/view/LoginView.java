package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import resource.R;

public class LoginView extends View {
	JPanel pane = new JPanel(new GridLayout(2,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();	
	
	public LoginView() {
		init();
	}

	@Override
	public void init() {
		
		p1.add(new JLabel("��  ��  �� :  "));
		p1.add(idField);
		p2.add(new JLabel("��й�ȣ : "));
		p2.add(pwField);
		
		pane.add(p1);
		pane.add(p2);
		
		add(pane);

	}

	@Override
	public void start() {

	}

}
