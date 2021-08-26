package list;

public class Programmers_EvenAndOdd {

    public static void solution(int s) {

        // 결과를 리턴할 String 변수
        String answer = "";

        // s를 2로 나눴을 때 나머지가 0일 경우
        if(s % 2 == 0) {
            // 짝수
            answer = "Even";
        } else if (s == 0) {
            // 나눈값과 상관없이 0일 경우 짝수
            answer = "Even";
        } else {
            // 나머지가 0이 아닐 경우 홀수
            answer = "Odd";
        }

        // 결과 리턴
        System.out.print(answer);

    }

    public static void main(String[] args) {

        // 파라미터

        // solution(2);   // Even
        solution(3);  // Odd

    }
}