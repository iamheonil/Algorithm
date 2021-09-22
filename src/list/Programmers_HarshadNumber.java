package list;

public class Programmers_HarshadNumber {

    public static boolean solution(int n) {
        // 결과를 반환할 answer 선언
        boolean answer = true;

        // 하샤드 수인지 확인할 파라미터 변수
        int harshadNum = 0;

        // 파라미터로 넘어온 n값을 배열로 생성해주기 위한 사전 작업(?)
        String param = Integer.toString(n);

        // 파라미터로 넘어온 n값을 더해주기 위해 배열을 생성해준다
        String[] parseArr = param.split("");

        // 반복문 실행
        for (int i = 0; i < parseArr.length; i++) {
            // 하샤드수에 파라미터를 더해준다
            harshadNum += Integer.parseInt(parseArr[i]);
        }

        // 파라미터(n)와 파라미터를 나눈수가 나누어 떨어진다면 하샤드 수
        if (n % harshadNum != 0) {
            answer = false;
        }

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        // boolean result = solution(10); // true
        boolean result = solution(11); // false

        // 솔루션 값 출력
        System.out.print(result);
    }
}