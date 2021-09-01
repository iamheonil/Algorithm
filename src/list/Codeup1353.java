package list;

import java.util.Scanner;

public class Codeup1353 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("n의 값을 입력해주세요 : ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
