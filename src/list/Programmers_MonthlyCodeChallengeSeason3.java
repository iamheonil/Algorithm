package list;

public class Programmers_MonthlyCodeChallengeSeason3 {

    public static int solution(int n) {

        int i;

        // 매개변수로 받은 n과 i(1씩 증가)를 나누기 위해 반복문을 작성
        for (i = 1; i < n; i++) {

            // n과 i를 나눴을 때, 나머지가 1이라면 i를 반환한다.
            if (n % i == 1) {
                return i;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        // 파라미터
        int result = solution(12);

        // 솔루션 실행 결과 출력
        System.out.print(result);
    }
}