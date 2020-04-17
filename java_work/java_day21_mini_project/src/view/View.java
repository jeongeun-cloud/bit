package view;

import javax.swing.JPanel;

import resource.R;

public abstract class View extends JPanel implements R {
	public View() {
		display();
	}
	
	public abstract void display();
	
}
