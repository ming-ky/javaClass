package kr.co.himedia.object;

import java.lang.*; //생략된부분 default package

public class A extends Object {
	public A() { //생략된부분 default 생성자 
		super(); //생략된부분 최상위 클래스
	}

	public void display() {
		System.out.println("나는 A 입니다.");
	}
	public void printGo() {
		System.out.println("2023년 한여름에 와 있습니다.");
	}
}
