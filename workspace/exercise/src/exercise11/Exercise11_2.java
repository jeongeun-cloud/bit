package exercise11;

import java.util.*;

// ���� �ڵ��� �������� �����ÿ�.

class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while (!stack.empty())
			System.out.println(stack.pop());
	}
}

// �� : 362227 -> 222367 -> pop() : 7632 ��