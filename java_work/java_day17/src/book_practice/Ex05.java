package book_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> studentArr = new ArrayList<>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		
		while (studentArr.size() <4) {
			System.out.print(">> ");
			Student student = new Student();
			String s = scan.nextLine();
			String[] sArr = s.split(", ");
			student.setName(sArr[0]);
			student.setMajor(sArr[1]);
			student.setNum(Integer.parseInt(sArr[2]));
			student.setAvg(Double.parseDouble(sArr[3]));

			studentArr.add(student);	
		}
		System.out.println("--------------------");
		
		for(Student s : studentArr) {	
			System.out.println(s.toString());
			System.out.println("--------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			
			if(name.equals("그만")) {
				System.exit(0);
			} else {
				for(int i=0; i<studentArr.size(); i++) {
					if(name.equals(studentArr.get(i).getName())) {
						String tmpName = studentArr.get(i).getName();
						String tmpMajor = studentArr.get(i).getMajor();
						int tmpNum = studentArr.get(i).getNum();
						double tmpAvg = studentArr.get(i).getAvg();
						System.out.println(tmpName + ", " + tmpMajor + ", " + tmpNum + ", " + tmpAvg );
					}
				}
			}
			
		}

		
	}
}