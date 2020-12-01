package list;

public class Baekjoon1152 {
    public static void main(String[] args) {

        //String arr = "The Curious Case of Benjamin Button";
        // String arr = "Oh My God";
        String arr = "Ah Chiken Ah Chiken Ah Chiken Ah Chiken Ah Chiken Ah Chiken Ah Chiken ".trim();
        int space = 0;
        int result = 0;

        for(int i = 0; i < arr.length(); i++) {

            if(arr.charAt(i) == ' ') {
                space++;
            }
        }

        System.out.print(space + 1);

    }
}
// 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
// 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.