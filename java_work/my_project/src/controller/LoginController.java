package controller;

import model.Employee;
import resource.R;
import view.MainFrame;

public class LoginController implements Controller, R {
	
	public String session;

	public LoginController() {

	}

	public LoginController(String id) {
		session = id;
		new MainFrame();
	}

	@Override
	public void service() {
		String id = idField.getText();
		String pw = pwField.getText();
		
		Employee employee = new Employee(id, pw);
		dao.login(employee);
		
	}

}
