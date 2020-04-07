package view;

public class Rank implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(rankTitle);
		
		if(data.dtoArr.length == 0) {
			System.out.println("출력할 내용이 없습니다. 입력을 먼저 해주세요");
			return;
		}
		
		
		
		

	}

}
