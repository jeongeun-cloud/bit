package exercise13;

import java.awt.*;
import java.awt.event.*;

class BouncingBall extends Frame {
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	final int SPEED = 3;
	
	int x = 100;
	int y = 100;
	
	int xStep = SPEED;
	int yStep = SPEED;

	BouncingBall(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		
		Insets insets = getInsets(); // Frame�� �׵θ��� �β��� ���´�.
		
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
	}

	void start() {
		while (true) {
			x += xStep;
			y += yStep;
			/*
			 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			 * 1. x�� ���� ���� �׵θ� (LEFT)���� �۰ų� ������
			 * 		x�� ���� LEFT�� �ٲٰ� x�� �̵����� (xStep)�� �ݴ�� �Ѵ�.
			 * 2. x�� ���� ������ �׵θ� (RIGHT-BALL_SIZE) ���� �۰ų� ������
			 * 		x�� ���� RIGHT-BALL_SIZE�� �ٲٰ� x�� �̵�����(xStep)�� �ݴ�� �Ѵ� 
			 * 3. y�� ���� �� �� �׵θ� (TOP)���� �۰ų� ������
			 *		y�� ���� TOP���� �ٲٰ� y�� �̵�����(yStep)�� �ݴ�� �Ѵ�
			 * 4. y�� ���� �Ʒ� �� �׵θ�(BOTTOM-BALL_SIZE)���� �۰ų� ������ 
			 * 		y�� ���� BOTTOM-BALL_SIZE�� �ٲٰ� y�� �̵�����(yStep)�� �ݴ�� �Ѵ�.
			 */
			
			//  x�� ���� ���� �׵θ� (LEFT)���� �۰ų� ������
			if( x <= LEFT) {
				// x�� ���� LEFT�� �ٲٰ� x�� �̵����� (xStep)�� �ݴ�� �Ѵ�.
				x = LEFT;
				xStep *= -1;
			}
			// x�� ���� ������ �׵θ� (RIGHT-BALL_SIZE) ���� �۰ų� ������
			if( x >= RIGHT-BALL_SIZE) {
				// x�� ���� RIGHT-BALL_SIZE�� �ٲٰ� x�� �̵�����(xStep)�� �ݴ�� �Ѵ� 
				x = RIGHT-BALL_SIZE;
				xStep *= -1;
			}
			// y�� ���� �� �� �׵θ� (TOP)���� �۰ų� ������
			if( y <= TOP) {
				// y�� ���� TOP���� �ٲٰ� y�� �̵�����(yStep)�� �ݴ�� �Ѵ�
				y = TOP;
				yStep *= -1;
			}
			if( y >= BOTTOM-BALL_SIZE) {
				y = BOTTOM-BALL_SIZE;
				yStep *= -1;
			}
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	} // start()

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
	}
}

class Exercise13_8 {
	public static void main(String[] args) {
		new BouncingBall("Bouncing Ball").start();
	}
}