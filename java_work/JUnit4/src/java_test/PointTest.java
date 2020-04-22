package java_test;

public class PointTest {
		
	public static void main(String[] args) {
		
		// Q1-3, Q1-4
//		Point p = new Point();	
//		Point p = new Point(3,5);	
//		System.out.println(p.toString());
		
		// Q1-5, Q1-6
		Point p= new Point();
		Point p1= new Point(0, 0);
		Point p2= new Point(1, 1);
		
//		double d = Point.getDistance(p1, p2);
//		System.out.println(d);
		
//		double d = p1.getDistance(p2);
//		System.out.println(d);
		
		// Q1-7
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		// Q1-10
		Point3D p3d = new Point3D();
		System.out.println(p3d.toString());
		
	}
	
}
