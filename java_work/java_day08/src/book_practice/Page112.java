package book_practice;

import java.util.Scanner;

public class Page112 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void ex11(String[] args) {
		
		int month;
		
		System.out.print("���� �Է��ϼ���(1~12) >>> ");
		month = scan.nextInt();
		
		// if-else �� �̿�
		if(month >2 && month <=5){
			System.out.println("��");
		}else if(month >5 && month <=8){
			System.out.println("����");
		}else if(month > 8 && month <=11){
			System.out.println("����");
		}else{
			System.out.println("�ܿ�");
		}
		
		// switch �� �̿�
		switch(month){
		case 3 : case 4 : case 5 :
			System.out.println("��");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("����");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("����");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("�ܿ�");
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String s;
		int total = 0;
		
		System.out.print("���� >> ");
		int num1 = scan.nextInt();
		s = scan.next();
		int num2 = scan.nextInt();
		
		
		// if ~ else�� �̿�
		if(s.equals("+")){
			total = num1 + num2;
		}
		if(s.equals("-")){
			total = num1 - num2;
		}
		if(s.equals("*")){
			total = num1 * num2;
		}
		if(s.equals("/")){
			if(num2==0){
				System.out.println("0���� ���� �� �����ϴ�!");
				System.exit(0);
			}
			
			total = num1 / num2;
		}

		System.out.printf("%d%s%d�� ������� %d \n",num1,s,num2,total);
		
		
		// switch�� �̿�	
		switch(s){
		
		case "+" :
			total = num1 + num2;
			break;
		case "-" :
			total = num1 - num2;
			break;
		case "*" :
			total = num1 * num2;
			break;
		case "/" :
			if(num2==0){
				System.out.println("0���� ���� �� �����ϴ�!");
				System.exit(0);
			}
			total = num1 / num2;
			break;
		}
		
			
		System.out.printf("%d%s%d�� ������� %d \n",num1,s,num2,total);
	}
	
}
