package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogExam extends JFrame {
	
	public DialogExam() {
		int res = JOptionPane.showOptionDialog(null, 
				"���ϴ� �۾��� �����Ͻÿ�.", 
				"��ȭ����", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				new String[]{"�����ϱ�","�ٽþ���","���"}, 
				"�����ϱ�");
	}
	
	public void test2() {
		int result = JOptionPane.showConfirmDialog(this, "�۾��� �����Ͻðڽ��ϱ�?");
		System.out.println(result);
		if(result == 0) {
			System.out.println("���� �����߽��ϴ�!");
		} else if(result == 1) {
			System.out.println("�ƴϿ��� �����߽��ϴ�!");
		} else if(result == 2) {
			System.out.println("��Ҹ� �����߽��ϴ�!");
		}
	}
	
	public void test() {
		//JOptionPane.showMessageDialog(this, "������ ���������� �Ϸ�Ǿ����ϴ�.");
		
		String inputMsg =JOptionPane.showInputDialog("���̵� �Է� : ");
		//System.out.println(inputMsg);
		
		JOptionPane.showMessageDialog(this, inputMsg + "���� ������ ���������� �Ϸ�Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		new DialogExam();
		
	}

}
