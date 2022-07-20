package list;

public class Programmers_Collatz {

    public static int solution(int num) {

        /*
        1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면,
        모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

        1-1. 입력된 수가 짝수라면 2로 나눕니다.
        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
        위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요.
        단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
        */

        // 몇 번이나 반복되는지 저장할 변수 answer
        int answer = 0;
        long number = num;

        // 실행문
        do {
            // 반복문이 실행되면 동시에 answer++
            answer++;

            // 조건문
            if (number % 2 == 0) {
                // 파라미터로 받은 num이 짝수라면 num을 2로 나눈다
                // /= 은 대입연산자 (변수 num을 2로 나눈 후 다시 변수 num에 대입)
                number /= 2;
            } else {
                // 홀수라면 num에 3을 곱해주고 1을 더해준다
                number = number * 3 + 1;
            }

            // 위의 작업을 반복하되, 아래와 같이 answer이 500회 이상 반복 된다면
            // -1을 리턴해준다.

            if (answer == 500) {
                return -1;
            }
            // answer이 500을 넘지 않아 자연스럽게 루프문에서 빠지게 된다면 결과를 출력해준다.

            if (num == 1) {
                return 0;
            }
            // 13번 테스트 케이스는 주어지는 값이 '1'이기 때문에 0을 바로 리턴해준다.

        } while (number != 1);

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        int result = solution(1);

        // 솔루션 값 출력
        System.out.print(result);
    }
}