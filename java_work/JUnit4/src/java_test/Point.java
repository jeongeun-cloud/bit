package java_test;

class Point3D extends Point {
	int z;
	
	public Point3D() {
		this(1,1,1);
	}
	
	public Point3D(int x, int y, int z) {
//		super.x = x;
//		super.y = y;
		super(x,y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}

public class Point {
	int x;
	int y;
	
	public Point() {
		this(1,1);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	static double getDistance(Point p1, Point p2) {
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		return Math.sqrt(a*a+b*b);
	}
	
	// 두점 사이의 거리를 구하는 메서드
	// 점이 하나일 때,
	// 코드의 중복을 제거하려면, 어느 한 쪽이 다른 쪽을 호출하면 된다.
	// 인스턴스 멤버에서 스태틱 멤버를 호출 할 수 있지만 반대의 경우는 안됨.
	double getDistance(Point p) {
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//		return Math.sqrt(a*a+b*b);

		return getDistance(this, p); // 중복 제거
	}

	// this, obj를 비교해서 같으면 true, 다르면 false
	// 두 점이 같다는 건 x=x, y=y
	@Override
	public boolean equals(Object obj) {
		// 1. obj 가 Point일것. 아니면 다른 것
		if(obj instanceof Point) {
			Point p = (Point) obj;
			// 1-1. Point이면 나의 x,y와 obj의 x,y를 비교
			if(p.x == this.x && p.y == this.y) {
				return true;
			}
		}
		// 1-2. Point가 아니면 다른것 
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


}
