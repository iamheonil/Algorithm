package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_XspaceN_Number {

    public static long[] solution(int x, int n) {
        // 결과를 출력할 long 변수
        long[] answer = new long[n];

        int multiple = x;
        int variable = 1;

        for (int i = 0; i < n; i++) {

            answer[i] = multiple * variable;

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