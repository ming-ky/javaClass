package kr.co.himedia.returnaddress;

public class Student {

	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	
	public Student(int id, String name) {
		studentId = id;  //파라미터 이름이 멤버변수 이름과 다를때는 this를 안써도 됨.
		studentName = name;
		korea = new Subject(); //Subject 객체 생성
		math = new Subject();
				
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScore() {
		int totalScore = korea.score + math.score;
		System.out.println(studentName+" 학생의 총점수는 "+ totalScore + "점 입니다.");
	}
}
