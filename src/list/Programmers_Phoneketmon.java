package list;

import java.util.ArrayList;
import java.util.HashSet;

public class Programmers_Phoneketmon {

    public static int solution(int[] nums) {
        // 결과를 반환할 answer 선언
        int answer = 0;

        // 최대값을 구하기 위한 max값 변수 선언
        int max = nums.length / 2;

        HashSet<Integer> phoneketmonHashSet = new HashSet<Integer>();

        for(int num : nums) {
            phoneketmonHashSet.add(num);
        }

        if(phoneketmonHashSet.size() > max) {
            return max;
        } else {
            answer = phoneketmonHashSet.size();
        }

        return answer;
    }

    public static void main(String[] args) {

        // 파라미터
        // int result = solution(new int[]{3, 1, 2, 3});
        int result = solution(new int[]{3, 3, 3, 2, 2, 4});

        // 솔루션 값 출력
        System.out.print(result);
    }
}