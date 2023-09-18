package kr.co.variable03;

public class VariableInference {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "Chunho";
		
		System.out.println(i);
		str = "8line";
		
		//한 번 추론된 변수는 다른 타입의 값을 할 수 없음.
		//Star = 3; //str는 문자로 추론이 되었기 때문에 정수로 값을 할 수 없음.
		//i = 11.0;  //i는 정수로 추론이 되었기때문에 실수로 값을 할 수 없음.
	}

}
