package view;

import model.DTO;

public class Modify implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(modifyTitle);
		
		if(data.dtoArr.length == 0) {
			return;
		}
		
		System.out.print("수정할 학생의 번호 입력 : ");
		int idx = scan.nextInt();		
		boolean flag = false;
		
		for(int i=0; i<data.dtoArr.length; i++) {
			if(data.dtoArr[i].getIdx() == idx) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("입력한 idx의 정보가 없습니다!");
			data.dto = new DTO(0, null, 0, 0 ,0, 0, 0);
			return;
		} else {
			
		}

		

	}

}
