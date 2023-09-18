package Chap_04;

public class _07_VariableScope {

    public static void methodA(){
        //System.out.println(num);
        //System.out.println(result);
    }

    public static void methodB(){
        int result = 1; //지역변수 이 영역내에서만 사용할 수 있음
    }

    public static void main(String[] args) {
        int num = 3; //지역변수
        //System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
       // System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(num);
        }
        //System.out.println(j);
    }
}
