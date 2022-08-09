package list;

import java.util.Scanner;

public class Baekjoon1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("수를 입력하세요");
        // int a = sc.nextInt();
        double a = sc.nextInt();

        sc.nextLine();

        System.out.print("다음 수를 입력하세요 \n");
        // int b = sc.nextInt();
        double b = sc.nextInt();

        // System.out.print(a / (double) b);

        System.out.print(a / b);

    }
}

// 때에 따라서 형변환을 해줘야할 때도 있다는 것을 인지해야한다.
// 상황에 따라서 유연하게.
