package list;

public class Programmers_MonthlyCodeChallenge {

    public static int solution(int[] numbers) {

        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        int numberArr = solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});

        // 결과 출력
        System.out.print(numberArr);
    }
}