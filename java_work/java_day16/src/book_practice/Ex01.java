package book_practice;

class MyPoint {
	int x, y;
	public MyPoint() {
		// TODO Auto-generated constructor stub
	}
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q)) {
			System.out.println("같은 점");
		}else{
			System.out.println("다른 점");
		}
	}
}
