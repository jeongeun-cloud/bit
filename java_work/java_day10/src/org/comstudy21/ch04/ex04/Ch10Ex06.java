package org.comstudy21.ch04.ex04;

class Music {

	protected String singer;
	protected String song;
	

	public Music() {
		this("no-name", "no-song");
	}

	public Music(String singer, String song) {
		this.singer = singer;
		this.song = song;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public void play() {
		System.out.println(singer + "의 " + song + " 실행중입니다.");
	}
	

}


class MusicPlayer{
	// Music 배열을 만들어서 객체를 저장한다.
	Music[] mArr = new Music[7];
	int top = 0;
	
	public void add(Music music) {
		if(top >= mArr.length) {
			System.out.println("더 이상 입력 불가능 합니다!");
			return;
		}
		
		mArr[top++] = music;
		System.out.println("MusicPlayer에 music 추가 성공!");
		
	}
	
	public void play() {
		System.out.println("---------- PLAY ----------");
		while(top > 0) {
			mArr[--top].play();
		}
		System.out.println("더 이상 실행 할 곡이 없습니다!");
	}
		
}


public class Ch10Ex06 {

	
	public static void main(String[] args) {
		
		Music m1 = new Music("룰라","3!4!");
		Music m2 = new Music();
		m2.setSinger("투투");
		m2.setSong("1과2분의1");
		Music m3 = new Music("이선희","아~옛날이여");
		
//		m1.play(); // 룰라의 3!4! 실행중입니다.
//		m2.play(); // 투투의 1과2분의1 싱핼중입니다.
//		m3.play(); // 이선희의 아 옛날이여 실행중입니다.
		
		MusicPlayer mp = new MusicPlayer();
		// 최대 7곡 까지 추가 가능
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("조용필","바람의 노래"));
		mp.add(new Music("송가인","진도 아리랑"));
		mp.add(new Music("J.Fla","바람의 노래"));
		mp.add(new Music("임재범","비상"));
		mp.add(new Music("쿨","아로하"));
		
		mp.play();

	}

}
