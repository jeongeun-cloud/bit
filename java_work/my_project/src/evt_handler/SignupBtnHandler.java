package evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Employee;
import resource.R;
import view.SignupView;

public class SignupBtnHandler implements ActionListener, R {
	SignupView target;

	public SignupBtnHandler(SignupView target) {
		this.target = target;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == target.checkBtn) {
				//System.out.println("중복확인");
				Employee employee = new Employee(idtxt.getText());
				dao.idCheck(employee);
			}
			
			if(btn == target.signOkBtn) {
				signupController.service();
			}

		}

	}


}
