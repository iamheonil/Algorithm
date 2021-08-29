package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_ReverseString {

    public static String solution(String s) {

        // 결과를 리턴할 String 변수
        String answer = "";

        // 문자열을 배열로
        String[] strArr = s.split("");

        // strArr 정렬
        Arrays.sort(strArr);

        // 정렬한 배열을 거꾸로 정렬
        Collections.reverse(Arrays.asList(strArr));

        // 거꾸로 정렬된 strArr 배열을 반복문을 사용하여 String 변수에 넣어준다
        for(int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution("Zbcdefg");

        // 결과 출력
        System.out.print(s);
    }
}