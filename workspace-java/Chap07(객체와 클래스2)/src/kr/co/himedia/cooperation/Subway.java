package kr.co.himedia.cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승차하다 1명이 탈 때마다 돈이 올라감
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선 지하철에 승객은"+passengerCount+
				" 명이고, 수입은 "+money+"원 입니다.");
	}
}
