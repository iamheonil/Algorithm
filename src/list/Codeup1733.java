package list;

import java.util.Scanner;

public class Codeup1733 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("IOI 를 입력해주세요. 대/소문자를 구분합니다 : ");
        String input = sc.nextLine();

        if (("IOI").equals(input)) {
            System.out.print("IOI is the International Olympiad in Informatics.");
        } else {
            System.out.print("I don't care.");
        }


    }
}
