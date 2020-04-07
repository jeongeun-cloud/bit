package view;

public class Output implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(outputTitle);
		
		if(data.dtoArr.length == 0) {
			System.out.println("출력할 내용이 없습니다. 입력을 먼저 해주세요");
			return;
		}
		
		for(int i=0; i<data.dtoArr.length; i++) {
			System.out.print(data.dtoArr[i]);
			System.out.println();
		}

	}

}
