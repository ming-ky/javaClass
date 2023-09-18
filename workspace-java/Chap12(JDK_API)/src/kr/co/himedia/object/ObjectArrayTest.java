package kr.co.himedia.object;

public class ObjectArrayTest { //Array Type으로의 다형성
	
	public static void main(String[] args) {
		//다형성 배열로 Object[] 배열 사용하기
		
		Object[] obj = new Object[2];
		
		// A, B 클래스를 배열에 저장 
		obj[0] = new A();   //upCasting
		obj[1] = new B();   //upCasting
		himedia(obj); // 호출
	}
	
	public static void himedia(Object[] obj) {
		for(int i=0; i<obj.length; i++) { //i는 0이고 obj 배열의 갯수만큼 반복함.
			if (obj[i] instanceof A) // obj[i]가 A의 객체라면
				((A)obj[i]).printGo(); // A클래스의 printGo를 호출
			else 
				((B)obj[i]).printGo(); // B클래스의 printGO를 호출
		}
	}

}
