package kr.co.himedia.member02;

public class Monitor {

	//멤버변수
	String color;   //모니터 색상
	int channel;    //채널
	int volume;     //볼륨
	boolean power;  //전원
	
	
	//멤버메서드
	//Monitor를 켜거나 끄는 기능 (power())

	public void power() {
		this.power = !power;
		if(power) {
		    System.out.println("모니터가 켜졌습니다.");
		} else {
			 System.out.println("모니터가 꺼졌습니다.");
		}
		
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : "+this.channel);
	}
	public void channelDown() {
		this.channel--;
		System.out.println("현재 채널 : "+this.channel);
	}
	
}

