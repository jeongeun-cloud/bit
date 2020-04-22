package java_test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {
	
	int bingoCheck(int[][] arr) {
		int cnt = 0;

		// 2차원 배열 arr에서 빙고갯수를 센다.

		// 1. 가로 빙고 카운트
		// 2. 세로 빙고 카운트
		// 3. 대각선 빙고 카운트
		int crossCnt = 0;
		int crossCnt2 = 0;

		for(int i=0; i<5; i++) {
			int garoCnt = 0;
			int seroCnt = 0;
			// if(arr[i][i] ==1) crossCnt++;	// 사실 여기에 있는게 맞지만,
			
			for(int j=0; j<5; j++) {
				if(arr[i][j] == 1) garoCnt++;
				if(arr[j][i] == 1) seroCnt++;
				if(arr[i][i] == 1) crossCnt++;	// 코드상 더 깔끔해 보임.
				if(arr[i][5-j-1] == 1) crossCnt2++;
			}
			
			if(garoCnt == 5) cnt++;	// 가로 세로는 한줄 돌아갈때마다 해줘야 함 
			if(seroCnt == 5) cnt++;
		}
		if(crossCnt == 25) cnt++;	// 대각선은 다 돌아간 후에 cnt++해줘야 함
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
