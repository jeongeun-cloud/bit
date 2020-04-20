package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import evt_handler.SignupBtnHandler;
import model.Employee;
import resource.R;

public class SignupView extends JFrame implements R {
//	���̵�(�ߺ�üũ), ��й�ȣ, �̸�, �̸���, �������, ����, �μ��ڵ�
	public static String gender = "";
	
	public JButton checkBtn = new JButton("�ߺ�Ȯ��");
	public JButton signOkBtn = new JButton("�����ϱ�");
	public JButton cancleBtn = new JButton("���");
	
	public JRadioButton male = new JRadioButton("��", false);
	public JRadioButton female = new JRadioButton("��", false);
	public ButtonGroup gr01 = new ButtonGroup();
		
	public SignupView() {
		gr01.add(male);
		gr01.add(female);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel pane = new JPanel(new FlowLayout());
		JPanel pane2 = new JPanel(new FlowLayout());
				
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		pane.add(new JLabel("�� *�� �ʼ� �׸��Դϴ� ��"));
		
		p.add(new JLabel("* ID �Է� : "));
		p.add(idtxt);
		p.add(checkBtn);

		p1.add(new JLabel("* PW �Է� : "));
		p1.add(pwtxt);
		
		p2.add(new JLabel("* �̸� �Է� : "));
		p2.add(nametxt);

		p3.add(new JLabel("* �̸��� �Է� : "));
		p3.add(emailtxt);

		p4.add(new JLabel("������� �Է� (1900-01-01) : "));
		p4.add(birthtxt);
		
		p5.add(new JLabel("���� : "));
		p5.add(male);
		p5.add(female);
		
		male.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected()) {
					gender= "��";
				} 
			}
		});
		
		female.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(female.isSelected()) {
					gender= "��";
				} 
			}
		});
		
		p6.add(new JLabel("�μ� �Է� : "));
		p6.add(codetxt);
		
		pane.add(p);
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		pane.add(p5);
		pane.add(p6);
		
		add(pane);
		
		pane2.add(signOkBtn);
		
		pane2.add(cancleBtn);
		cancleBtn.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e){
				JButton btn = (JButton) e.getSource();
				if(btn == cancleBtn) {
					//System.out.println("���");
					dispose();
				}
			}
		});
		
		add(BorderLayout.SOUTH,pane2);

		setSize(400, 370);
		setVisible(true);
		
		start();
		
	}
	
	public void start() {
		SignupBtnHandler handler = new SignupBtnHandler(this);
		checkBtn.addActionListener(handler);
		signOkBtn.addActionListener(handler);

	}

	
//	public static void main(String[] args) {
//		new SignupView();
//	}
	

}
