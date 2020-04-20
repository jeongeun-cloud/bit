package evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import resource.R;
import view.InputView;

public class MainBtnEventHandler implements ActionListener, R {
	InputView target;
	
	public MainBtnEventHandler(InputView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == target.inputBtn) {
				System.out.println("입력");
				inputController.service();
				listController.service();
			}

			if(btn == target.updateBtn) {
				System.out.println("수정");
				updateController.service();
				listController.service();
			}
			if(btn == target.deleteBtn) {
				System.out.println("삭제");
				deleteController.service();
				listController.service();
			}

		}
	}

}
