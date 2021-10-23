package list;

import java.util.Arrays;

public class Programmers_ParticipantAndCompletion {

    public static String solution(String[] participant, String[] completion) {

        int i;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < completion.length; i++) {

            if (!completion[i].equals(participant[i])) {

                return participant[i];

            }

        }

        return participant[i];
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}