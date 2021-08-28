package list;

public class Programmers_Jarisu {

    public static int solution(int s) {

        int sum = 0;

        while (s != 0) {
            sum += s % 10; // @2
            s /= 10; // @3
        }

        // 값 리턴
        return sum;
    }

    public static void main(String[] args) {

        // 파라미터
        int s = solution(987);

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}