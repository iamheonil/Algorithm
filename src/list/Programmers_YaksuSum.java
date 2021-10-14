package list;

public class Programmers_YaksuSum {

    public static int solution(int n) {

        int answer = 0;

        // 반복문 > 1부터 n까지
        for (int i = 1; i <= n; i++) {
            // n과 i을 나눴을 때 결과가 0이라면?!
            if (n % i == 0) {
                // 약수라고 판단, answer에 담아준다!
                answer += i;
            }
        }

        // 값 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        int s = solution(5);

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}