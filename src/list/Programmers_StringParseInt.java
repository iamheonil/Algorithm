package list;

public class Programmers_StringParseInt {

    public static int solution(String s) {

        // 결과를 저장할 int 변수
        int answer = 0;

        // 문자열로 넘어온 s를 함수를 사용하여 answer에 담아준다
        answer = Integer.parseInt(s);

        // answer에 담긴 값 리턴
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int result = solution("1234");

        // 솔루션 값 출력
        System.out.print(result);
    }
}