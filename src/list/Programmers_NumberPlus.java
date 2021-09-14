package list;

public class Programmers_NumberPlus {

    public static long solution(int a, int b) {
        // 결과를 출력할 long 변수
        long answer = 0;

        // max값과 min값을 담아놓을 CompNum, lowNum 생성
        int compNum = 0;
        int lowNum = 0;

        // 파라미터로 넘어온 a가 b보다 작다면?
        if(a < b) {
            compNum = b;
            lowNum = a;
        } else {
            // a가 b보다 크다면?
            compNum = a;
            lowNum = b;
        }

        // 위에서 정리된 compNum과 lowNum 체크해서 반복문 실행
        for (int i = compNum; lowNum <= compNum; i++) {
            answer += lowNum;
            lowNum++;
        }

        // 결과 출력
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        long result = solution(3, 3);

        // 솔루션 값 출력
        System.out.print(result);
    }
}