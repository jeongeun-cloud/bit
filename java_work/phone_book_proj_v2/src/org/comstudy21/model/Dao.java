package org.comstudy21.model;

public class Dao {
	public static final int MAX = 100;
	private Dto[] dtoArr = new Dto[MAX];
	private int top = 0; // ���� �Է� ������ ����
	private int seq = 1; // �����Ͱ� �߰� �� ������ ��� �����Ѵ�. (������ȣ idx)
	
	// ����
	{
		dtoArr[top++] = new Dto(seq++, "Ju", "010-1111-1111");
		dtoArr[top++] = new Dto(seq++, "Moon", "010-2222-2222");
		dtoArr[top++] = new Dto(seq++, "Bae", "010-3333-3333");
		dtoArr[top++] = new Dto(seq++, "Moon", "010-4444-4444");
		dtoArr[top++] = new Dto(seq++, "Kim", "010-5555-5555");
		dtoArr[top++] = new Dto(seq++, "Ju", "010-5555-5555");
		dtoArr[top++] = new Dto(seq++, "Yoon", "010-5555-5555");
	}
	
	// �̱���
	private Dao() {}
	private static Dao instance; // ���������� ���������� ���� ��� null�� �ʱ�ȭ ��
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	// ����
	public void insert(Dto dto) {
		dto.setIdx(seq++);
		dtoArr[top++] = dto;
	}
	
	// ���
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
	
	// ��Ī
	public Dto[] select(Dto dto) {
		Dto[] newArr = new Dto[top]; // ���ǿ� �´� �κи� ���ο� �迭�� ���� ���� �� ��� 
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
	
	// ����
	public void update(Dto dto) {
		boolean flag = false;
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == dtoArr[i].getIdx()) {
				dtoArr[i] = dto; // setName, setPhone �� �ʿ� ���� ��� ���� ���� �����ֱ�
				flag = true;
				return;
			}
		}
		if(flag) {
			System.out.println("���� ����!");
		} else {
			System.out.println("���� ����!");
		}
	}
	
	// ����
	public void delete(Dto dto) {
		boolean flag = false;
		for(int i=0; i<top; i++) {
			if(dto.getIdx() == dtoArr[i].getIdx()) {
				// ���� �ڿ��� �ϳ��� �����ְ�
				for(int j=i; j<top-1; j++) {
					dtoArr[j] = dtoArr[j+1];
				}
				//dtoArr[top-1] = null;
				top--; // top�� �ϳ� ���δ�.
				flag = true;
				return;
			}
		}
		if(flag) {
			System.out.println("���� �Ϸ�!");
		} else {
			System.out.println("���� ����!");
		}
		
	}
	
}
