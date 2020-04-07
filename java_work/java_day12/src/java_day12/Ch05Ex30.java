package java_day12;

interface MyInterface {
	// �������̽��� ����� �߻�޼ҵ常�� ����� ���� �� �ִ�.
	// java 8 �̻���ʹ� default�޼ҵ带 ����� ���� �� �ִ�.
	// java 9 �̻���ʹ� static�޼ҵ�� private �޼ҵ嵵 ����� ���� �� �ִ�.
	
	// public static final String name = "MyInterface"; // public static final ����	
	String name = "MyInterface";
	
	// public abstract �� ���� �Ǿ��ִ�.
	void showName(); 
	// �Ʒ��� ���� ��ü�� ���� �� ����
	//void showName() {
	//	
	//}
	
}

interface MyInterface2 {
	void showData(); 
}


// �������̽��� impliments�� ��ӹ޴´�.
// �������̽��� ��� ������ �߻� �޼ҵ带 �ݵ�� ���� �ؾ� �Ѵ�.
// �������̽��� Ŭ������ ���� ����� �����ϴ�.
public class Ch05Ex30 implements MyInterface, MyInterface2 {
	
	// �������̽��� �߻�޼ҵ� ������ �� ���� public ���� �����ڸ� �� ����Ѵ�.
	@Override
	public void showName() {
		System.out.println("name => " + name);
	}
	
	public void showData() {
		System.out.println("showData");
	}
	
	public static void main(String[] args) {
		// name static ����̹Ƿ� �ܺ� Ŭ�������� ���� �����ϴ�.
		System.out.println("name = " + MyInterface.name);
		Ch05Ex30 obj = new Ch05Ex30();
		obj.showName();
		
		MyInterface mi = obj;	// MyInterface �� �ִ� �� ���� ���� (��ü ������ �Ұ����ؼ� �̷��� �ؾ߸� ��)
		mi.showName();
		MyInterface2 mi2 = obj;	// MyInterface2 �� �ִ� �� ���� ����
		mi2.showData();
	}

}