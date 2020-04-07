package view;

import model.DTO;

public class Search implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(searchTitle);
		
		data.dto = new DTO();
		System.out.print("검색 할 학생 이름 입력 : ");
		data.dto.setName(scan.next());


	}


	public void display(DTO[] dtoArr) {
		System.out.println("----- 검색 결과 -----");
		
		if(data.dtoArr.length == 0) {
			System.out.println("검색 결과가 없습니다");
			return;
		}
			
		for(DTO dto : dtoArr) {
			System.out.println(dto);
		}
		
	}

}
