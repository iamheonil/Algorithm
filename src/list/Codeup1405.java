package list;

import java.util.Scanner;

public class Codeup1405 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇개의 숫자를 입력하실거에요? : ");
        int arrParam = sc.nextInt();
        int[] intArr = new int[arrParam];

        System.out.print("숫자를 입력해주세요 : ");

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int i = 0; i < intArr.length; i++) {
            int k = i;
            for (int j = 0; j < arrParam; j++) {
                if (k == arrParam) {
                    k = 0;
                }
                System.out.print(intArr[k] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
