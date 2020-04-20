package evt_handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;
import javax.swing.JTextField;

import resource.R;
import view.InputView;

public class MouseEventHandler implements MouseListener, R {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable)e.getSource();
			int row = table.getSelectedRow();
			
			numLable.setText(dm.getValueAt(row, 0).toString());
			datetxt.setText(dm.getValueAt(row, 1).toString());
			customertxt.setText(dm.getValueAt(row, 2).toString());
			producttxt.setText(dm.getValueAt(row, 3).toString());
			InputView.combo.setSelectedItem(dm.getValueAt(row, 4));
			qauntitytxt.setText(dm.getValueAt(row, 5).toString());
			pricetxt.setText(dm.getValueAt(row, 6).toString());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	

}
