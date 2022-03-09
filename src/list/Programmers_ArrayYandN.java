package list;

public class Programmers_ArrayYandN {

    public static boolean solution(String s) {

        // 결과를 저장할 double 변수 생성
        boolean answer = true;

        // pCnt, yCnt 값 저장을 위한 변수 생성
        int pCount = 0;
        int yCount = 0;

        // 파라미터로 넘겨받은 문자열 s를 배열로 변환
        String[] argsArr = s.split("");

        // 문자열의 i번째 값이 y 혹은 Y, p 혹은 P일 경우에 해당하는 카운트를 더해준다.
        for (int i = 0; i < argsArr.length; i++) {
            if("Y".equals(argsArr[i]) || "y".equals(argsArr[i])) {
                yCount++;
            } else if("P".equals(argsArr[i]) || "p".equals(argsArr[i])) {
                pCount++;
            }
        }

        // 두 문자 카운트의 수가 일치할 경우 true를 반환하고 그렇지 않을 경우 false를 반환한다.
        if(pCount == yCount) {
            answer = true;
        } else {
            answer = false;
        }

        // answer에 담긴 값 리턴
        return answer;

    }

    public static void main(String[] args) {

        // 파라미터
        boolean result = solution("pPoooyY");

        // 솔루션 값 출력
        System.out.print(result);

    }
}