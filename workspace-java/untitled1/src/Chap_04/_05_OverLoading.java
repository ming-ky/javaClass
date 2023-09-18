package Chap_04;

public class _05_OverLoading {
    public static int getPower(int num){
        int result = num * num;
        return  result;
        //return num * num 으로 한줄처리도 가능
    }

    public static int getPower(String strNum){
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static  int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩 (이름이 같은 메소드를 여러 개 만드는 거)
        //전달값의 타입이 다르거나
        //전달값의 갯수가 다를경우
        System.out.println(getPower(3)); // 3* 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); //27


    }
}
