package list;

import java.util.Locale;

public class Programmers_particularCharacterToUpper {

    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {

        // 파라미터
        String result = solution("programmers", "p");

        // 솔루션 값 출력
        System.out.print(result);

    }
}