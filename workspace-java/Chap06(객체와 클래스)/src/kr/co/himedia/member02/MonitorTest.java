package kr.co.himedia.member02;

public class MonitorTest {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor(); //객체생성
		
		monitor.power(); //객체호출
		monitor.power();

		monitor.channel = 20;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
	}

}
