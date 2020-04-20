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
		columnIdentifiers.add("번호");
		columnIdentifiers.add("일자");
		columnIdentifiers.add("거래처");
		columnIdentifiers.add("제품정보");
		columnIdentifiers.add("거래구분");
		columnIdentifiers.add("수량");
		columnIdentifiers.add("단가");
		columnIdentifiers.add("합계금액");
		columnIdentifiers.add("입력날짜");
		columnIdentifiers.add("작성자");
		
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
