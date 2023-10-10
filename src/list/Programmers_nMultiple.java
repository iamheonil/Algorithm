package list;

public class Programmers_nMultiple {

    public static int solution(int num, int n) {
    	if (num % n == 0) {
    		return 1;
    	} else {
    		return 0;
    	}
    }

    public static void main(String[] args) {

        // 파라미터
        int result = solution(34, 3);

        // 솔루션 값 출력
        System.out.print(result);

    }
}