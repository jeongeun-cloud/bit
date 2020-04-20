package model;

public class Account {
	int no;
	String salseDate;
	String customer;
	String product;
	String salse;
	int quantity;
	int price;
	int total;
	String uid;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int no, String salseDate, String customer, String product, String salse, int quantity, int price) {
		this.no = no;
		this.salseDate = salseDate;
		this.customer = customer;
		this.product = product;
		this.salse = salse;
		this.quantity = quantity;
		this.price = price;
	}

	public Account(int no, String salseDate, String customer, String product, String salse, int quantity, int price,
			int total, String uid) {
		this.no = no;
		this.salseDate = salseDate;
		this.customer = customer;
		this.product = product;
		this.salse = salse;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
		this.uid = uid;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSalseDate() {
		return salseDate;
	}

	public void setSalseDate(String salseDate) {
		this.salseDate = salseDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSalse() {
		return salse;
	}

	public void setSalse(String salse) {
		this.salse = salse;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Account [no=" + no + ", salseDate=" + salseDate + ", customer=" + customer + ", product=" + product + ", salse="
				+ salse + ", quantity=" + quantity + ", price=" + price + ", total=" + total + ", uid=" + uid + "]";
	}

}
