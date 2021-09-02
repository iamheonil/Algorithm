package list;

import java.util.Arrays;

public class Programmers_MinimumNumber {

    public static int[] solution(int[] arr) {

        // 배열의 크기가 0, 1 이면 -1 리턴
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 비교할 숫자(최소값) 선언
        int compNum = arr[0];

        // 최소값을 구하는 반복문
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < compNum) {
                compNum = arr[i];
            }
        }

        // 리턴할 answer 배열 선언
        int[] answer = new int[arr.length - 1];

        // answer의 idx 값을 따로 만들어줬다.
        int idx = 0;

        // answer에 arr 값을 넣어주고
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compNum) {
                answer[idx] = arr[i];

                // 만약 조건을 만족하여 들어갔다면 인덱스를 ++
                idx++;
            }
        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int[] result = solution(new int[]{4, 1, 2, 3});

        // 솔루션 값 출력
        System.out.print(Arrays.toString(result));
    }
}