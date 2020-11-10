package list;

import java.util.Scanner;

public class Baekjoon2741 {
    public static void main(String[] args) {

        // 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        System.out.print("N까지의 수를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}

// 이 정도는 이지..ㅠ.ㅠ