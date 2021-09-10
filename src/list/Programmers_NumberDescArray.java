package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_NumberDescArray {

    public static int[] solution(long n) {

        String parseLong = Long.toString(n);

        String[] longArr = parseLong.split("");

        Collections.reverse(Arrays.asList(longArr));

        // 결과를 출력할 int 배열
        int[] answer = new int[longArr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(longArr[i]);
        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int[] result = solution(12345);

        // 솔루션 값 출력
        System.out.print(Arrays.toString(result));
    }
}