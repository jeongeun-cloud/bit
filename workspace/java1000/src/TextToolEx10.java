import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class TextToolEx10 extends Frame implements WindowListener {
	TextArea ta;
	TextField tfParam1, tfParam2;
	Panel pNorth, pSouth;
	Label lb1, lb2;

	String[] btnName = { "Undo", // �۾����� ���·� �ǵ���
			"¦���ٻ���", // ¦������ �����ϴ� ���
			"���ڻ���", // Param1�� ������ ���ڵ��� �����ϴ� ���
			"trim", // ������ �յ� ������ ����
			"���ٻ���", // �� �� ����
			"���λ��߰�", // Param1�� Param2�� ���ڿ��� �� ������ �յڿ� ���̴� ���
			"substring", // Param1�� Param2�� ������ ���ڿ��� �� ���ο��� �����ϴ� ���
			"substring2", // Param1�� Param2�� ������ ���ڿ��� �ѷ����� �κ��� ����� �����ϴ� ���
			"distinct", // �ߺ��������� �� �����ؼ� �����ֱ�
			"distinct2", // �ߺ��������� �� �����ؼ� �����ֱ� - �ߺ�ī��Ʈ ����
			"��������", // �����Ϳ� ������ ���� �����ϱ�
	};

	Button[] btn = new Button[btnName.length];

	private final String CR_LF = System.getProperty("line.separator"); // �ٹٲ޹���

	private String prevText = "";

	private void registerEventHandler() {
		addWindowListener(this);

		int n = 0; // ��ư����

		btn[n++].addActionListener(new ActionListener() { // Undo - �۾����� ���·� �ǵ���
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();

				if (!prevText.equals("")) {
					ta.setText(prevText);
				}

				prevText = curText;
			}
		});

		btn[n++].addActionListener(new ActionListener() { // ¦���ٻ��� - ¦������ �����ϴ� ���
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // ���ڻ��� - Param1�� ������ ���ڸ� �����ϴ� ���
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // trim - ������ �¿������ �����ϴ� ���
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // ���ٻ��� - �� �� ����
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // ���λ� - �� ���ο� ���λ�, ���̻� ���̱�
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // substring - ���ڿ� �ڸ���
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // substring2 - ������ ���ڸ� ã�Ƽ� �� ��ġ���� �߶󳻱�
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // distinct - �ߺ� ���� ����
			public void actionPerformed(ActionEvent ae) {
				/* ������� */

			}
		});

		btn[n++].addActionListener(new ActionListener() { // distinct2 - �ߺ� ���� ���� + ī��Ʈ
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

				Scanner s = new Scanner(curText);
				TreeMap map = new TreeMap();

				String delimiter = tfParam1.getText();

				if (delimiter.length() == 0)
					delimiter = ",";

				for (int i = 0; s.hasNextLine(); i++) {
					String line = s.nextLine();

					if (map.containsKey(line)) {
						Integer value = (Integer) map.get(line);
						map.put(line, new Integer(value.intValue() + 1));
					} else {
						map.put(line, new Integer(1));
					}
				}

				Iterator it = map.entrySet().iterator();

				while (it.hasNext()) {
					Map.Entry entry = (Map.Entry) it.next();

					int value = ((Integer) entry.getValue()).intValue();

					sb.append(entry.getKey());
					sb.append(delimiter);
					sb.append(value);
					sb.append(CR_LF);
				}

				ta.setText(sb.toString());
			}
		});

		btn[n++].addActionListener(new ActionListener() { // ��������
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

				String pattern = tfParam1.getText();
				String delimiter = tfParam2.getText();

				if (delimiter.length() == 0)
					delimiter = ",";

				/*
				 * ������ �ڵ带 �ϼ��ϼ���.
				 * 1. ScannerŬ������ �ݺ����� �̿��ؼ� curText�� ���δ����� �д´�.
				 * 2. ������ ������(delimiter)�� ������ ���ڿ� �迭�� �����Ѵ�.(StringŬ������ split()���)
				 * 3. param1�κ��� �Է¹��� pattern�� �� ���ο� �����ؼ� sb�� �����Ѵ�.
				 * (MessageFormatŬ������ format()���)
				 * 4. sb�� ������ TextArea�� �����ش�.
				 */
				
				Scanner scan = new Scanner(curText);
				for(int i=0; scan.hasNextLine(); i++) {
					String line = scan.nextLine();
					
					String[] strArr = line.split(delimiter);
					
					sb.append(MessageFormat.format(pattern, strArr));
					sb.append(CR_LF);
					
				}
				ta.setText(sb.toString());

			}
		});

	} // end of registerEventHandler()

	public static void main(String[] args) {
		TextToolEx10 win = new TextToolEx10("Text Tool");
		win.show();
	}

	public TextToolEx10(String title) {
		super(title);
		lb1 = new Label("param1:", Label.RIGHT);
		lb2 = new Label("param2:", Label.RIGHT);
		tfParam1 = new TextField(15);
		tfParam2 = new TextField(15);

		ta = new TextArea();
		pNorth = new Panel();
		pSouth = new Panel();

		for (int i = 0; i < btn.length; i++) {

			btn[i] = new Button(btnName[i]);
		}

		pNorth.setLayout(new FlowLayout());
		pNorth.add(lb1);
		pNorth.add(tfParam1);
		pNorth.add(lb2);
		pNorth.add(tfParam2);

		pSouth.setLayout(new GridLayout(2, 10));

		for (int i = 0; i < btn.length; i++) { // <BTN.LENGTH;I++) style="COLOR: #008200" { // ��ư�迭�� �ϴ� Panel�� �ִ´�.
			pSouth.add(btn[i]);
		}

		add(pNorth, "North");
		add(ta, "Center");
		add(pSouth, "South");

		setBounds(100, 100, 600, 300);
		ta.requestFocus();
		registerEventHandler();
		setVisible(true);
	} // public TextToolEx1(String title) {

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
      
} // end of class

