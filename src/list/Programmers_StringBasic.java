package list;

public class Programmers_StringBasic {

    public static boolean solution(String s) {

        // String s의 길이가 4 혹은 6인지 확인한다.
        if (s.length() == 4 || s.length() == 6) {

            // 4 혹은 6이라면, 반복문을 돌려 넘어온 문자열에 숫자 0~9 이외의 값이 있다면
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < '0' || ch > '9')
                    // false 출력
                    return false;
            }
            // 숫자만 들어가 있다면 true 출력
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