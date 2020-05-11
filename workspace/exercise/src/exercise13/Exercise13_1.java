package exercise13;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// �Ʒ��� ������ó�� ���� ���� ũ�Ⱑ5 �� �������� ����ÿ�.
// �׸��� ��ư�� ������, ��ư�� ������ ���� ȸ��(Color.LIGHT_GRAY)���� �ٲ�� 
// ���� ��ư�� ���ڰ� �ֿܼ� ��µǰ� �Ͻÿ�.

public class Exercise13_1 {
	
	public static void main(String[] args) {
		BingoGame game = new BingoGame("bingo game");
		game.addWindowListener(new EventHandler());
	}
}


class BingoGame extends Frame {
	Button[] btnArr = new Button[5*5];
	String[] birdArr= {
		"����", "�η��","Ȳ��","��ѱ�","�����",
		"Ÿ��","�ξ���","����","�û���","���",
		"��","��","������","�ײ�","��",
		"����","������","�ܵ�","��Ȳ","����",
		"�޹���","��ġ","���","�Ҳ���","���"			
	};
	
	BingoGame() {
		this("Bingo Game");
	}
	
	BingoGame(String title) {
		super("Bingo Game");
		
		// layoutManager�� gridLayout
		this.setLayout(new GridLayout(5,5));
		
		// iv�� �ʱ�ȭ�Ѵ�.

		// ��ư ����
		// �̺�Ʈ ���
		// 1. ǥ���� ���� ���ϴ� �޼��带 ã�´�.
		// 2. 1���� ã�� �޼��尡 �ִ� �������̽��� ����
		// 3. 2���� ������ �ڵ鷯�� ���(����)
		for(int i=0; i<btnArr.length; i++) {
			btnArr[i] = new Button(birdArr[i]);
			btnArr[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					// ��ư�� ����� ȸ������
					Button btn = (Button) e.getSource();
					btn.setBackground(Color.LIGHT_GRAY);
					
					// ��ư�� �̸��� �ֿܼ� ���
					System.out.println(e.getActionCommand());
				}
			});
			this.add(btnArr[i]);
		}
		
		// frame�� ȭ�鿡 �����ش�.
		this.setSize(new Dimension(300,300));
		this.setVisible(true);
		
	}
}

class EventHandler implements WindowListener {
	public void windowOpened(WindowEvent e) {}

	public void windowClosing(WindowEvent e) { 
		e.getWindow().setVisible(false);
		e.getWindow().dispose(); 
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {} 
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

}


