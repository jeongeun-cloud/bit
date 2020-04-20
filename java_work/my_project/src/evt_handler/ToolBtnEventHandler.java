package evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import resource.R;
import view.MainFrame;

public class ToolBtnEventHandler implements ActionListener, R {
	MainFrame target;
	
	public ToolBtnEventHandler(MainFrame target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();

			if(btn == target.allBtn) {
				//System.out.println("모두보기");
				listController.service();
			}
			if(btn == target.searchBtn) {
				//System.out.println("검색");
				searchController.service();
			}
			if(btn == target.printBtn) {
				System.out.println("인쇄");
			}
			if(btn == target.userUpdateBtn) {
				System.out.println("사용자 업데이트");
			}
		}
	}

}
