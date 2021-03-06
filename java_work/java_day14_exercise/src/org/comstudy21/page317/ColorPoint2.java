package org.comstudy21.page317;

public class ColorPoint2 extends Point {
	private String color;
	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint2() {
		this(0,0,"BLACK");
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
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint+ "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		System.out.println(cp + "입니다.");
	}
}
