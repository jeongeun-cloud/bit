package view;

public class Menu implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(menuTitle);
		
		for(int i=1; i<menuArr.length; i++) {
			System.out.printf("%d.%s   ", i, menuArr[i]);
		}
		
		System.out.println();
		System.out.print("��ȣ ���� : ");
		data.no = scan.nextInt();
		
	}
	
	// ���� �׽�Ʈ	
//	public static void main(String[] args) {
//		Menu menu = new Menu();
//		menu.display();
//		
//	}

}