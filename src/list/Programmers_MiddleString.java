package list;

public class Programmers_MiddleString {

    public static String solution(String s) {

        // 모든 코드가 종료되고 값을 넣어줄 변수
        String returnStr = "";

        // 파라미터로 넘어온 s의 length는?
        int strLength = s.length();

        // length가 2로 나눴을 때 0이 남는다면 > 짝수
        if (strLength % 2 == 0) {
            // 짝수라서 2로 나눈 뒤 해당 문자열의 가운데 부분 -1
            // 가운데부분 +1 하게되면 가운데 문자 2개가 출력
            returnStr = s.substring(strLength / 2 - 1, s.length() / 2 + 1);
        } else {
            // 아니라면? > 홀수
            // 해당 문자열의 가운데 부분과 +1
            returnStr = s.substring(strLength / 2, strLength / 2 + 1);
        }

        // 값 리턴
        return returnStr;
    }

    public static void main(String[] args) {

        // 파라미터
        // String s = solution("qwer");
        String s = solution("qwertyuiop");

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}