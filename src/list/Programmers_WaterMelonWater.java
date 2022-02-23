package list;

public class Programmers_WaterMelonWater {

    public static String solution(int n) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            // 문자열이 비어있거나, 끝자리가 박일경우 수를 넣어주고
            if (answer.isEmpty() || "박".equals(answer.substring(answer.length() - 1))) {
                answer += "수";
            } else {
                // 아닐경우는 모두 박
                answer += "박";
            }
        }

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution(32);

        // 결과 출력
        System.out.print(s);
    }
}