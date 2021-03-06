package view;

import model.DTO;

public class Input implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(inputTitle);
		
		DTO dto = new DTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(scan.next());
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		dto.setKor(kor);
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		dto.setMath(math);
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		dto.setEng(eng);
		
		int sum = kor + math + eng;
		double avg = sum/3;
		
		dto.setSum(sum);
		dto.setAvg(avg);
		
		data.dto = dto;
		
		System.out.println("입력 성공!");

	}

}
