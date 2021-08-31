package list;

public class Programmers_Average {

    public static double solution(int[] s) {

        // 결과를 저장할 double 변수
        double answer = 0;

        // 문자열로 넘어온 s를 answer에 담아준다
        for (int i = 0; i < s.length; i++) {
            answer += s[i];
        }

        // answer에 담긴 값 리턴, 단 나누는 수는 s의 length만큼
        // ex) 10/s.length(n)
        return answer / s.length;

    }

    public static void main(String[] args) {

        // 파라미터
        double result = solution(new int[]{1, 2, 3, 4});

        // 솔루션 값 출력
        System.out.print(result);
    }
}