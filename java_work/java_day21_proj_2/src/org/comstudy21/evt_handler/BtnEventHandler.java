package org.comstudy21.evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ListView;

import org.comstudy21.resource.R;
import org.comstudy21.view.ButtonView;
import org.comstudy21.view.MainFrame;

public class BtnEventHandler implements ActionListener, R {
	ButtonView target;

	public BtnEventHandler(ButtonView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn == target.allBtn) {
				//System.out.println("전체보기...");
				listController.service();
			}
			if(btn == target.inputBtn) {
				//System.out.println("추가...");
				inputController.service();
				listController.service();
			}
			if(btn == target.deleteBtn) {
				//System.out.println("삭제...");
				deleteController.service();
				listController.service();
			}
			if(btn == target.searchBtn) {
				//System.out.println("검색...");
				searchController.service();
				//listController.service();
			}
			if(btn == target.cancleBtn) {
				//System.out.println("취소...");				
				nameField.setText(null);
				emailField.setText(null);
				phoneField.setText(null);
			}
		}
		
	}

}
