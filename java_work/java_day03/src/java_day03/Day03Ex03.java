package java_day03;

public class Day03Ex03 {
	
	//�Լ��� �����Ѵ�.
	static void output(){ 
	//void ��� String, int�� �����ѵ�, �׷� ��� Ÿ�԰� �´� return �� ����� �� (��: return ""; or return 0;)
	//static int output()
		
		String name = "Ju";
		int age = 16;
		
		System.out.printf("[2] ����: %s, ���� : %d\n", name, age);
		
		//return 0; or return age;
	}
	
	public static void main(String[] args){
		//static ����� static ����� ���� �����ϴ�.
		System.out.println("[1] �����Լ�...");
		output(); //ȣ��
		// int �� ������ return ������ ��������, int result = output(); �̷��� ������ �޾ƾ� �� 
		// int result = output();
		
		//System.out.println("result => " + result);
		System.out.println("[3] ���α׷� ����! ");

	}
}
