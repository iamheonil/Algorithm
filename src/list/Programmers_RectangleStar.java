package list;

import java.util.Scanner;

public class Programmers_RectangleStar {

    public static void solution(int a, int b) {

        Scanner sc = new Scanner(System.in);

        // 별을 찍기 위한 int 변수
        //a = sc.nextInt();
        //b = sc.nextInt();

        // 반복문!
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 파라미터
        solution(3, 5);

        // 솔루션 값 출력
        // System.out.print(result);
    }
}