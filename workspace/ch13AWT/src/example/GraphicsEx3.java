package example;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEx3 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;
	
	public static void main(String[] args) {
		new GraphicsEx3("GraphicsEx3");
	}
	
	public GraphicsEx3(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		// Frame�� (100,100)�� ��ġ�� width 500, height 500 ũ��� ���̰� �Ѵ�.
		setBounds(100,100, 500,500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("���콺�� ������������.", 10, 50);
		g.drawString("*", x, y);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {}
	
}
