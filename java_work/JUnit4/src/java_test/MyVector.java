package java_test;

import java.util.Objects;

public class MyVector {
	Object[] objArr = {}; // 객체 배열	{}를 안쓰면 null로 되어서 nullPointException 발생
	Object obj;
	int capacity;
	int size = 0;
	
	public MyVector() {
		this(16);
	}

	public MyVector(int capacity) {
		// 매개 변수의 유효성 검사
		if(capacity <0) {
			throw new IllegalArgumentException("IllegalCapacit : " + capacity);
		}
		objArr = new Object[capacity];
	}

	// 배열 objArr의 길이(objArr.length)를 반환
	public int capacity() {
		return objArr.length;
	}

	public int size() {
		return size;
	}

	// objArr이 비었는지 알려준다.
	// 비었다는게 뭘 의미하지?
	public boolean isEmpty() {
//		if(size == 0) {
//			return true;
//		}
//		return false;
		return size == 0;
	}
	
	
	// 객체 배열(objArr)에 객체(obj)를 추가
	// objArr[index] 번지에 넘어온 obj를 저장한다.
	// size는 하나 늘어날 때마다 ++;
	void add(Object obj){
		// 1. 저장 공간 확인
		//	저장 공간이 없으면
		// 어떨 때 저장 공간이 없는거지?
		if(size >= capacity()) {
			// 저장공간을 늘려준다.
			// 1. 새로운 배열을 만든다. (기존의 2배)
			Object[] tmpArr = new Object[capacity()*2];
			// 2. 기존 내용 복사 (objArr -> tmpArr)
			System.arraycopy(objArr, 0, tmpArr, 0, objArr.length);
			// 3. 참조변경 tmpArr이 가리키는 배열을 objArr이 가리키게
			objArr = tmpArr;
		}
		
		// 2. 저장
		
		objArr[size] = obj;
		size++;
		
	}

	
	// MyVector를 문자열로?
	// 어떻게? 배열을 문자열로?
	// 배열은 변수 묶은거
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
	
	
	// objArr에서 obj를 찾는다.
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
	
	
	// objArr에서 obj를 삭제하고 삭제한 obj를 반환
	boolean remove(Object obj) {
		// 1. 삭제 할 애를 찾는다.
		int idx = indexOf(obj);
		// 1-1 있으면 삭제
		if(idx != -1) {
			// 1. 삭제할 데이터 이후의 데이터를 한 칸씩 앞으로 이동
			System.arraycopy(objArr, idx+1, objArr, idx, size-(idx+1));
			// 2. 마지막 데이터objArr[size]를 null로
			objArr[size] = null;
			// 3. size--
			size--;
		}
		
		// 1-2 없으면 return false;
		return false;
	}
	
	

}
