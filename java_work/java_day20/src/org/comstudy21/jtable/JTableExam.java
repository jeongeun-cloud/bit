package org.comstudy21.jtable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableExam extends JFrame {
	JPanel contentPane;
	JScrollPane infoScrollPane;
	JTable searchResultTable;
	DefaultTableModel tableModel;
	
	public JTableExam() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = (JPanel)getContentPane();
		
		Object[][] data = {
				{"������","jeea@mem.com","1111", 20},
				{"�����", "rose@mem.com", "2222", 30},
				{"�����", "lily@mem.com", "3333", 25},
		};

		// �迭�� 
		String[] colunms = {"�̸�","E-mail","��ȭ��ȣ","����"};
		tableModel = new DefaultTableModel(data, colunms);
		
		
		searchResultTable = new JTable(tableModel);
		infoScrollPane = new JScrollPane(searchResultTable);
		
		tableModel.setRowCount(20);
		
		JTable table = searchResultTable;
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
			    System.out.println(colunms[col]+ ":" + data[row][col]);
				System.out.println(Arrays.toString(data[row]));
			}
		});
		
		contentPane.add(infoScrollPane);
		
		setSize(640,480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableExam();
	}

}