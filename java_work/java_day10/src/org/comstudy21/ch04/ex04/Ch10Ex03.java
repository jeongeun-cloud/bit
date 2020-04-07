package org.comstudy21.ch04.ex04;

class Speaker{
	private int volum = 5;
	
	public void showVolum() {
		System.out.println("����Ŀ ���� : " + volum);
	}
	
	public void soundUp() {
		System.out.println("����Ŀ ������ �ø��ϴ�!");
		volum++;
		showVolum();
	}
	
	public void soundDown() {
		System.out.println("����Ŀ ������ �����ϴ�!");
		volum--;
		showVolum();
	}
}

class Tv {
	private String product;
	private String company;
	//private int volum = 5;
	private Speaker speaker;
	private int channel = 10;
	
	public Tv() {
		this("no-product","no-company");
	}
	
	public Tv(String product, String company) {
		this.product = product;
		this.company = company;
		speaker = new Speaker();
	}
	
	
	public void turnOn(){
		System.out.println(company + " " + product + " TV �ѱ�");
	}
	
	public void volumUp() {
		speaker.soundUp();
	}

	public void volumDown() {
		speaker.soundDown();
	}
	
	public void channelUP() {
		channel++;
		System.out.println(channel +"�� ��� ����");
	}
	
	public void channelDown() {
		channel--;
		System.out.println(channel +"�� ��� ����");
	}
	
	public void turnOff(){
		System.out.println(company + " " + product + " TV ����");
	}
	
}


public class Ch10Ex03 {

	public static void main(String[] args) {
		Tv tv = new Tv("�÷���","LG");
		tv.turnOn(); // LG �÷��� TV �ѱ�
		tv.volumUp(); // ���� ���� ������ 6�Դϴ�.
		tv.volumDown(); // ���� ���� ������ 5�Դϴ�.
		tv.channelUP(); // 11�� ��� ����
		tv.channelDown(); // 10�� ��� ����
		tv.turnOff(); // LG �÷��� TV ����

	}

}
