package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_AscNumber {

    public static long solution(long n) {
        // 결과를 출력할 long 변수
        long answer = 0;

        // 내림차순 작업을 할 String 배열
        String[] parArr = ("" + n).split("");

        // 배열 정렬 (오름차순)
        Arrays.sort(parArr);

        // 오름차순 정렬 완료 된 배열을 거꾸로
        Collections.reverse(Arrays.asList(parArr));

        // long 형 변수에 String.join 함수를 사용하여 혹여나 들어가 있을지도 모르는 공백 및 ',' 제거
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