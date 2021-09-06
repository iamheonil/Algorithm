package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_AscNumber {

    public static long solution(long n) {

        long answer = 0;

        String[] parArr = ("" + n).split("");

        Arrays.sort(parArr);
        Collections.reverse(Arrays.asList(parArr));

        answer = Long.parseLong(String.join("", parArr));

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        long result = solution(118372);

        // 솔루션 값 출력
        System.out.print(result);
    }
}