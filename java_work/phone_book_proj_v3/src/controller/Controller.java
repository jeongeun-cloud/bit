package controller;

import static resource.R.*;

import view.Search;

public class Controller {
	
	public static void search() {
		viewArr[3].display();
		data.dtoArr = dao.select(data.dto);
		((Search)viewArr[3]).display(data.dtoArr);
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
				search();
				break;
			case 4 : 
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.update(data.dto);
				}
				break;
			case 5 : 
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.remove(data.dto);
				}
				break;
			case 6 : 
				System.out.println("---------- 프로그램 종료! ----------");
				System.exit(0);
				break;
			default : 
				System.out.println("해당사항 없습니다.");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("해당 메뉴가 준비되지 않았습니다.");
		}
		
		// no을 0으로 초기화 한 후 service 재귀호출
		data.no = 0;
		service();
	}
	
}
