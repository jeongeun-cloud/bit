package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogExam extends JFrame {
	
	public DialogExam() {
		int res = JOptionPane.showOptionDialog(null, 
				"원하는 작업을 선택하시오.", 
				"대화상자", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				new String[]{"가입하기","다시쓰기","취소"}, 
				"가입하기");
	}
	
	public void test2() {
		int result = JOptionPane.showConfirmDialog(this, "작업을 종료하시겠습니까?");
		System.out.println(result);
		if(result == 0) {
			System.out.println("예를 선택했습니다!");
		} else if(result == 1) {
			System.out.println("아니오를 선택했습니다!");
		} else if(result == 2) {
			System.out.println("취소를 선택했습니다!");
		}
	}
	
	public void test() {
		//JOptionPane.showMessageDialog(this, "가입이 성공적으로 완료되었습니다.");
		
		String inputMsg =JOptionPane.showInputDialog("아이디 입력 : ");
		//System.out.println(inputMsg);
		
		JOptionPane.showMessageDialog(this, inputMsg + "님의 가입이 성공적으로 완료되었습니다.");
	}

	public static void main(String[] args) {
		new DialogExam();
		
	}

}
