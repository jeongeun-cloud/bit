import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BingoEx1 extends Frame {

	final int SIZE = 5; // �������� ũ��
	int bingoCnt = 0; // �ϼ��� ������ ��

	Button[] btnArr = null;
	boolean[][] bArr = new boolean[SIZE][SIZE]; // ������ üũ���� Ȯ���� ���� �迭

	BingoEx1() {
		this("Bingo Game Ver1.0");
	}

	BingoEx1(String title) {
		super(title);

		setLayout(new GridLayout(SIZE, SIZE));

		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);

		btnArr = new Button[SIZE * SIZE];

		// Frame�� ��ư�� �߰��Ѵ�.
		for (int i = 0; i < SIZE * SIZE; i++) {
			btnArr[i] = new Button(i + 1 + "");
			add(btnArr[i]);
			btnArr[i].addActionListener(handler);
		}

		setBounds(500, 200, 300, 300);
		setVisible(true);
	}

	void print() { // �迭 bArr�� ����Ѵ�.

		/*
		 * �ڵ带 �ϼ��ϼ���.
		 * �迭 bArr�� ������ �������� ���� �������� ����ϼ���.
		 */
	}

	boolean checkBingo() { // ���� �ϼ��Ǿ������� Ȯ���Ѵ�.
		bingoCnt = 0;
		int garoCnt = 0; // �������� O�� ����

		int seroCnt = 0; // �������� O�� ����
		int crossCnt1 = 0; // �밢���� O�� ����
		int crossCnt2 = 0; // ���밢���� O�� ����

		/*
		 * ������ �ڵ带 �ϼ��ϼ���.
		 * 1. ���� �ݺ����� �̿��ؼ� �迭 bArr�� ���� üũ�Ѵ�.
		 * 2. �ϼ��� ������ ���� ��� SIZE�� �������� ũ�ų� ������ true��
		 * �׷��� ������ false�� ��ȯ�Ѵ�.
		 */
		return false;

	}

	public static void main(String args[]) {
		BingoEx1 win = new BingoEx1("Bingo Game Ver1.0");
		win.show();
	}

	class MyEventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Button btn = (Button) ae.getSource();

			/*
			 * ������ �ڵ带 �ϼ��ϼ���.
			 * 1. �ݺ����� ����, ��ư �迭 btnArr���� btn(������ ��ư)�� ���� ���� ã�´�.
			 * 1.1 ã����, btnArr���� btn�� ã�� ��ġ(index)�� �����ϴ� bArr�� ���� Ȯ���Ѵ�.
			 * (btnArr�� ������ �迭�̰�, bArr�� 2���� �迭�̹Ƿ� �� �� �迭���� ���踦 �߰���ؾ��Ѵ�.)
			 * 1.1.1 bArr�� ���� true�̸� "�̹� ���� ��ư�Դϴ�."��� �ֿܼ� ����Ѵ�.
			 * 1.1.2 bArr�� ���� false�̸�, true�� �ٲ㼭 �����Ѵ�.
			 * 1.2 btnArr���� btn�� ã�Ƽ� �۾��� �������Ƿ� �ݺ����� ����������.
			 * 2. 1���� ã�� ��ư�� ������ ��������� �ٲ۴�.(setBackground()���)
			 * 3. �迭 bArr�� �ֿܼ� ����Ѵ�.(BingoEx1Ŭ������ print()���)
			 * 4. checkBingo()�� ȣ���ؼ� ���� �ϼ��Ǿ����� Ȯ���ϰ�, �ϼ��Ǿ�����
			 * �ֿܼ� "Bingo~!!!"��� ����Ѵ�.
			 */

		}

		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	}
}
