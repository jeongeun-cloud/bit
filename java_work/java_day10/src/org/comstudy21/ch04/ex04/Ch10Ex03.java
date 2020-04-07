package org.comstudy21.ch04.ex04;

class Speaker{
	private int volum = 5;
	
	public void showVolum() {
		System.out.println("스피커 볼륨 : " + volum);
	}
	
	public void soundUp() {
		System.out.println("스피커 볼륨을 올립니다!");
		volum++;
		showVolum();
	}
	
	public void soundDown() {
		System.out.println("스피커 볼륨을 내립니다!");
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
		System.out.println(company + " " + product + " TV 켜기");
	}
	
	public void volumUp() {
		speaker.soundUp();
	}

	public void volumDown() {
		speaker.soundDown();
	}
	
	public void channelUP() {
		channel++;
		System.out.println(channel +"번 방송 보기");
	}
	
	public void channelDown() {
		channel--;
		System.out.println(channel +"번 방송 보기");
	}
	
	public void turnOff(){
		System.out.println(company + " " + product + " TV 끄기");
	}
	
}


public class Ch10Ex03 {

	public static void main(String[] args) {
		Tv tv = new Tv("올레드","LG");
		tv.turnOn(); // LG 올레드 TV 켜기
		tv.volumUp(); // 현재 볼륨 레벨은 6입니다.
		tv.volumDown(); // 현재 볼륨 레벨은 5입니다.
		tv.channelUP(); // 11번 방송 보기
		tv.channelDown(); // 10번 방송 보기
		tv.turnOff(); // LG 올레드 TV 끄기

	}

}
