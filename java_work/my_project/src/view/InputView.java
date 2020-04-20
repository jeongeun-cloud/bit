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
	
	public JButton inputBtn = new JButton("입력");
	public JButton updateBtn = new JButton("수정");
	public JButton deleteBtn = new JButton("삭제");	
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
		
		p1.add(new JLabel("일자(0000-00-00)"));
		p1.add(datetxt);
		p1.add(new JLabel("거래처"));
		p1.add(customertxt);
		p1.add(new JLabel("제품정보"));
		p1.add(producttxt);

		p1.add(new JLabel("거래구분"));
		combo.addItem("-");
		combo.addItem("매출");
		combo.addItem("매입");
		p1.add(combo);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(combo.getSelectedItem().toString());
				sales = combo.getSelectedItem().toString();
			}
		});
		
		p1.add(new JLabel("수량"));
		p1.add(qauntitytxt);
		p1.add(new JLabel("단가"));
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
