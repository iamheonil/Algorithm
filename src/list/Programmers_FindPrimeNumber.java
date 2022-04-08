package list;

public class Programmers_FindPrimeNumber {

    public static int solution(int n) {

        int answer = 0;
        boolean flag;

        for (int i = 2; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                answer++;
            }

        }

        // 결과 출력
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        int result = solution(10);

        // 솔루션 값 출력
        System.out.print(result);
    }
}