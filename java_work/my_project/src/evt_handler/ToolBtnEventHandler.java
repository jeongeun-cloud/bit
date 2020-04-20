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
				//System.out.println("��κ���");
				listController.service();
			}
			if(btn == target.searchBtn) {
				//System.out.println("�˻�");
				searchController.service();
			}
			if(btn == target.printBtn) {
				System.out.println("�μ�");
			}
			if(btn == target.userUpdateBtn) {
				System.out.println("����� ������Ʈ");
			}
		}
	}

}
