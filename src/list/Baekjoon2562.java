package list;

import java.util.Scanner;

public class Baekjoon2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sortArr = {1, 105, 10, 15, 20, 100, 55, 88, 99};

        int maxValue = sortArr[0];
        int rank = 1;

        for(int i = 0; i < sortArr.length; i++) {

            if(maxValue < sortArr[i]) {
                maxValue = sortArr[i];
                rank++;
            }

        }
        System.out.print("최대값은 : " + maxValue + "\n순번은 : " + rank);


    }
}

// 2562번 문제
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
// 예를 들어, 서로 다른 9개의 자연수
//
// 3, 29, 38, 12, 57, 74, 40, 85, 61
//
// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.