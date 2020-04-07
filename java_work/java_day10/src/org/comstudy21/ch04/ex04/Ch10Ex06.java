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
		System.out.println(singer + "�� " + song + " �������Դϴ�.");
	}
	

}


class MusicPlayer{
	// Music �迭�� ���� ��ü�� �����Ѵ�.
	Music[] mArr = new Music[7];
	int top = 0;
	
	public void add(Music music) {
		if(top >= mArr.length) {
			System.out.println("�� �̻� �Է� �Ұ��� �մϴ�!");
			return;
		}
		
		mArr[top++] = music;
		System.out.println("MusicPlayer�� music �߰� ����!");
		
	}
	
	public void play() {
		System.out.println("---------- PLAY ----------");
		while(top > 0) {
			mArr[--top].play();
		}
		System.out.println("�� �̻� ���� �� ���� �����ϴ�!");
	}
		
}


public class Ch10Ex06 {

	
	public static void main(String[] args) {
		
		Music m1 = new Music("���","3!4!");
		Music m2 = new Music();
		m2.setSinger("����");
		m2.setSong("1��2����1");
		Music m3 = new Music("�̼���","��~�����̿�");
		
//		m1.play(); // ����� 3!4! �������Դϴ�.
//		m2.play(); // ������ 1��2����1 �������Դϴ�.
//		m3.play(); // �̼����� �� �����̿� �������Դϴ�.
		
		MusicPlayer mp = new MusicPlayer();
		// �ִ� 7�� ���� �߰� ����
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("������","�ٶ��� �뷡"));
		mp.add(new Music("�۰���","���� �Ƹ���"));
		mp.add(new Music("J.Fla","�ٶ��� �뷡"));
		mp.add(new Music("�����","���"));
		mp.add(new Music("��","�Ʒ���"));
		
		mp.play();

	}

}
