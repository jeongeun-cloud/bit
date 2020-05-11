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

// 아래의 실행결과처럼 가로 세로 크기가5 인 빙고판을 만드시오.
// 그리고 버튼을 누르면, 버튼의 배경색이 밝은 회색(Color.LIGHT_GRAY)으로 바뀌고 
// 누른 버튼의 글자가 콘솔에 출력되게 하시오.

public class Exercise13_1 {
	
	public static void main(String[] args) {
		BingoGame game = new BingoGame("bingo game");
		game.addWindowListener(new EventHandler());
	}
}


class BingoGame extends Frame {
	Button[] btnArr = new Button[5*5];
	String[] birdArr= {
		"참새", "두루미","황새","비둘기","까오기",
		"타조","부엉이","오리","올빼미","뱁새",
		"꿩","닭","구관조","잉꼬","매",
		"거위","독수리","콘돌","봉황","공작",
		"앵무새","까치","까마귀","꾀꼬리","고니"			
	};
	
	BingoGame() {
		this("Bingo Game");
	}
	
	BingoGame(String title) {
		super("Bingo Game");
		
		// layoutManager를 gridLayout
		this.setLayout(new GridLayout(5,5));
		
		// iv를 초기화한다.

		// 버튼 생성
		// 이벤트 등록
		// 1. 표에서 내가 원하는 메서드를 찾는다.
		// 2. 1에서 찾은 메서드가 있는 인터페이스를 구현
		// 3. 2에서 구현한 핸들러를 등록(연결)
		for(int i=0; i<btnArr.length; i++) {
			btnArr[i] = new Button(birdArr[i]);
			btnArr[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					// 버튼의 배경을 회색으로
					Button btn = (Button) e.getSource();
					btn.setBackground(Color.LIGHT_GRAY);
					
					// 버튼의 이름을 콘솔에 출력
					System.out.println(e.getActionCommand());
				}
			});
			this.add(btnArr[i]);
		}
		
		// frame을 화면에 보여준다.
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


