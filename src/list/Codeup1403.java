package list;

import java.util.Scanner;

public class Codeup1403 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자의 개수를 입력해주세요 : ");
        int kNum = sc.nextInt();

        int intArr[] = new int[kNum];

        for (int i = 0; i < intArr.length; i++) {

            intArr[i] = sc.nextInt();

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < intArr.length; j++) {
                System.out.println(intArr[j]);
            }
        }
    }
}
