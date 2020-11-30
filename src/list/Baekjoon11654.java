package list;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11654 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하세요 : ");

        String abb = sc.nextLine();

        System.out.print(Arrays.toString(abb.getBytes()));

        // 단순히 abb.getBytes() 로는 출력할 수 없기 때문에
        // 값을 배열에 넣어 출력해준다



    }
}


// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.