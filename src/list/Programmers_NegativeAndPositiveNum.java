package list;

public class Programmers_NegativeAndPositiveNum {

    public static int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        // 뭐지 이게 맞나 너무 쉬운데잉
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        // 결과 리턴
        return answer;
    }

    public static void main(String[] args) {

        int[] absolutes;
        boolean[] signs;

        absolutes = new int[]{4, 7, 12};
        signs = new boolean[]{true, false, true};

        // 파라미터
        int s = solution(absolutes, signs);

        // 결과 출력
        System.out.print(s);
    }
}