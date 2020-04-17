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
		allBtn = new JButton("전체보기");
		insertBtn = new JButton("추가");
		searchBtn = new JButton("검색");
		updateBtn = new JButton("수정");
		deleteBtn = new JButton("삭제");
		cancleBtn = new JButton("취소");
		
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
