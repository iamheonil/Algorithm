package list;

public class Programmers_HarshadNumber {

    public static boolean solution(int n) {
        boolean answer = true;

        int harshadNum = 0;

        String param = Integer.toString(n);

        String[] parseArr = param.split("");

        for (int i = 0; i < parseArr.length; i++) {

            harshadNum += Integer.parseInt(parseArr[i]);

        }

        if (n % harshadNum != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        boolean result = solution(11);

        // 솔루션 값 출력
        System.out.print(result);
    }
}