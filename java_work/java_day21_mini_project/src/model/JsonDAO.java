package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject; // JSON in JAVA
import org.json.JSONTokener;

public class JsonDAO {
	FileReader reader = null;
	FileWriter writer = null;
	String filepath = "src/resource/members.json";
	
	private JSONObject getJsonObject() {
		JSONObject jsonObj;
		try {
			File file = new File(filepath);
			reader = new FileReader(file);
			JSONTokener tokener = new JSONTokener(reader);
			jsonObj = new JSONObject(tokener);
			return jsonObj;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Vector<Vector> selectAll() {
		// 파일을 읽어들인다. -> JSONObject 객체로 만든다.
		JSONObject rootObj = getJsonObject();
		JSONArray arr = rootObj.getJSONArray("members");
		
		Vector<Vector> vector = new Vector<>();
		for(int i=0; i<arr.length(); i++) {
			JSONObject obj = (JSONObject)arr.getJSONObject(i);
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
		JSONObject rootObj = getJsonObject();
		JSONArray arr = rootObj.getJSONArray("members");
		int seq = rootObj.getInt("seq");
		
		JSONObject obj = new JSONObject();
		obj.put("no", seq++);
		obj.put("name", dto.getName());
		obj.put("email", dto.getEmail());
		obj.put("phone", dto.getPhone());
		
		arr.put(obj);
		
		rootObj.put("seq", seq);
		
		try {
			File file = new File(filepath);
			writer = new FileWriter(file);
			writer.write(rootObj.toString(2));
			
			if(reader != null) reader.close();
			if(writer != null) writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
