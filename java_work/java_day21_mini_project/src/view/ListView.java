package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListView extends View {

	@Override
	public void display() {
		columnIdentifiers.add("��ȣ");
		columnIdentifiers.add("�̸�");
		columnIdentifiers.add("�̸���");
		columnIdentifiers.add("��ȭ��ȣ");
		
		dm.setColumnIdentifiers(columnIdentifiers);
		JTable table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);

	}

}
