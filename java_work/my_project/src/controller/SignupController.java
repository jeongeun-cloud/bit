package controller;

import model.Employee;
import view.SignupView;

public class SignupController implements Controller {

	@Override
	public void service() {
		String id = idtxt.getText();
		String pw = pwtxt.getText();
		String name = nametxt.getText();
		String email = emailtxt.getText();
		String birth = birthtxt.getText();
		String code = codetxt.getText();
		String gender = SignupView.gender;
				
		Employee dto = new Employee(0, id, pw, name, email, birth, gender, code);		
		dao.signup(dto);
		
	}

}
