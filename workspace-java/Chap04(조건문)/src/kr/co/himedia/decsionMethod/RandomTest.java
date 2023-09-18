package kr.co.himedia.decsionMethod;

public class RandomTest {

	public static void main(String[] args) {
		//Method.random
		System.out.println(Math.random()); //출력하면 0.0~0.9 사이의 수가 랜덤으로 나옴 (난수)
		System.out.println();
		
		//주사위
		System.out.println("주사위");
		int num = (int)(Math.random()*6); // 0~5가 됨 
		System.out.println(num);
		
		System.out.println();
		
		//1~6사이로 만들려면
		System.out.println("주사위 번호 1~6범위로 맞추기");
		num = (int)(Math.random()*6)+1; //1~6까지 범위의 수를 발생시키는 식
		System.out.println(num);
		
		System.out.println();
		
		//로또 : 1~45까지의 숫자 중 6개를 맞혀야하는 조건
		System.out.println("로또");
		int num2 = (int)(Math.random()*45)+1;
		System.out.println(num2);
		
		System.out.println();
		
		System.out.println("if문으로 주사위 나온 숫자 말하기");
		if(num==1)
			System.out.println("1이 나왔네요!");
		else if(num==2)
			System.out.println("2가 나왔네요!");
		else if(num==3)
			System.out.println("3이 나왔네요!");
		else if(num==4)
			System.out.println("4가 나왔네요!");
		else if(num==5)
			System.out.println("5이 나왔네요!");
		else System.out.println("6이 나왔네요!");
		
		System.out.println();
		
		System.out.println("switch문으로 주사위 나온 숫자 말하기");
		switch(num) {
		case 1: System.out.println("1이 나왔네요!");
		        break;
		case 2: System.out.println("2가 나왔네요!");
        break;
		case 3: System.out.println("3이 나왔네요!");
        break;
		case 4: System.out.println("4가 나왔네요!");
        break;
		case 5: System.out.println("5가 나왔네요!");
        break;
		case 6: System.out.println("6이 나왔네요!");
        break;
		}

	}

}
