// [����1] ������ ������ �ϼ��Ͻÿ�.
// getAnswer(String[] strArr)�� �迭strArr�� ������� �ϳ��� ���Ƿ� ��� ��ȯ�Ѵ�.(Math.random()���)
// getScrambledWord(String str)�� �־��� ���ڿ� str�� �� ������ ������ �ڼ��� ����, ���ο� ���ڿ��� ��ȯ�Ѵ�.

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
