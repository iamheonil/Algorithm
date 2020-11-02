package list;

import java.util.Scanner;

public class Baekjoon8393 {
    public static void main(String[] args) {

        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        int result = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(result += i);
        }
    }
}

// 처음에는 i 와 n 두개의 int 변수로 해결하려고 했으나 하지 못했다.
// 분석해보긔