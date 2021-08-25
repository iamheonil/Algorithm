package list;

public class Programmers_WhereIsKim {

    public static String solution(String[] seoul) {

        // 김서방의 위치를 나타낼 변수
        int count = 0;

        // 반복문
        for(int i = 0; i < seoul.length; i++) {
            // Kim과 seoul의 i번째 단어가 일치하면 count에 현재 i값을 넣어준다.
            if("Kim".equals(seoul[i])) {
                count = i;
            }
        }

        // 값 리턴, 지정된 형식에 맞게 김서방은 X에 있다
        return "김서방은 " + count + "에 있다";
    }

    public static void main(String[] args) {

        // 파라미터 성이 들어가 있는 String형 배열 생성
        String s = solution(new String[]{"Jane", "Kim", "Park", "Choi", "Lee"});

        // 리턴 값 씨스아웃
        System.out.print(s);

    }

}
