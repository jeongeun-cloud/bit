package view;

import javax.swing.JPanel;

import resource.R;

public abstract class View extends JPanel implements R {

	public abstract void init(); // ���̾ƿ� ����
	public abstract void start(); // �̺�Ʈ ����
	
}
