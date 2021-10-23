package list;

import java.util.Arrays;

public class Programmers_ParticipantAndCompletion {

    public static String solution(String[] participant, String[] completion) {

        // 배열의 인덱스를 제어하기 위한 변수 하나 선언
        int i;

        // 참가자와 완주자를 비교하기 위해 두 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 정렬된 배열들의 값을 확인하는 반복문
        for (i = 0; i < completion.length; i++) {

            // 만약 정렬된 두개의 배열끼리 서로 값이 안 맞는다면 그 즉시 값을 리턴하고
            if (!completion[i].equals(participant[i])) {

                return participant[i];

            }

        }

        // 반복문이 종료됐는데 반환된 값이 없다면, 맨 마지막에 남는값이 완주하지 못한 자이기 때문에
        // 마지막 배열 값 리턴턴
       return participant[i];
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}