package controller;

import static resource.R.*;

import view.Search;

public class Controller {
	
	public static void search() {
		viewArr[4].display(); // ******
		data.dtoArr = dao.select(data.dto); // ******
		((Search)viewArr[4]).display(data.dtoArr); // ******
	}
	
	public static void service() {
		
		try {
			viewArr[data.no].display();
			
			switch(data.no) {
			case 1 : 
				viewArr[data.no].display();
				dao.insert(data.dto);
				break;
			case 2 : 
				data.dtoArr = dao.show();
				viewArr[data.no].display();
				break;
			case 3 : 
				viewArr[data.no].display();
				break;
			case 4 : 
				search();
				break;
			case 5 : 
				search();
				viewArr[data.no].display();
				dao.update(data.dto);
				break;
			case 6 : 
				search();
				
				break;
			case 7 : 
				System.out.println("���α׷��� ���� �մϴ�! BYE");
				System.exit(0);
				break;
			default :
				System.out.println("��ȣ�� �� �� �Է� �ϼ̽��ϴ�.");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("�ش� �޴��� �غ� ���� �ʾҽ��ϴ�.");
			return;
		} catch (Exception e) {
			System.out.println("�� �� �����̽��ϴ�. ��ȣ�� �Է����ּ���");
			return;
		}
		
		data.no = 0;
		service();
	}
}