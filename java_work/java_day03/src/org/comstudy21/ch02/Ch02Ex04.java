package org.comstudy21.ch02;

public class Ch02Ex04 {
	
	public static void main(String[] args) {
		// java.util ��Ű��
		// java.lang.String Ŭ����
		// ���ڿ� �񱳴� �̱������� ��� equals() �Լ��� ����Ѵ�.
		// == �������� ���ڿ��� ���ϸ� ���� ��ü�ΰ��� ���Ѵ�.
		
		String str1 = "Korea Korea";
		String str2 = "Korea";
		
		if(str1.equals(str2)){
			System.out.println("����");
		}else{
			System.out.println("���� �ʴ�");
		}
		
		System.out.println("���� r�� ��ġ : " + str1.indexOf('r')); // �տ��� ���� ã��, ã�� ���� ����
		System.out.println("���� r�� ��ġ2 : " + str1.lastIndexOf('r')); // �ڿ������� ���� ã��, ã�� ���� ����
		System.out.println("str1�� 2�� �ε��� : " + str1.charAt(2)); 
		
		
		String str3 = "korea apple mango banana hello";
		
		System.out.print("str3�� apple�� �ֳ�?");
		System.out.println(str3.contains("apple"));
		System.out.print("str3�� korea�� �����ϴ°�?");
		System.out.println(str3.startsWith("korea"));
		System.out.print("str3�� hello�� �����°�?");
		System.out.println(str3.endsWith("hello"));
		System.out.println("--------------------");
		System.out.println(str3.startsWith("korea") && str3.endsWith("hello"));
		
		System.out.println("����!");
	}

}
