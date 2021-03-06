package org.comstudy21.string;

public class Ch06Ex06 {
	public static void main(String[] args) {
		StringBuffer strbf = new StringBuffer("Seoul"); // StringBuffer는 객체 생성 후에 이용해야 함 (오토박싱 안되기 때문)
		
		strbf.append("Jeju");
		strbf.append("Cheongju");
		
		System.out.println(strbf);
		
		System.out.println(strbf.charAt(5));
		System.out.println(strbf.substring(5, strbf.indexOf("C")));
		System.out.println(strbf.reverse());
		
		strbf.reverse();
		strbf.delete(5, strbf.indexOf("C"));
		System.out.println(strbf);
		
		strbf.deleteCharAt(5);
		System.out.println(strbf);
		
	}
}
