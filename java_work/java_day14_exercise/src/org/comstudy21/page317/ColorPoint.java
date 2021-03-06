package org.comstudy21.page317;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	private void setXY(int x, int y) {
		move(x, y);
	}
	
	private void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 " + super.toString();
	}

	
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
