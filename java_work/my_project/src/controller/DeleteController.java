package controller;

import model.Account;

public class DeleteController implements Controller {

	@Override
	public void service() {
		int no = Integer.parseInt(numLable.getText().toString());
		dao.delete(new Account(no, null, null, null, null, 0, 0, 0, null));
	}

}
