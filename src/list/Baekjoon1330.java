package list;

import java.util.Scanner;

public class Baekjoon1330 {
    public static void main(String[] args) {

        // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력해주세요 : ");
        int n1 = sc.nextInt();

        sc.nextLine();

        System.out.print("두번째 수를 입력해주세요 : ");
        int n2 = sc.nextInt();

        if(n1 < n2) {
            System.out.print("<");
        } else if(n1 > n2) {
            System.out.print(">");
        } else {
            System.out.print("==");
        }

    }
}

// 쉬운.. 난이도