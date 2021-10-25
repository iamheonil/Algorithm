package list;

import java.util.Arrays;

public class Programmers_XspaceN_Number {

    public static long[] solution(long x, int n) {
        // 결과를 출력할 long 변수
        long[] answer = new long[n];

        // long 타입이 int 타입보다 더 많은 수를 담을 수 있기 때문에
        // int 와 int 를 연산했을 때 반환되는 타입도 int기 때문에
        long multiple = x;
        int variable = 1;

        // n으로 넘어온 숫자만큼 반복문 실행
        for (int i = 0; i < n; i++) {

            // answer 배열에 x와 variable(1씩 증가)를 곱해 넣는다
            answer[i] = multiple * variable;

            // 다음 x만큼 증가시키기위해 증가
            variable++;

        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        long[] result = solution(2, 5);

        // 솔루션 값 출력
        System.out.print(Arrays.toString(result));
    }
}