package ch05_exercise;

class Pen {
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
}

class SharpPencil extends Pen {
	private int width; // private�̸� �ܺο��� ����� �� ���� ������ ���Ͱ��� �ʿ�
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
}

class Ballpen extends Pen {
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}

class Fountainpen extends Ballpen {
	public void refil(int n) {super.setAmount(n);}
}

public class Ch05Ex03 {
	public static void main(String[] args) {

	}
}
