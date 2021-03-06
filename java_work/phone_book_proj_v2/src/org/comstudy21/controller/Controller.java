package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.Dto;
import org.comstudy21.view.Search;

public class Controller {
	
	public static void search() {
		viewArr[3].display(); // 검색어 입력 기능
		// 해당 검색어를 가지고 select 하고 결과 출력
		data.dtoArr = dao.select(data.dto);
		((Search)viewArr[3]).display(data.dtoArr); // 출력 기능
	}
	
	public static void service() {

		try {
			viewArr[data.no].display(); // 최초 0번지  // 필드는 초기화 해주지 않아도 0으로 초기화 됨  
			
			switch(data.no) {
			case 1 : 
				viewArr[data.no].display();
				// 입력받은 data.dto 데이터를 dao로 넘긴다.
				dao.insert(data.dto);
				break;
			case 2 : 
				// dao에서 데이터를 가져온 후에 뷰로 이동
				Dto[] dtoArr = dao.selectAll();
				data.dtoArr = dtoArr;
				// data.dtoArr = dao.selectAll(); // 위의 2문장을 이렇게 사용해도 됨
				viewArr[data.no].display();
				break;
			case 3 :
				// 위에 함수화 => 수정, 삭제에도 사용될 것이기 때문에
//				viewArr[data.no].display(); // 검색어 입력 기능
//				// 해당 검색어를 가지고 select 하고 결과 출력
//				data.dtoArr = dao.select(data.dto);
//				((Search)viewArr[data.no]).display(data.dtoArr); // 출력 기능
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
				System.out.println("---------- 프로그램 종료 ----------");
				System.exit(0);
				break;
			default : // 유효성 체크 대신 사용
				System.out.println("해당 사항 없습니다!");
				break;
			}
						
		} catch (NullPointerException e) {
			System.out.println("주의 : 메뉴가 준비 되지 않았습니다.");
		} catch (Exception e) {
			System.out.println("주의 : 해당 사항 없습니다.");
		}
		
		data.no = 0;
		service();
	}

}
