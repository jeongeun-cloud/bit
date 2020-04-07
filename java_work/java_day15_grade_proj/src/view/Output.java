package view;

public class Output implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(outputTitle);
		
		if(data.dtoArr.length == 0) {
			System.out.println("����� ������ �����ϴ�. �Է��� ���� ���ּ���");
			return;
		}
		
		for(int i=0; i<data.dtoArr.length; i++) {
			System.out.print(data.dtoArr[i]);
			System.out.println();
		}

	}

}
