package java_day07;

public class Ch03Ex28 {
	static int[][] arr = new int[5][5];
	static int num = 1;
	
	// 프린트 출력 함수
	public static void printArr() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]==0?" \t":arr[i][j] + "\t");	
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//	1	2	3	4	5
		//	16	17	18	19	6
		//	15	24	25	20	7
		//	14	23	22	21	8
		//	13	12	11	10	9
		

		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arr[i][j] = num++;
				
			}
			
		}
		printArr();
	}

	
	
	
	public static void test08(String[] args) {
		//	1	2	3	4	5
		//	6	7	8	9
		//	10	11	12
		//	13	14	15	16
		//	17	18	19	20	21		
		
		int cnt = 0;
		for(int i=0; i<5; i++){	
			for(int j=0; j<5+cnt; j++){
				arr[i][j] = num++;	
				
			}
			cnt = i<2? cnt-1: cnt+1;
		}
		printArr();
	}


	public static void test07(String[] args) {
		//	1				13
		//	2	6		10	14
		//	3	7	9	11	15
		//	4	8		12	16
		//	5				17	
		
		
		int cnt = 0;
		int var = 0;
		
		for(int i=0; i<5; i++){	
			for(int j=var; j<5+cnt; j++){
				arr[j][i] = num++;	

			}
			cnt = i<2? cnt-1: cnt+1;
			var = i>=2? var-1: var+1;
		}
		
		printArr();
	}
	

	
	public static void test06(String[] args) {
		//	1	2	3	4	5		
		//		6	7	8
		//			9	
		//		10	11	12		
		//	13	14	15	16	17
		
		int cnt = 0;
		int var = 0;
		
		for(int i=0; i<5; i++){	
			for(int j=var; j<5+cnt; j++){
				arr[i][j] = num++;	

			}
			cnt = i<2? cnt-1: cnt+1;
			var = i>=2? var-1: var+1;
		}
		printArr();
		
	}
	
	
	
	public static void test05(String[] args) {
		//					1		
		//				2	3	
		//			4	5	6	
		//		7	8	9	10	
		//	11	12	13	14	15	
		
		for(int i=0; i<5; i++){
			for(int j=4-i; j<5; j++){
				
				arr[i][j] = num++;
				
			}
		}
		
		printArr();
	}
	

	
	public static void test04(String[] args) {
		//	1		
		//	2	3	
		//	4	5	6	
		//	7	8	9	10	
		//	11	12	13	14	15	
		
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				
				arr[i][j] = num++;
			}
		}
		
		printArr();
	}
	
	
	
	public static void test03(String[] args) {
		//	1	10	11	20	21	
		//	2	9	12	19	22
		//	3	8	13	18	23
		//	4	7	14	17	24
		//	5	6	15	16	25		
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arr[i%2==0?j:4-j][i] = num++;
			}
			
		}
		
		printArr();
	}
	
	
	
	
	public static void test02(String[] args) {
		//	1	2	3	4	5	
		//	10	9	8	7	6
		//	11	12	13	14	15
		//	20	19	18	17	16
		//	21	22	23	24	25
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arr[i][i%2==0?j:4-j] = num++;
			}
		}
		
		// 방법 2.
		
//		for(int i=0; i<5; i++) {
//			if(i%2 == 0){
//				for(int j=0; j<5; j++) {
//					arr[i][j] = num++;
//				}
//			} else {
//				for(int j=4; j>=0; j--) {
//					arr[i][j] = num++;
//				}
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");	
			
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void test01(String[] args) {
		
		//	1	2	3	4	5	
		//	6	7	8	9	10
		//	11	12	13	14	15
		//	16	17	18	19	20
		//	21	22	23	24	25
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//열 우선 증가
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				arr[i][j] = num++;	// arr[j][i] = num++; 은 행 우선 증가
			}
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
	}
}
