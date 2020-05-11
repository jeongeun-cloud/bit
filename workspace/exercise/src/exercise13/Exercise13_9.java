package exercise13;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class BouncingBall2 extends Frame {
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	
	ArrayList balls = new ArrayList();

	BouncingBall2(String title) {
		super(title);
		
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		
		Insets insets = getInsets();
		
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	void start() {
		new BallGenerator().start();
		
		while (true) {
			int size = balls.size();
			
			for (int i = 0; i < size; i++) {
				Ball b = (Ball) balls.get(i);
				
				b.x += b.xStep;
				b.y += b.yStep;
				
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
				
				if( b.x <= LEFT) {
					b.x = LEFT;
					b.xStep *= -1;
				}
				if( b.x >= RIGHT-Ball.SIZE) {
					b.x = RIGHT-Ball.SIZE;
					b.xStep *= -1;
				}
				if( b.y <= TOP) {
					b.y = TOP;
					b.yStep *= -1;
				}
				if( b.y >= BOTTOM-Ball.SIZE) {
					b.y = BOTTOM-Ball.SIZE;
					b.yStep *= -1;
				}
				
			}
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	} // start()

	public void paint(Graphics g) {
		g.drawString("Number of balls :" + balls.size(), 20, 50);
		g.setColor(Color.RED);
		int size = balls.size();
		for (int i = 0; i < size; i++) {
			Ball b = (Ball) balls.get(i);
			g.fillOval(b.x, b.y, Ball.SIZE, Ball.SIZE);
		}
	}

	class BallGenerator extends Thread {
		public void run() {
			/*
			 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
			 *  1. 3�ʸ��� Frame�� ������ ��ġ�� ���� �����ؼ� balls�� �߰��Ѵ�.
			 */
			while (true) {
				int x = (int) (Math.random() * (RIGHT - LEFT - Ball.SIZE)) + LEFT;
				int y = (int) (Math.random() * (BOTTOM - TOP - Ball.SIZE)) + TOP;
				
//				int x = 100;
//				int y = 100;
				
				// ���� balls�� �߰��Ѵ�.
				balls.add(new Ball(x, y));
				try {
					Thread.sleep(3 * 1000);
				} catch (Exception e) {
					
				}
			}
			
		} // run()
	}

	class Ball {
		int x = 100;
		int y = 100;
		static final int SIZE = 30;
		final int SPEED = 5;
		int xStep = SPEED;
		int yStep = SPEED;

		Ball(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
} // class BouncingBall2

class Exercise13_9 {
	public static void main(String[] args) {
		new BouncingBall2("Bouncing Ball 2").start();
	}
}
