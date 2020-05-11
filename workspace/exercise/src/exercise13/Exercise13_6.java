package exercise13;

import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Exercise13_6 extends Frame {
	Panel pDate = new Panel();
	Panel pUp = new Panel();
	
	Button btnPrevMon = new Button("��");
	Button btnNextMon = new Button("��");
	Label lblYearMon = new Label();
	
	Button[] btnArr = new Button[42];
	
	Calendar curMon = Calendar.getInstance();

	Exercise13_6(String title) {
		super(title);
		
		pUp.setBackground(Color.yellow);
		pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
		pUp.add(btnPrevMon);
		pUp.add(lblYearMon);
		pUp.add(btnNextMon);
		
		pDate.setLayout(new GridLayout(6, 7));
		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new Button("");
			pDate.add(btnArr[i]);
		}
		
		btnPrevMon.addActionListener(new BtnEventHandler());
		btnNextMon.addActionListener(new BtnEventHandler());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				we.getWindow().setVisible(false);
				we.getWindow().dispose();
				System.exit(0);
			}
		});
		
		add(pUp, "North");
		add(pDate, "Center");
		setBounds(200, 200, 500, 300);
		setDays(curMon);
		setVisible(true);
	} // MyScheduler

	void setDays(Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		lblYearMon.setText(year+"��"+(month+1)+"��");  
		Calendar sDay = Calendar.getInstance(); // ������
		/*
			(1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
			1. (sDay) 1 . ������ �� �ش� ���� ���� ���Ե� �Ͽ��Ϸ� �����Ѵ�
			2. sDay 1 . �ݺ����� ����ؼ� �� ���� �� ������Ű�鼭 ��ư�� ��¥�� �ִ´�
			3. (Color.white) ���� ��¥�� �ش� ���� ���ϸ� ��ư�� ������ ��� ���� �ϰ�
			�׷��� ������ ���� ȸ�� ���� �����Ѵ� (Color.lightGray) .
		 */
	} // setDays(Calendar date)

	class BtnEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			/*
			 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. btnPrevMon , curMon . ������ ��ư�� �̸� ��
			 * �� �� �������� �����Ѵ� 2. btnNextMon , curMon . ������ ��ư�� �̸� �� �� �� ���ķ� �����Ѵ�
			 * 3. setDays() . �� ȣ���ؼ� ����� ������ ���̺� ���̰� �Ѵ�
			 */
		}
	}

	public static void main(String[] args) {
		Exercise13_6 mainWin = new Exercise13_6("Scheduler");
	} // main
}
