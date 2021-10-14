package list;

public class Programmers_YaksuSum {

    public static int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        // 값 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        int s = solution(12);

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}