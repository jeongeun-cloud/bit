package view;

import model.DTO;

public class Delete implements View {

	@Override
	public void display() {
		System.out.println(deleteTitle);
		
		System.out.print("���� �� ��ȣ �Է� : ");
		int idx = scan.nextInt();
		boolean flag = false;
		
		for(int i=0; i<data.dtoArr.length; i++){
			if(data.dtoArr[i].getIdx() == idx) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("idx�� ������ �����ϴ�");
			data.dto = new DTO(0, null, null);
			return;
		}
		
		data.dto = new DTO(idx, null, null);

	}

}
