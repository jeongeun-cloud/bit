package view;

import javax.swing.JButton;
import javax.swing.JPanel;

import evt_handler.ButtonEventHandler;

public class ButtonView extends View {
	public JButton allBtn;
	public JButton insertBtn;
	public JButton searchBtn;
	public JButton updateBtn;
	public JButton deleteBtn;
	public JButton cancleBtn;

	@Override
	public void display() {
		JPanel pane = new JPanel();
		allBtn = new JButton("��ü����");
		insertBtn = new JButton("�߰�");
		searchBtn = new JButton("�˻�");
		updateBtn = new JButton("����");
		deleteBtn = new JButton("����");
		cancleBtn = new JButton("���");
		
		pane.add(allBtn);
		pane.add(insertBtn);
		pane.add(searchBtn);
		pane.add(updateBtn);
		pane.add(deleteBtn);
		pane.add(cancleBtn);
		
		add(pane);
		
		ButtonEventHandler handler = new ButtonEventHandler(this);
		allBtn.addActionListener(handler);
		insertBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		updateBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		cancleBtn.addActionListener(handler);

	}

}
