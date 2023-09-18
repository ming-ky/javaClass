package kr.co.himedia.loop04;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1~100 사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오.(5와 7의 공배수)

		int count=0;
		int num = 0;
		
		while((num++)<100){
			if(((num%5)!=0)||((num%7)!=0))
				continue;
			
			count++;
			System.out.println(num);
		}
		System.out.println("count : "+ count);
			
	}

}
