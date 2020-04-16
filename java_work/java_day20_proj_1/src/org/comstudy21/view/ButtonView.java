package org.comstudy21.view;

import javax.swing.JButton;

import org.comstudy21.evt_handler.BtnEventHandler;

public class ButtonView extends View {
	public JButton allBtn = new JButton("��ü����"); 
	public JButton inputBtn = new JButton("�߰�"); 
	public JButton deleteBtn = new JButton("����"); 
	public JButton searchBtn = new JButton("�˻�"); 
	public JButton cancleBtn = new JButton("���"); 

	public ButtonView() {
		init();
		start();
	}

	@Override
	public void init() {
		add(allBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancleBtn);
	}

	@Override
	public void start() {
		BtnEventHandler handler = new BtnEventHandler(this);
		allBtn.addActionListener(handler);
		inputBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		cancleBtn.addActionListener(handler);

	}

}