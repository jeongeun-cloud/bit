// [문제1] 다음의 예제를 완성하시오.
// getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
// getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.

public class WordScrambleEx1 {
	 public static void main(String[] args) {
         String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

         String answer = getAnswer(strArr);
         String question = getScrambledWord(answer);

         System.out.println("Question:"+question);
         System.out.println("Answer:"+answer);
   } // main

   public static String getAnswer(String[] strArr) { 
	   int idx = (int) (Math.random()*strArr.length);
	   return strArr[idx];
   }
  
   public static String getScrambledWord(String str) { 
	   char[] charArr = str.toCharArray();
	   
	   for(int i=0; i<str.length(); i++) {
		   int idx = (int) (Math.random() * str.length());
		   
		   char tmp = charArr[i];
		   charArr[i] = charArr[idx];
		   charArr[idx] = tmp;
	   }
	   
	   return new String(charArr);

   } // scramble(String str)
}
