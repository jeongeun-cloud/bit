package org.comstudy21.model;

import static org.comstudy21.resource.R.*;

public class DAO {
	// DB나 파일에 데이터를 저장하는 역할
	private static int sequence = 1;
	private People[] pArr = new People[MAX];
	private int top = 0;
	
	// 초기화 블럭
	{
		pArr[top++] = new People(sequence++, "Ju", "1111-1111");
		pArr[top++] = new People(sequence++, "Moon", "2222-2222");
		pArr[top++] = new People(sequence++, "Bae", "3333-3333");
		pArr[top++] = new People(sequence++, "Yoon", "4444-4444");
		pArr[top++] = new People(sequence++, "Kim", "5555-5555");
	}
	
	
	// 싱글톤 패턴
	// 한개만 있어도 되는 것은 싱글톤 (외부에서 더 이상 생성 못시키도록)
	// 생성자를 public이 아닌 private으로 선언
	private DAO() {
		// TODO Auto-generated constructor stub
	}
	
	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance == null) {
			instance = new DAO();
		}
		return instance;
	}
	
	
	public void insert(People dto) {
		if(top >= MAX) {
			System.out.println("더 이상 입력할 수 없습니다");
			return;
		}
		dto.setIdx(sequence++);
		pArr[top++] = dto;
	}
	
	public People[] select() {
		People[] arr = new People[top];
		for(int i=0; i<arr.length; i++) {
			People dto = new People();
			dto.setIdx(pArr[i].getIdx());
			dto.setName(pArr[i].getName());
			dto.setPhone(pArr[i].getPhone());
			arr[i] = dto;
		}
		return arr;	// 모든 내용을 카피해서 외부에서 수정해도 원본이 바뀌지 않도록 함
		// return pArr;	// (private 선언한)참조변수를 그대로 넣는 것은 보안 취약  
	}


	public People[] select(People dto) {
		People[] tmp = new People[top];
		int cnt = 0;
		for(int i=0; i<top; i++) {
			if(pArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())){
				People p = new People();
				p.setIdx(pArr[i].getIdx());
				p.setName(pArr[i].getName());
				p.setPhone(pArr[i].getPhone());
				tmp[cnt++] = p;
			}
		}
		People[] arr = new People[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = tmp[i];
		}
		return arr;
	}


	public void modify(People dto) {
		// pArr에서 dto의 idx와 같은 데이터를 찾아서 객체를 교체한다.
		boolean flag = false;
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == pArr[i].getIdx()) {
				pArr[i] = dto;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("수정 실패!");
		} else {
			System.out.println("수정 성공!");
		}
		
	}


	public void delete(People dto) {
		// dto.idx와 같은 데이터를 찾아서 제거한다.
		// 한 칸씩 앞으로 이동 후에 top--
		boolean flag = false;
		
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == pArr[i].getIdx()) {
				for(int j=i; j<top-1; j++) {
					pArr[j] = pArr[j+1];
				}
				top--;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("삭제 실패!");
		} else {
			System.out.println("삭제 성공!");
		}
		
		
	}
	
	
}
