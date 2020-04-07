package org.comstudy21.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch08Ex02 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		int data = 0;
		FileInputStream fis = new FileInputStream("E:\\jje_work\\test.data");
		//InputStream fis = Ch08Ex02.class.getResourceAsStream("data.txt"); // 패키지에 있는 텍스트파일 가져올 수 있음 		
		OutputStream os = System.out;
		
		while((data = fis.read()) != -1) {
			os.write(data);
		}
	}
	
	
	public static void test (String[] args) throws IOException {
		int data = 0;
		InputStream is = System.in;
		FileOutputStream fos = new FileOutputStream("E:\\jje_work\\test.data");
		
		System.out.println("데이터를 입력하세요. 끝내려면 [Ctrl]+Z를 누르세요.");
		while((data=is.read())!= -1) {
			fos.write(data);
		}
		is.close();
		fos.close();
	}

}
