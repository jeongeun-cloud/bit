package org.comstudy21.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View {
	// IoC ������ ����(������ ����) - ��� �� �����͸� �ܺο��� �����ϰ� ��ü�� �Է��Ѵ�.
	DefaultTableModel dm;
	JTable table;
	
	public void setTableModel(DefaultTableModel dm) {
		this.dm = dm;
	}
	
	public ListView(DefaultTableModel dm, Object[] colNames) {
		this.dm = dm;
		dm.setColumnIdentifiers(colNames);
		init();
	}

	@Override
	public void init() {
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
		
	}

	@Override
	public void start() {
		
	}
	
	public int selectNum() {
		
		int emp = table.getSelectedRow(); // �ο� ��ȣ
		int row = (int) table.getValueAt(emp,0); // �ο��ȣ�� �ִ� num
		//System.out.println(emp + " " + row);
		
		if(table.getSelectedRow() == -1) {
			System.out.println("error");
		}
		
		return row;
	}

}