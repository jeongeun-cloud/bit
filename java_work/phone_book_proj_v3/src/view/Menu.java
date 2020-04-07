package view;

public class Menu implements View {

	@Override
	public void display() {
		System.out.println(menuTitle);
		for(int i=1; i<menuArr.length; i++) {
			System.out.printf("%d.%s   ", i, menuArr[i]);
		}
		System.out.println();
		System.out.print("Choice : ");
		int no = scan.nextInt();
		
		// 입력 받은 num을 data의 num으로 넘겨준다.
		data.no = no;
	}
	
	// 단위 테스트
//	public static void main(String[] args) {
//		Menu test = new Menu();
//		test.display();
//	}

}
