package controller;

import java.util.Vector;

public class SearchController implements Controller {

	@Override
	public void service() {
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		
		Vector<Vector> dataVector = dao.select(name, email, phone);
		dm.setDataVector(dataVector, columnIdentifiers);

	}

}
