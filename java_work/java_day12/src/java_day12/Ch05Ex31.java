package java_day12;

interface ±è¾¾Áý¾È {
	void ±è¾¾Áý¾ÈÁ¦»ç();
}

interface ¹Ú¾¾Áý¾È {
	void ¹Ú¾¾Áý¾ÈÁ¦»ç();
}

abstract class È«¾¾Áý¾È {
	abstract void È«¾¾Áý¾ÈÁ¦»ç();
}

class È«±æµ¿ extends È«¾¾Áý¾È implements ±è¾¾Áý¾È, ¹Ú¾¾Áý¾È{
	public void È«¾¾Áý¾ÈÁ¦»ç() {
		System.out.println("È«¾¾Áý¾È Á¦»ç Âü¿©");
	}
	public void ±è¾¾Áý¾ÈÁ¦»ç() {
		System.out.println("±è¾¾Áý¾È Á¦»ç Âü¿©");
	}
	public void ¹Ú¾¾Áý¾ÈÁ¦»ç() {
		System.out.println("¹Ú¾¾Áý¾È Á¦»ç Âü¿©");
	}
	
}

public class Ch05Ex31 {
	public static void main(String[] args) {
		È«±æµ¿ hong = new È«±æµ¿();
		if (hong instanceof È«¾¾Áý¾È) {
			hong.È«¾¾Áý¾ÈÁ¦»ç();
		}
		if (hong instanceof ±è¾¾Áý¾È) {
			hong.±è¾¾Áý¾ÈÁ¦»ç();
		}
		if (hong instanceof ¹Ú¾¾Áý¾È) {
			hong.¹Ú¾¾Áý¾ÈÁ¦»ç();
		}
		
		
		È«¾¾Áý¾È hongHouse = new È«±æµ¿();
		if (hongHouse instanceof È«¾¾Áý¾È) {
			hongHouse.È«¾¾Áý¾ÈÁ¦»ç();
		}
		if (hongHouse instanceof ±è¾¾Áý¾È) {
			((±è¾¾Áý¾È)hongHouse).±è¾¾Áý¾ÈÁ¦»ç(); // Ä³½ºÆÃ
		}
		if (hongHouse instanceof ¹Ú¾¾Áý¾È) {
			((¹Ú¾¾Áý¾È)hongHouse).¹Ú¾¾Áý¾ÈÁ¦»ç(); // Ä³½ºÆÃ
		}	
		
	}
}
