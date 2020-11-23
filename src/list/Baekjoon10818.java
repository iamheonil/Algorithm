package list;

import java.util.Scanner;

public class Baekjoon10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] newArr;

        System.out.print("몇 개의 정수를 입력하시겠습니까? : ");
        int n = sc.nextInt();

        newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {

            System.out.print(i + "번째 정수를 입력하세요옹 : ");
            newArr[i] = sc.nextInt();

        }

        int min = newArr[0];
        int max = newArr[0];

        for (int i = 0; i < newArr.length; i++) {
            // System.out.print(newArr[i]);

            if (max < newArr[i]) {
                max = newArr[i];
            }

            if (min > newArr[i]) {
                min = newArr[i];
            }

        }

        System.out.print("최소값은 : " + min + "\n최대값은 : " + max);

    }
}


// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
// 10818번 문제