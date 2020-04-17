package evt_handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import resource.R;

public class MouseEventHandler implements MouseListener, R {

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() instanceof JTable) {
			JTable table = (JTable)e.getSource();
			int row = table.getSelectedRow();
			
			//System.out.println("Row => " + row);
			noLabel.setText("No : " + dm.getValueAt(row, 0).toString());
			nameField.setText(dm.getValueAt(row, 1).toString());
			emailField.setText(dm.getValueAt(row, 2).toString());
			phoneField.setText(dm.getValueAt(row, 3).toString());
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
