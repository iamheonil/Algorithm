package list;

import java.util.HashSet;

public class Baekjoon3052 {

    public static void main(String[] args) {

        // 배열 생성
        int[] existingArr = {39, 40, 41, 42, 43, 44, 82, 83, 84, 85};

        int[] printArr = new int[10];

        HashSet<Integer> counting = new HashSet<>();

        int count = 0;

        for(int i = 0; i < existingArr.length; i++) {
            printArr[i] = existingArr[i] % 42;

            // System.out.print(printArr[i] + " ");

            counting.add(printArr[i]);

        }

        // System.out.print(counting);
        System.out.print("다른 값은 ? " + counting.size());

    }

}



// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.


// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
// 39, 40, 41, 42, 43, 44, 82, 83, 84, 85를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다. 서로 다른 값은 모두 6개가 있다.

// --------------------------------------------------------------------------------
// HashSet 으로 중복값 제거를 하지 않으면 전부 카운팅이 되어버렸다.
// HashSet 을 배운적이 있지만 그때 잠깐 사용하고 말아서 아예 존재자체를 깜빡했다 ㅠㅠ
// 랭귀지 공부는 역시 꾸준히 해야..