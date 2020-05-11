import java.util.*;

// [����3] ����2�� ������ �����ؼ�, ������ ���ߴ��� ���α׷��� ������� �ʰ� ���������� �����ֵ��� �ϼ���.

class WordScrambleEx3 {
      public static void main(String[] args) {
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            // �ڵ带 �־� �ϼ��ϼ���.
            // hint : while���� ��ø�ؼ�(2���� while��) �ۼ��ϼ���.
            String answer = getAnswer(strArr);
            String question = getScrambledWord(answer);
            
            while(true) {
            	System.out.println("Question :" + question);
            	System.out.print("Your answer is :"); 
            	Scanner scan = new Scanner(System.in);
            	String input = scan.next();
            	
            	if(input.equals("q") || input.equals("Q")) {
	              	  System.exit(0);
	            }
            	
            	while(true) {
	                
	                if(input.toUpperCase().equals(answer)){
	              	  System.out.println("�����Դϴ�.");
	              	  answer = getAnswer(strArr);
	                  question = getScrambledWord(answer);
	              	  break;
	              	  
	                } else {
	              	  System.out.println(input+"��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
	              	  break;
	                }
            	}
          } 

      } // main

      public static String getAnswer(String[] strArr) {
            int idx = (int)(Math.random()*strArr.length);
            return strArr[idx];
      }
     
      public static String getScrambledWord(String str) {
            char[] chArr = str.toCharArray();

            for(int i=0;i < str.length();i++) {
            	
                  int idx = (int)(Math.random()*str.length());
                 
                  char tmp = chArr[i];
                  chArr[i] = chArr[idx];
                  chArr[idx] = tmp;
            }

            return new String(chArr);
      } // scramble(String str)
}
