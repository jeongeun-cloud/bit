package org.comstudy21.ch08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

public class Ch08Ex03 {
	
	public Ch08Ex03() throws IOException {
		String spec = "https://lh3.googleusercontent.com/proxy/VO44UQhSAXnmT3fzuP5gV5rr3E3GDOv3_lhuqzKJpn962dmxjaB4qCBrX2qb5WaiD05OSqy6UpkX6YTsbHeKHC7n60HoYpjuBiNd_QvcxZLaPygG34bFHCF5JaS3HcbV";
		URL url = new URL(spec);
		
		InputStream is = url.openStream();
		FileOutputStream fos = null;
		
		File file = new File("test2.jpg");
		if(!file.exists()) {
			if(file.createNewFile()) {
				fos = new FileOutputStream(file);
				int data = 0;
				while((data = is.read()) != -1) {
					fos.write(data);
				}
				System.out.println("�����Ǿ����ϴ�");
				//fos.close();
			}
		}
		if(is != null) is.close();
		if(fos != null) fos.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		new Ch08Ex03();
	}
	
	
	public static void test2(String[] args) {
		File file = new File("./src/org/comstudy21/ch08");
		if(file.isDirectory()) {
			System.out.println("���丮 �Դϴ�!");
			String[] fileNames = file.list();
			for(String fileName : fileNames) {
				System.out.println(fileName);
			}
		}
		
		if(file.canRead()) {
			System.out.println("���� �� �ֽ��ϴ�.");
			System.out.println(file.getAbsolutePath());
		}
		
	}
	
	
	
	public static void test(String[] args) throws IOException {
		File file = new File("test.txt");
		
		if(file.exists()) {
			System.out.println("������ �����մϴ�.");
			if(file.delete()) {
				System.out.println("������ ���� �Ǿ����ϴ�.");
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			if(file.createNewFile()) {
				System.out.println("�� ������ ���� �Ǿ����ϴ�.");
			}
		}
	}

}
