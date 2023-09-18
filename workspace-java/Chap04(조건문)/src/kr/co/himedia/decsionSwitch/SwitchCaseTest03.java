package kr.co.himedia.decsionSwitch;

import java.util.Scanner;

public class SwitchCaseTest03 {

	public static void main(String[] args) {
		/* Quiz. switch ~ case 문 사용하여 요일에 해당하는 운동을 출력하시오.
		 * 예시)요일에 해당하는 운동을 입력하세요 (Sunday, Monday, WednseDay, Tuesday, Friday) :
		 *                                 야구하기, 농구하기, 수영하기, 자전거타기, 축구하기
		 *                                       없는 요일 입력 시 휴식이라고 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("요일을 입력하세요.");
		
		String day = scan.next();

		
		switch(day) {
		case "Sunday":
			System.out.println("야구하기");
			break;
		case "Monday" :
			System.out.println("농구하기");
			break;
		case "WedneseDay":
			System.out.println("수영하기");
			break;
		case "Tuesday":
			System.out.println("자전거타기");
			break;
		case "Friday":
			System.out.println("축구하기");
			break;
		default:
			System.out.println("휴식하기");
			
		}
		scan.close();
	}

}
