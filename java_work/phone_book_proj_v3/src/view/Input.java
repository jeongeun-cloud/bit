package view;

import model.DTO;

public class Input implements View {

	@Override
	public void display() {
		System.out.println(inputTitle);
		
		DTO dto = new DTO();
		
		System.out.print("�̸� �Է� : ");
		dto.setName(scan.next());
		System.out.print("��ȭ��ȣ �Է� : ");
		dto.setPhone(scan.next());
		
		data.dto = dto;
		System.out.println("---------- ���� �Է� �Ϸ� ! ----------");

	}

}
