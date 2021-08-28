package list;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_SameNumberHate {

    public static int[] solution(int[] s) {

        // 값을 넣어줄 배열 하나 생성
        ArrayList<Integer> resultArr = new ArrayList<Integer>();

        // 반복문이 실행되면서 배열의 값을 비교할 변수 생성
        int compNum = 10;

        // 반복문
        // s의 크기만큼 제일 반복문을 실행
        for (int i = 0; i < s.length; i++) {
            if (s[i] != compNum) {
                resultArr.add(s[i]);
                compNum = s[i];
            }
        }
        // 반복문을 실행하며 연속되는 숫자는 제거하고 넘어가야한다.
        // s[i]가 1이라고 가정해보면, 최초의 compNum은 10이니까 1이 배열에 들어갈 수 있는 조건이 충족되어 배열에 1이 입력되고 compNum이 1이 된다.
        // 그 후 비교되는 s[i]가 1이라고 가정하면 이미 compNum은 1이니까 조건문에서는 false처리가 되어 배열에 들어가지 않는다.
        // 이런식으로 s배열의 끝까지 돌리면서 compNum과 일치하지 않으면 모두 배열에 add하고 결과 리턴

        // ArrayList의 toString을 사용하게되면 String으로 반환하여 문제 통과가 불가능하다.
        // 따라서 int로 형변환을 해서 반환해줘야한다!
        int[] answer = new int[resultArr.size()];

        for (int i = 0; i < resultArr.size(); i++) {
            answer[i] = resultArr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        // 파라미터 숫자가 들어간 배열 생성
        int[] s = solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        // 리턴 값 씨스아웃
        System.out.print(Arrays.toString(s));

    }
}