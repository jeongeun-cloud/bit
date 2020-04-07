package org.comstudy21.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Ch08Ex04 {

	public static void main(String[] args) throws IOException {
		InputStream is = Ch08Ex04.class.getResourceAsStream("Person.json");
		
//		int data = 0;
//		while((data = is.read()) != -1) {
//			System.out.print((char)data);
//		}
		
		// ǥ�� ���� ��Ʈ��
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		
//		String line = "";
//		while((line = br.readLine()) != null) {
//			System.out.println(line);			
//		}
		
		// 
		JSONTokener tokener = new JSONTokener(is); 
		JSONObject json = new JSONObject(tokener);
		System.out.println(json.get("name"));
		System.out.println(json.get("addr"));
		System.out.println(json.get("age"));
		
		JSONObject json2 = new JSONObject();
		json2.put("name", "�̼���");
		json2.put("addr", "����� ���α�");
		json2.put("age", "25");
		System.out.println(json instanceof JSONObject);
		
		String jsonStr = json2.toString();
		System.out.println(jsonStr);
		
		
	}

}
