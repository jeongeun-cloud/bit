package org.comstudy21.model;

public class Dao {
	public static final int MAX = 100;
	private Dto[] dtoArr = new Dto[MAX];
	private int top = 0; // 현재 입력 데이터 갯수
	private int seq = 1; // 데이터가 추가 될 때마다 계속 증가한다. (고유번호 idx)
	
	// 샘플
	{
		dtoArr[top++] = new Dto(seq++, "Ju", "010-1111-1111");
		dtoArr[top++] = new Dto(seq++, "Moon", "010-2222-2222");
		dtoArr[top++] = new Dto(seq++, "Bae", "010-3333-3333");
		dtoArr[top++] = new Dto(seq++, "Moon", "010-4444-4444");
		dtoArr[top++] = new Dto(seq++, "Kim", "010-5555-5555");
		dtoArr[top++] = new Dto(seq++, "Ju", "010-5555-5555");
		dtoArr[top++] = new Dto(seq++, "Yoon", "010-5555-5555");
	}
	
	// 싱글톤
	private Dao() {}
	private static Dao instance; // 참조변수는 지정해주지 않을 경우 null로 초기화 됨
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	// 삽입
	public void insert(Dto dto) {
		dto.setIdx(seq++);
		dtoArr[top++] = dto;
	}
	
	// 출력
	public Dto[] selectAll() {
		Dto[] arr = new Dto[top];
		for(int i=0; i<top; i++) {
			arr[i] = new Dto();
			arr[i].setIdx(dtoArr[i].getIdx());
			arr[i].setName(dtoArr[i].getName());
			arr[i].setPhone(dtoArr[i].getPhone());
		}
		return arr;
	}
	
	// 서칭
	public Dto[] select(Dto dto) {
		Dto[] newArr = new Dto[top]; // 조건에 맞는 부분만 새로운 배열을 만들어서 저장 후 출력 
		int cnt = 0;
		
		for(int i=0; i<top; i++) {
			if(dtoArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())){
				newArr[cnt] = new Dto();
				newArr[cnt].setIdx(dtoArr[i].getIdx());
				newArr[cnt].setName(dtoArr[i].getName());
				newArr[cnt].setPhone(dtoArr[i].getPhone());
				cnt++;
			}
		}
		Dto[] arr = new Dto[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = newArr[i];
		}
		return arr;
	}
	
	public Dto selectOne(Dto dto) {
		return null;
	}
	
	// 수정
	public void update(Dto dto) {
		boolean flag = false;
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == dtoArr[i].getIdx()) {
				dtoArr[i] = dto; // setName, setPhone 할 필요 없이 모든 정보 덮어 씌어주기
				flag = true;
				return;
			}
		}
		if(flag) {
			System.out.println("수정 성공!");
		} else {
			System.out.println("수정 실패!");
		}
	}
	
	// 삭제
	public void delete(Dto dto) {
		boolean flag = false;
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == dtoArr[i].getIdx()) {
				// 값을 뒤에서 하나씩 땡겨주고
				for(int j=i; j<top-1; j++) {
					dtoArr[j] = dtoArr[j+1];
				}
				//dtoArr[top-1] = null;
				top--; // top을 하나 줄인다.
				flag = true;
				return;
			}
		}
		if(flag) {
			System.out.println("삭제 완료!");
		} else {
			System.out.println("삭제 실패!");
		}
		
	}
	
}
