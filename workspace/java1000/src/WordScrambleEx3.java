import java.util.*;

// [문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.

class WordScrambleEx3 {
      public static void main(String[] args) {
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            // 코드를 넣어 완성하세요.
            // hint : while문을 중첩해서(2개의 while문) 작성하세요.
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
	              	  System.out.println("정답입니다.");
	              	  answer = getAnswer(strArr);
	                  question = getScrambledWord(answer);
	              	  break;
	              	  
	                } else {
	              	  System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해보세요.");
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
