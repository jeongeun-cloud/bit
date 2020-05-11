package exercise15;

import java.io.*;

class Exercise15_5 {
	public static void main(String[] args){
		if(args.length != 2) {
			System.out.println("USAGE: java Exercise15_5 TAGET_FILE RESULT_FILE");
					System.exit(0);
		}
		
		String inputFile = args[0];
		String outputFile = args[1];
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));
			
			int ch = 0;
			
			while((ch=input.read())!=-1) {
				output.write(ch);
			}
			
			input.close();
			output.close();
			
		} catch(IOException e) {}
	}
}

class HtmlTagFilterWriter extends FilterWriter {
	StringWriter tmp = new StringWriter();
	boolean inTag = false;

	HtmlTagFilterWriter(Writer out) {
		super(out);
	}

	public void write(int c) throws IOException {
		/*
		 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1. ����� ����(c)�� '<'�̸� inTag�� ���� true�� �Ѵ�.
		 * 2. ����� ����(c)�� '>'�̸� inTag�� ���� false�� �Ѵ�.
		 * 		���ο� StringWriter�� �����Ѵ�(���� StringWriter�� ������ ������.
		 * 3. inTag�� ���� true�̸�, StringWriter�� ����(c)�� ����ϰ�
		 * 		inTag�� ���� false�̸�, out�� ����(c)�� ����Ѵ�.
		 * 
		 * [����] �±װ� ���۵Ǹ� StringWriter�� ����ϰ�  �±װ� ������ StringWriter�� �������.
		 */
		
		
	}

	public void close() throws IOException {
		out.write(tmp.toString()); // StringWriter�� ������ ����ϰ�
		super.close(); // ������ close()�� ȣ���ؼ� ��� ��Ʈ���� �ݴ´�.
	}
}