package java_test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {
	
	int bingoCheck(int[][] arr) {
		int cnt = 0;

		// 2���� �迭 arr���� �������� ����.

		// 1. ���� ���� ī��Ʈ
		// 2. ���� ���� ī��Ʈ
		// 3. �밢�� ���� ī��Ʈ
		int crossCnt = 0;
		int crossCnt2 = 0;

		for(int i=0; i<5; i++) {
			int garoCnt = 0;
			int seroCnt = 0;
			// if(arr[i][i] ==1) crossCnt++;	// ��� ���⿡ �ִ°� ������,
			
			for(int j=0; j<5; j++) {
				if(arr[i][j] == 1) garoCnt++;
				if(arr[j][i] == 1) seroCnt++;
				if(arr[i][i] == 1) crossCnt++;	// �ڵ�� �� ����� ����.
				if(arr[i][5-j-1] == 1) crossCnt2++;
			}
			
			if(garoCnt == 5) cnt++;	// ���� ���δ� ���� ���ư������� ����� �� 
			if(seroCnt == 5) cnt++;
		}
		if(crossCnt == 25) cnt++;	// �밢���� �� ���ư� �Ŀ� cnt++����� ��
		if(crossCnt2 == 25) cnt++;
		
//		System.out.println(crossCnt);
		System.out.println(cnt);
		return cnt;
	}
	
	
	@Test
	public void test() {
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
		};
		assertTrue(bingoCheck(arr)==12);
	}
	
	@Test
	public void test2() {
		int[][] arr = {
				{1,1,1,1,1},
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0},
		};
		
		assertTrue(bingoCheck(arr)==1);
	}

	@Test
	public void test3() {
		int[][] arr = {
				{1,1,1,1,1},
				{1,0,0,0,0},
				{1,0,0,0,0},
				{1,0,0,0,0},
				{1,0,0,0,0},
		};
		
		assertTrue(bingoCheck(arr)==2);
	}
	
	@Test
	public void test4() {
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,0,0,0},
				{1,0,1,0,0},
				{1,0,0,1,0},
				{1,0,0,0,1},
		};
		
		assertTrue(bingoCheck(arr)==3);
	}

}
