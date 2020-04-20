package view;

import javax.swing.JButton;

import evt_handler.BtnEventHandler;

public class ButtonView extends View {
	public JButton signup = new JButton("ȸ������");
	public JButton signin = new JButton("�α���");
	
	public ButtonView() {
		init();
		start();
	}

	@Override
	public void init() {
		add(signup);
		add(signin);

	}

	@Override
	public void start() {
		BtnEventHandler handler = new BtnEventHandler(this);
		signup.addActionListener(handler);
		signin.addActionListener(handler);

	}

}
