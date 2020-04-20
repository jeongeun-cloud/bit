package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import evt_handler.ToolBtnEventHandler;
import resource.R;

public class MainFrame extends JFrame implements R {
	Container content;
	public JButton allBtn;
	public JButton inputBtn;
	public JButton searchBtn;
	public JButton updateBtn;
	public JButton deleteBtn;
	public JButton printBtn;
	public JButton userUpdateBtn;
	public JComboBox<String> combo = new JComboBox<>();
	public static String searchTitle = "";
	
	public MainFrame() {
		content = getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		createToolbar();
		
		add(BorderLayout.CENTER, new ListView());
		add(BorderLayout.SOUTH, new InputView());
		
		setSize(1030, 530);
		setVisible(true);
		
		start();
	}
	
	
	private void createToolbar() {
		JToolBar tool = new JToolBar("Menu");
		tool.setBackground(Color.LIGHT_GRAY);
		
		allBtn = new JButton("전체보기");
		searchBtn = new JButton("검색");
		printBtn = new JButton("인쇄");
		userUpdateBtn = new JButton("회원정보 수정");
		
		tool.add(allBtn);
		tool.addSeparator();
		tool.add(new JLabel("search"));

		combo.addItem("-");
		combo.addItem("거래처");
		combo.addItem("제품정보");
		combo.addItem("매출");
		combo.addItem("매입");
		tool.add(combo);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(combo.getSelectedItem().toString());
				searchTitle = combo.getSelectedItem().toString();
			}
		});
		
		tool.add(searchText);
		
		tool.add(searchBtn);
		tool.addSeparator();
		tool.addSeparator();
		tool.addSeparator();
		tool.add(printBtn);
		tool.add(userUpdateBtn);
		
		content.add(BorderLayout.NORTH, tool);
		tool.setFloatable(false);
	}
	
	
	public void start() {
		ToolBtnEventHandler handler = new ToolBtnEventHandler(this);
		allBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		printBtn.addActionListener(handler);
		userUpdateBtn.addActionListener(handler);
		
	}


//	public static void main(String[] args) {
//		new MainFrame();
//	}
}
