package list;

import java.util.Scanner;

public class Baekjoon9498 {
    public static void main(String[] args) {

        // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int grade = sc.nextInt();
        
        if(grade <= 101) {
            if (grade > 89) {
                System.out.print("A 입니다.");
            } else if (grade > 79) {
                System.out.print("B 입니다.");
            } else if (grade > 69) {
                System.out.print("C 입니다.");
            } else if (grade > 59) {
                System.out.print("D 입니다.");
            } else {
                System.out.print("F 입니다.");
            }
        } else {
            System.out.print("올바른 점수를 입력해주세요");
        }
    }
}

// 이렇게 if문을 작성하는게 효율적인가?