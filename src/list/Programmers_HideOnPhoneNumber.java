package list;

public class Programmers_HideOnPhoneNumber {

    public static String solution(String s) {

        String answer = "";

        // 맨 뒤 4자리의 수를 제외한 나머지 문자를 * 로 바꿔주기 위해
        // 반복문을 돌리면서 비어있는 answer 변수에 * 를 넣어준다.
        for (int i = 0; i < (s.length() - 4); i++) {

            answer += "*";

        }

        // 반복문이 종료되면 맨 마지막 문자를 붙여준다
        answer += s.substring(s.length() - 4);

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution("01033334444");

        // 결과 출력
        System.out.print(s);
    }
}