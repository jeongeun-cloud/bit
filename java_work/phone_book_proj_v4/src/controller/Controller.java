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
			viewArr[data.no].display(); // 최초 0 번지를 보여주기 위함 // 없으면 무한루프
			
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
					dao.delete(data.dto);
				}
				break;
			case 6 : 
				System.out.println("시스템을 종료 합니다!");
				System.exit(0);
				break;
			default : 
				System.out.println("번호를 잘 못 입력 하였습니다!");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("해당 메뉴가 준비되지 않았습니다");
			return;
		} catch (Exception e) {
			System.out.println("잘못 입력 하셨습니다");
			return;
		}
		
		data.no = 0;
		service();
	}

}
