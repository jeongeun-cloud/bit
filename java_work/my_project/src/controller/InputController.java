package controller;

import model.Account;
import model.Employee;
import view.InputView;

public class InputController implements Controller {

	@Override
	public void service() {
		String date = datetxt.getText();
		String customer = customertxt.getText();
		String product = producttxt.getText();
		String sales = InputView.sales;
		int quantity = Integer.parseInt(qauntitytxt.getText());
		int price = Integer.parseInt(pricetxt.getText());

		
		Account dto = new Account(0, date, customer, product, sales, quantity, price);
		
		dao.input(dto);
		

	}

}
