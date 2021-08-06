package list;

import java.util.Scanner;

public class Codeup1402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 숫자의 갯수를 입력해주세요 : ");
        int x = sc.nextInt();

        int[] n = new int[x];

        for (int i = 0; i < n.length; i++) {
            System.out.print(i + 1 + "번째 숫자를 입력해주세요 : ");
            n[i] = sc.nextInt();
        }

        for (int i = n.length; i >= 1; i--) {
            System.out.print(n[i - 1] + " ");
        }

    }
}
