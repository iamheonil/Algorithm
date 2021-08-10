package list;

import java.util.Scanner;

public class Codeup1406 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("love 를 입력해주세요. 다른 문자가 입력되면 출력되지 않습니다. : ");
        String input = sc.nextLine();

        if (("love").equals(input)) {
            System.out.print("I love you.");
        } else {
            System.out.print("말 드릅게 안 들어 아주!");
        }


    }
}
