package Chap_04;

public class _02_Parameter {
    public static void power(int num){ //num = parameter ,매개변수 , 전달값
        //전달값이 있는 메소드
        int result = num * num;
        System.out.println(num + " 의 2 승은 " + result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i <exponent; i++){
            result *= num;
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        //전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        //메소드 호출
        // Argument, 인수 인수가 2가 되는 거
        power(2); // 2 * 2
        power(3); // 3 * 3

        powerByExp(2 , 3); // 2 * 2 * 2 = 8
        powerByExp(3 , 3); // 3 * 3 * 3 = 27
        powerByExp(10 , 0); // 1
    }
}
