package list;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_NumberPlus {

    public static long solution(int a, int b) {
        // 결과를 출력할 long 변수
        long answer = 0;

        int compNum = 0;
        int lowNum = 0;

        if(a < b) {
            compNum = b;
            lowNum = a;
        } else {
            compNum = a;
            lowNum = b;
        }

        for (int i = compNum; lowNum <= compNum; i++) {
            answer += lowNum;
            lowNum++;
        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        long result = solution(3, 3);

        // 솔루션 값 출력
        System.out.print(result);
    }
}