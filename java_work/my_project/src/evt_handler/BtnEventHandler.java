package evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import resource.R;
import view.ButtonView;
import view.MainFrame;
import view.SignupView;

public class BtnEventHandler implements ActionListener, R {
	ButtonView target;
	

	public BtnEventHandler(ButtonView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == target.signup) {
				//System.out.println("�����ϱ�!");
				new SignupView();
			}
			
			if(btn == target.signin) {
				//System.out.println("�α���");
				loginContorller.service();
			}

		}

	}
	
	
	
}
