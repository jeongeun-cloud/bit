package view;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import evt_handler.MouseEventHandler;

public class ListView extends View {
	JTable table;
	
	public ListView() {
		init();
		start();
	}

	@Override
	public void init() {
		columnIdentifiers.add("��ȣ");
		columnIdentifiers.add("����");
		columnIdentifiers.add("�ŷ�ó");
		columnIdentifiers.add("��ǰ����");
		columnIdentifiers.add("�ŷ�����");
		columnIdentifiers.add("����");
		columnIdentifiers.add("�ܰ�");
		columnIdentifiers.add("�հ�ݾ�");
		columnIdentifiers.add("�Է³�¥");
		columnIdentifiers.add("�ۼ���");
		
		dm.setColumnIdentifiers(columnIdentifiers);
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
		
		table.setPreferredScrollableViewportSize(new Dimension(
	            table.getColumnCount() * 80, table.getRowHeight() * 20));
		
		
	}

	@Override
	public void start() {
		MouseEventHandler handler = new MouseEventHandler();
		table.addMouseListener(handler);

	}

}
