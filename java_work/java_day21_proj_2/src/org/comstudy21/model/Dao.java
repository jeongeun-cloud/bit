package org.comstudy21.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {
	private String pathname = "src/org/comstudy21/resource/students.json";
	private FileReader reader;
	private FileWriter writer;
	
	private JSONObject getJsonObect() {
		File dataFile = new File(pathname);
		try {
			reader = new FileReader(dataFile);
			
			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Vector<Vector> selectAll() {
		// JSONObject�� Ȱ���Ѵ�.
		JSONObject jsonObject = getJsonObect();
		if(jsonObject == null) {
			System.out.println("ó�� �� �����Ͱ� �����ϴ�!");
			return null;
		}
		
		JSONArray jsonArray = jsonObject.getJSONArray("studentArr"); 
		
		Vector<Vector> vector = new Vector<>();
		for(int i=0; i<jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			Vector v = new Vector<>();
			v.add(obj.get("no"));
			v.add(obj.get("name"));
			v.add(obj.get("email"));
			v.add(obj.get("phone"));
			vector.add(v);
		}
		
		return vector;
	}
	
	
	public void insert(Member dto) {
		// ����Ʈ�� �����´� -> ����Ʈ�� dto�� ���� �߰��Ѵ�. -> �ٽ� �����Ѵ�.
		File file = new File(pathname);
		if(!file.exists()) {
			JSONObject newObj = new JSONObject();
			newObj.put("no", 1);
			newObj.put("name", dto.getName());
			newObj.put("email", dto.getEmail());
			newObj.put("phone", dto.getPhone());
			JSONArray newArr = new JSONArray();
			newArr.put(newObj);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);
			jsonObject.put("studentArr", newArr);
			
			try {
				writer = new FileWriter(file);
				writer.write(jsonObject.toString(2));
				//System.out.println("������ ���� ����!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (reader != null) reader.close();
					if (writer != null) writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			return;
		}

		JSONObject jsonObject = getJsonObect();
		if(jsonObject == null) {
			System.out.println("ó�� �� �����Ͱ� �����ϴ�!");
			return;
		}
		
		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		JSONObject obj = new JSONObject();
		int seq = jsonObject.getInt("seq");
		obj.put("no", seq++);
		obj.put("name", dto.getName());
		obj.put("email", dto.getEmail());
		obj.put("phone", dto.getPhone());
		jsonArray.put(obj);
		
		JSONObject newObj = new JSONObject();
		newObj.put("studentArr", jsonArray);
		newObj.put("seq", seq);
		
		try {
			writer = new FileWriter(file);
			writer.write(newObj.toString(2));
			//System.out.println("������ ���� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public void delete(Member dto) {
		JSONObject rootObj = getJsonObect();
		JSONArray arr = rootObj.getJSONArray("studentArr");
		int seq = rootObj.getInt("seq");
		
		for(int i=0; i<arr.length(); i++) {
			JSONObject obj = (JSONObject)arr.get(i);
			if(dto.getNo() == obj.getInt("no")) {
				arr.remove(i);
			}
		}
		//System.out.println(rootObj);
		
		try {
			File file = new File(pathname);
			writer = new FileWriter(file);
			writer.write(rootObj.toString(2));
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) reader.close();
				if (writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public Vector<Vector> select(Member member) {
		Vector<Vector> vector = new Vector<>();
		
		JSONObject rootObj = getJsonObect();
		JSONArray arr = rootObj.getJSONArray("studentArr");
		for(int i=0; i<arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			// (obj.get("name")).toString().indexOf(member.getName()) != -1 // �Ϻκи� �¾Ƶ� ã�Ƽ� ���
			if( member.getName().length() != 0 && obj.get("name").toString().indexOf(member.getName()) != -1 
					|| member.getEmail().length() != 0 && obj.get("email").toString().indexOf(member.getEmail()) != -1 
					|| member.getPhone().length() != 0 && obj.get("phone").toString().indexOf(member.getPhone()) != -1  ) {
				Vector v = new Vector<>();
				v.add(obj.getInt("no"));
				v.add(obj.get("name"));
				v.add(obj.get("email"));
				v.add(obj.get("phone"));
				vector.add(v);
			}
		}
		
		return vector;
	}

	
//	public static void main(String[] args) {
//		Dao dao = new Dao();
//		dao.delete();
//	}
	
	
	// �߰��� ����� �Ǵ��� �׽�Ʈ
//	public static void main(String[] args) {
//		Dao dao = new Dao();
//		dao.insert(new Member(0, "a", "a@a.com", "111111"));
//		
//	}

	// Vector�� �� ����ǰ� �ҷ��������� �׽�Ʈ
//	public static void main(String[] args) {
//		Dao dao = new Dao();
//		Vector<Vector> vector = dao.selectAll();
//		System.out.println(vector);
//	}

}