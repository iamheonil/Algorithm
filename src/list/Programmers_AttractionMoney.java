package list;

public class Programmers_AttractionMoney {

    public static long solution(int price, int money, int count) {

        long answer = -1;

        // result를 long으로 선언하는것이 중요
        long result = 0;

        // price * i만큼 더한 값을 result에 더해주는 작업
        for (int i = 1; i <= count; i++) {

            result += price * i;

        }

        // 가지고 있는 돈과 놀이기구를 타는데 필요한 돈 계산
        answer = result - money;

        // 금액이 부족하지 않다면 0을 리턴할 수 있게 작업
        if (answer < 0) {
            answer = 0;
        }

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        long s = solution(3, 20, 4);

        // 결과 출력
        System.out.print(s);
    }
}