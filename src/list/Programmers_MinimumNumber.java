package list;

import java.util.Arrays;

public class Programmers_MinimumNumber {

    public static int[] solution(int[] arr) {

        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int compNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < compNum) {
                compNum = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compNum) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int[] result = solution(new int[]{4, 1, 2, 3});

        // 솔루션 값 출력
        System.out.print(Arrays.toString(result));
    }
}