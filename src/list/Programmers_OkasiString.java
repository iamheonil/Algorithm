package list;

public class Programmers_OkasiString {

    public static String solution(String s) {

        // s 문자열을 받아, split 함수로 알맞게 크뜨크뜨
        String[] arr = s.split("");

        // 인덱스 변수 선언
        int idx = 0;

        // 모든 반복문이 종료되고 값을 넣어줄 변수
        String returnArr = "";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                // 배열의 짤린 값이 공백이라면 그대로 스킵
                idx = 0;
            } else if (idx % 2 == 0) {
                // 짤린 값이 짝수라면 해당 배열에 들어가 있는 값은 대문자
                arr[i] = arr[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                // 짤린 값이 짝수가 아니라면 배열에 들어가 있는 값은 소문자
                arr[i] = arr[i].toLowerCase();
                idx++;
            }
            // 뭐가 됐든 돌고돌아 나온값은 returnArr에 차곡차곡
            returnArr += arr[i];
        }

        // 값 리턴
        return returnArr;
    }

    public static void main(String[] args) {

        // 파라미터
        String s = solution("hello my name is heonil");

        // 리턴 값 씨스아웃
        System.out.print(s);

    }
}