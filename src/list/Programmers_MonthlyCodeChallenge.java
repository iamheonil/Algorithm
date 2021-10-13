package list;

public class Programmers_MonthlyCodeChallenge {

    public static int solution(int[] numbers) {

        // 결과 - 1~9까지 모두 더한 값 (0부터 9까지의 숫자 중 일부가 들어있는 배열이 매개변수로 주어지기 때문에!)
        int answer = 45;

        // 매개변수로 주어진 numbers 배열의 값들을 answer(45)에서 모두 빼준다.
        // 값들을 모두 빼면 해당 배열에서 없는 수의 총합이 남아있기 때문에!
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        // 결과값 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터 / 매개변수
        int numberArr = solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});

        // 결과 출력
        System.out.print(numberArr);
    }
}