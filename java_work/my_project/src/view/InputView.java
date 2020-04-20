package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import evt_handler.MainBtnEventHandler;

public class InputView extends View{
	
	public JButton inputBtn = new JButton("�Է�");
	public JButton updateBtn = new JButton("����");
	public JButton deleteBtn = new JButton("����");	
	public static JComboBox<String> combo = new JComboBox<>();
	public static String sales = "";
	
	public InputView() {
		init();
		start();
	}


	@Override
	public void init() {
		JPanel pane = new JPanel(new GridLayout(2,6));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(new JLabel("����(0000-00-00)"));
		p1.add(datetxt);
		p1.add(new JLabel("�ŷ�ó"));
		p1.add(customertxt);
		p1.add(new JLabel("��ǰ����"));
		p1.add(producttxt);

		p1.add(new JLabel("�ŷ�����"));
		combo.addItem("-");
		combo.addItem("����");
		combo.addItem("����");
		p1.add(combo);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(combo.getSelectedItem().toString());
				sales = combo.getSelectedItem().toString();
			}
		});
		
		p1.add(new JLabel("����"));
		p1.add(qauntitytxt);
		p1.add(new JLabel("�ܰ�"));
		p1.add(pricetxt);
		
		p2.add(inputBtn);
		p2.add(updateBtn);
		p2.add(deleteBtn);
		
		pane.add(p1);
		pane.add(p2);
		
		add(pane);
		
		
	}

	@Override
	public void start() {
		MainBtnEventHandler handler = new MainBtnEventHandler(this);
		inputBtn.addActionListener(handler);
		updateBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
	}

}
