package view;

import model.DTO;

public class Modify implements View {

	@Override
	public void display() {
		System.out.println(modifyTitle);
		
		if(data.dtoArr.length == 0) {
			return;
		}
		
		System.out.print("���� �� ��ȣ �Է� : ");
		int idx = scan.nextInt();
		boolean flag = false;
		
		for(int i=0; i<data.dtoArr.length; i++) {
			if(data.dtoArr[i].getIdx() == idx) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("�Է��� idx�� ������ �����ϴ�!");
			data.dto = new DTO(0,null,null);
			return;
		} else {
			System.out.print("�� �̸� �Է� : ");
			String name = scan.next();
			System.out.print("�� ��ȭ��ȣ �Է� : ");
			String phone = scan.next();
			data.dto = new DTO(idx,name,phone);
		}

	}
	
	

}