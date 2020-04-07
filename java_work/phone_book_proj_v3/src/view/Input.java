package view;

import model.DTO;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		
		DTO dto = new DTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(scan.next());
		System.out.print("전화번호 입력 : ");
		dto.setPhone(scan.next());
		
		data.dto = dto;
		System.out.println("---------- 정보 입력 완료 ! ----------");

	}

}
