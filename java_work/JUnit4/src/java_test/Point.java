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
	
	// ���� ������ �Ÿ��� ���ϴ� �޼���
	// ���� �ϳ��� ��,
	// �ڵ��� �ߺ��� �����Ϸ���, ��� �� ���� �ٸ� ���� ȣ���ϸ� �ȴ�.
	// �ν��Ͻ� ������� ����ƽ ����� ȣ�� �� �� ������ �ݴ��� ���� �ȵ�.
	double getDistance(Point p) {
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//		return Math.sqrt(a*a+b*b);

		return getDistance(this, p); // �ߺ� ����
	}

	// this, obj�� ���ؼ� ������ true, �ٸ��� false
	// �� ���� ���ٴ� �� x=x, y=y
	@Override
	public boolean equals(Object obj) {
		// 1. obj �� Point�ϰ�. �ƴϸ� �ٸ� ��
		if(obj instanceof Point) {
			Point p = (Point) obj;
			// 1-1. Point�̸� ���� x,y�� obj�� x,y�� ��
			if(p.x == this.x && p.y == this.y) {
				return true;
			}
		}
		// 1-2. Point�� �ƴϸ� �ٸ��� 
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


}
