package list;

public class Programmers_StringBasic {

    public static boolean solution(String s) {

        // 문자열로 넘어온 s를 answer에 담아준다
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < '0' || ch > '9')
                    return false;
            }
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        // 파라미터
        boolean result = solution("1234");

        // 솔루션 값 출력
        System.out.print(result);
    }
}