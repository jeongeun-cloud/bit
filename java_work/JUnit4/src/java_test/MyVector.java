package java_test;

import java.util.Objects;

public class MyVector {
	Object[] objArr = {}; // ��ü �迭	{}�� �Ⱦ��� null�� �Ǿ nullPointException �߻�
	Object obj;
	int capacity;
	int size = 0;
	
	public MyVector() {
		this(16);
	}

	public MyVector(int capacity) {
		// �Ű� ������ ��ȿ�� �˻�
		if(capacity <0) {
			throw new IllegalArgumentException("IllegalCapacit : " + capacity);
		}
		objArr = new Object[capacity];
	}

	// �迭 objArr�� ����(objArr.length)�� ��ȯ
	public int capacity() {
		return objArr.length;
	}

	public int size() {
		return size;
	}

	// objArr�� ������� �˷��ش�.
	// ����ٴ°� �� �ǹ�����?
	public boolean isEmpty() {
//		if(size == 0) {
//			return true;
//		}
//		return false;
		return size == 0;
	}
	
	
	// ��ü �迭(objArr)�� ��ü(obj)�� �߰�
	// objArr[index] ������ �Ѿ�� obj�� �����Ѵ�.
	// size�� �ϳ� �þ ������ ++;
	void add(Object obj){
		// 1. ���� ���� Ȯ��
		//	���� ������ ������
		// � �� ���� ������ ���°���?
		if(size >= capacity()) {
			// ��������� �÷��ش�.
			// 1. ���ο� �迭�� �����. (������ 2��)
			Object[] tmpArr = new Object[capacity()*2];
			// 2. ���� ���� ���� (objArr -> tmpArr)
			System.arraycopy(objArr, 0, tmpArr, 0, objArr.length);
			// 3. �������� tmpArr�� ����Ű�� �迭�� objArr�� ����Ű��
			objArr = tmpArr;
		}
		
		// 2. ����
		
		objArr[size] = obj;
		size++;
		
	}

	
	// MyVector�� ���ڿ���?
	// ���? �迭�� ���ڿ���?
	// �迭�� ���� ������
	@Override
	public String toString() {
		String tmp = "[";
		
		for(int i=0; i<size; i++) {
			tmp+= objArr[i]+",";
		}
		
		tmp += "]";
		
		return tmp;
	}
	
	
	
	public Object get(int index) {
		for(int i=0; i<objArr.length; i++){
			if(objArr[i] == objArr[index]) {
				obj = objArr[i]; 
			}
		}
		return obj;
	}
	
	
	// objArr���� obj�� ã�´�.
	int indexOf(Object obj) {
		for(int i=0; i<objArr.length; i++) {
//			if(obj == null && objArr[i] == null) {
//				return i;
//			}
//			if(objArr[i] != null && objArr[i].equals(obj)){
//				return i;
//			}
			if(obj == objArr[i] || Objects.equals(objArr[i], obj))
				return i;
		}
		
		return -1;
	}
	
	
	// objArr���� obj�� �����ϰ� ������ obj�� ��ȯ
	boolean remove(Object obj) {
		// 1. ���� �� �ָ� ã�´�.
		int idx = indexOf(obj);
		// 1-1 ������ ����
		if(idx != -1) {
			// 1. ������ ������ ������ �����͸� �� ĭ�� ������ �̵�
			System.arraycopy(objArr, idx+1, objArr, idx, size-(idx+1));
			// 2. ������ ������objArr[size]�� null��
			objArr[size] = null;
			// 3. size--
			size--;
		}
		
		// 1-2 ������ return false;
		return false;
	}
	
	

}
