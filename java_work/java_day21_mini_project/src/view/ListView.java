package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import evt_handler.MouseEventHandler;

public class ListView extends View {

	@Override
	public void display() {
		columnIdentifiers.add("번호");
		columnIdentifiers.add("이름");
		columnIdentifiers.add("이메일");
		columnIdentifiers.add("전화번호");
		
		dm.setColumnIdentifiers(columnIdentifiers);
		JTable table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
		
		MouseEventHandler handler = new MouseEventHandler();
		table.addMouseListener(handler);

	}

}
