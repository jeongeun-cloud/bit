package controller;

import model.Account;
import view.InputView;

public class UpdateController implements Controller {

	@Override
	public void service() {
		
		int no = Integer.parseInt(numLable.getText().toString());
		
		String date = datetxt.getText();
		String customer = customertxt.getText();
		String product = producttxt.getText();
		String sales = InputView.sales;
		int quantity = Integer.parseInt(qauntitytxt.getText());
		int price = Integer.parseInt(pricetxt.getText());
		
		dao.update(new Account(no, date, customer, product, sales, quantity, price));

	}

}
