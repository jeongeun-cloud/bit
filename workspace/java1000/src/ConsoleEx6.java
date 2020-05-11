
// [����6] ������ ������ ������ �����ִ� type����� �����϶�. type����� ������ 'type FILE_NAME'�̸�,
// FILE_NAME���� ������ ������ ã�Ƽ� �� ������ ȭ�鿡 ��������Ѵ�.
// ��, FILE_NAME�� ���� ���丮�� ���Ե� �����̾�� �ϸ�, 
// �ش� ������ �������� ������ �������� �ʴ� �����̶�� ȭ�鿡 ����Ѵ�.

import java.io.*;
import java.util.*;
import java.util.regex.*;

class ConsoleEx6 {
	static String[] argArr; // �Է��� �Ű������� ������� ���ڿ��迭
	static LinkedList q = new LinkedList(); // ����ڰ� �Է��� ������ ������ ť(Queue)
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.

	static File curDir;

	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // �ѹ��� �����ؼ� �����ϸ� �ǹǷ� �ݺ��� ������ �̵�

		while (true) {
			try {
				String prompt = curDir.getCanonicalPath() + ">>";
				System.out.print(prompt);

				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				String input = s.nextLine();

				save(input);

				input = input.trim(); // �Է¹��� ������ ���ʿ��� �յ� ������ �����Ѵ�.
				argArr = input.split(" +");

				String command = argArr[0].trim();

				if ("".equals(command))
					continue;

				command = command.toLowerCase(); // ��ɾ �ҹ��ڷ� �ٲ۴�.

				if (command.equals("q")) { // q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
					System.exit(0);
				} else if (command.equals("history")) {
					history();
				} else if (command.equals("dir")) {
					dir();
				} else if (command.equals("type")) {
					type();
				} else {
					for (int i = 0; i < argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch (Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		} // while(true)
	} // main

	public static void save(String input) {
		if (input == null || "".equals(input))
			return;

		q.add(input); 
		
		if (((LinkedList) q).size() > MAX_SIZE)
			q.remove();
	}

	public static void history() {
		int i = 0;

		ListIterator it = q.listIterator();
		
		while (it.hasNext()) {
			System.out.println(++i + "." + it.next());
		}
	}

	public static void dir() {
		String pattern = "";

		switch (argArr.length) {
		case 1:
			for (File f : curDir.listFiles()) {
				if (f.isDirectory()) {
					System.out.println("[" + f.getName() + "]");
				} else {
					System.out.println(f.getName());
				}
			}
			break;
		case 2:
			pattern = argArr[1];
			pattern = pattern.toUpperCase();
			pattern = pattern.replace(".", "\\.");
			pattern = pattern.replace("*", ".*");
			pattern = pattern.replace("?", ".{1}");

			Pattern p = Pattern.compile(pattern);

			for (File f : curDir.listFiles()) {
				String tmp = f.getName().toUpperCase();
				Matcher m = p.matcher(tmp);

				if (m.matches()) {
					if (f.isDirectory()) {
						System.out.println("[" + f.getName() + "]");
					} else {
						System.out.println(f.getName());
					}
				}
			} // for

			break;
		default:
			System.out.println("USAGE : dir [FILENAME]");
		} // switch
	} // dir()

	public static void type() throws IOException {
		if (argArr.length != 2) {
			System.out.println("Usage : type FILE_NAME");
			return;
		}

		String fileName = argArr[1];

		File tmp = new File(fileName);

		/*
		 * ������ �ڵ带 �ϼ��ϼ���.
		 * 1. ����(tmp)�� �����ϴ��� Ȯ���ϰ�,
		 * 1.1 �����ϸ�, ������ ������ ȭ�鿡 ����Ѵ�.
		 * (FileReader�� BufferedReader�� ���)
		 * 1.2 �������� ������, �������� �ʴ� �����̶�� ����Ѵ�.
		 */
		
		

		return;
	}
} // class
