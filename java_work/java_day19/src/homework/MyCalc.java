package homework;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import org.comstudy21.ch09.MyFrame;

public class MyCalc extends MyFrame {
	Panel p1 = new Panel(new GridLayout(1, 2, 3, 3));
	Panel p3 = new Panel(new GridLayout(2, 1, 3, 3));
	Panel p3_1 = new Panel(new GridLayout(4, 2, 3, 3));
	Panel p3_2 = new Panel(new GridLayout(2, 1, 3, 3));
	
	Button btn1 = new Button(" 1 ");
	Button btn2 = new Button(" 2 ");
	Button btn3 = new Button(" 3 ");
	Button btn4 = new Button(" 4 ");
	Button btn5 = new Button(" 5 ");
	Button btn6 = new Button(" 6 ");
	Button btn7 = new Button(" 7 ");
	Button btn8 = new Button(" 8 ");
	Button btn9 = new Button(" 9 ");
	Button btn10 = new Button(" 10 ");
	Button btn11 = new Button(" 11 ");
	
	
	public MyCalc() {
		p1.add(btn1);
		p1.add(btn2);
		p3_2.add(p1);
		p3_2.add(btn3);
		
		p3_1.add(btn4);
		p3_1.add(btn5);
		p3_1.add(btn6);
		p3_1.add(btn7);
		p3_1.add(btn8);
		p3_1.add(btn9);
		p3_1.add(btn10);
		p3_1.add(btn11);
		
		p3.add(p3_1);
		p3.add(p3_2);
		
		setLayout(new GridBagLayout());
		add(p3);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyCalc();
	}
}
