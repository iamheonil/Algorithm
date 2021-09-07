package list;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_DivisionNumberArrays {

    public static int[] solution(int[] s, int divisor) {

        // answer에 값을 넣어 정답을 제출하기 전, 중간 다리 역할을 해줄 ArrayList
        ArrayList<Integer> bridge = new ArrayList<Integer>();

        // 우선 파라미터로 넘어온 s 배열을 divisor 변수를 사용해서 나눠본다
        for (int i = 0; i < s.length; i++) {
            // 나눴을 때 나머지가 0이라면 - 나눠지는 수
            // 그렇다면 bridge 배열에 s[i] 숫자를 넣어준다. (add)
            if (s[i] % divisor == 0) {
                bridge.add(s[i]);
            }
        }

        // 반복문이 종료되고 bridge가 비어있다면? -1을 반환한다.
        if(bridge.isEmpty()) {
            bridge.add(-1);
        }

        // bridge의 배열 크기 = answer의 배열 크기
        int answer[] = new int[bridge.size()];

        // bridge의 크기만큼 반복문을 실행하며, bridge의 값을 answer에 담아준다.
        for (int i = 0; i < bridge.size(); i++) {
            answer[i] = bridge.get(i);
        }

        // 문제에서는 오름차순으로 정렬하라고 했으니 Arrays.sort 사용
        Arrays.sort(answer);

        // answer에 담긴 값 리턴
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        // int[] result = solution(new int[]{5, 9, 7, 10}, 5);
        int[] result = solution(new int[]{2, 36, 1, 3}, 1);

        // 솔루션 값 출력
        System.out.print(Arrays.toString(result));
    }
}