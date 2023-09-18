package Chap_04;

public class _04_ParameterAndReturn {
    public static int getPower(int num){
        int result = num * num;
        return  result;
        //return num * num 으로 한줄처리도 가능
    }

    public static  int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retVal = getPower(2); // 2 * 2
        System.out.println(retVal); // 4

        retVal = getPower(3); // 3 * 3
        System.out.println(retVal); // 9

        retVal = getPowerByExp(3, 3); // 3 의 3승
        System.out.println(retVal); // 27

        System.out.println(getPowerByExp(2,4)); // 2의 4승 16
    }
}
