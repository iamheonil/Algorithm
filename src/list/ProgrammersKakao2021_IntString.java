package list;

public class ProgrammersKakao2021_IntString {

    public static int solution(String s) {

        String[] numInt = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            s = s.replace(numStr[i], numInt[i]);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        int s = solution("one4seveneight");

        System.out.print(s);

    }
}