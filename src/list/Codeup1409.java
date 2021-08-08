package list;

import java.util.Scanner;

public class Codeup1409 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[11];

        System.out.print("10개의 숫자를 입력해주세요 : ");
        for (int i = 1; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }

        System.out.print("알고싶은 k번째 숫자를 입력하세요 : ");
        int kNum = sc.nextInt();

        System.out.print("k번째 숫자는 ? : " + intArr[kNum]);

    }
}
