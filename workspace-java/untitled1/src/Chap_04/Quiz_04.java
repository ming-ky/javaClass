package Chap_04;

//조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
// 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 항링
// 일반차량 5시간 주차시 20000원
// 경차 5시간 주차시 10000원
// 장애인 차량 10시간 주차시 15000원
public class Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; //주차시간
        boolean isSmallCar = false; //경차 여부
        boolean withDisabledPerson = false; //장애인 차량 여부

        int fee = hour * 4000; //시간당 주차요금

        // 30000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }
        //경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee = fee / 2; //50% 할인
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다." );




    }
}
