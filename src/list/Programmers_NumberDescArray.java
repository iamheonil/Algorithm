package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_NumberDescArray {

    public static int[] solution(long n) {

        // 파라미터로 넘어온 long형 변수 n을 String형으로 파싱한다.
        String parseLong = Long.toString(n);

        // 파싱이 완료된 parseLong은 longArr이라는 String 배열에 넣어준다.
        String[] longArr = parseLong.split("");

        // 작업이 끝난 longArr 함수는 Collections의 reverse 함수를 사용하여 뒤집는다.
        Collections.reverse(Arrays.asList(longArr));

        // 결과를 출력할 int 배열 생성
        int[] answer = new int[longArr.length];

        // answer 배열에 longArr 배열의 값을 담아준다.
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(longArr[i]);
        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int[] result = solution(12345);

        // 씨스아웃 (ㅋㄷㅋㄷ)
        System.out.print(Arrays.toString(result));
    }
}