package view;

public class Output implements View {

	@Override
	public void display() {
		
		if(data.dtoArr == null) {
			System.out.println("����� ������ �����ϴ�!");
			return;
		}
		
		System.out.println(outputTitle);
		
		for(int i=0; i<data.dtoArr.length; i++){
			System.out.println(data.dtoArr[i]);
		}
		

	}

}
