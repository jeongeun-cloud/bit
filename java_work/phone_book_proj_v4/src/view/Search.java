package view;

import model.DTO;

public class Search implements View {

	@Override
	public void display() {
		System.out.println(searchTitle);
		
		data.dto = new DTO();
		System.out.print("�˻� �� �̸� �Է� : ");
		data.dto.setName(scan.next());

	}

	public void display(DTO[] dtoArr) {
		System.out.println("----- �˻� ��� -----");
		
		if(dtoArr.length == 0) {
			System.out.println("�˻� ����� �����ϴ�!");
		}
		
		for(DTO dto : dtoArr) {
			System.out.println(dto);
		}
		
	}
	
	

}
