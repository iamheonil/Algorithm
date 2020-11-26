package list;

public class Baekjoon8958 {

    public static void main(String[] args) {

        // String[] ansArr = {"O", "O", "X", "X", "O", "X", "X", "O", "O", "O"};
        String[] ansArr = {"O", "O", "O", "O", "X", "O", "O", "O", "O", "X", "O", "O", "O", "O", "X"};

        int plus = 1;
        int finalCnt = 0;

        for(int i = 0; i < ansArr.length; i++) {
            if(ansArr[i].equals("O")) {
                finalCnt += plus;
                plus++;
            } else {
                plus = 1;
            }
        }

        System.out.print("최종 점수는 ! " + finalCnt);

    }

}



// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
// "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

// 1차원 배열 단계에서 6단계라고 해서 엄청 어려울 거 같았는데,
// 어제, 엊그저께 풀었던 문제들이 더 어려웠던 거 같다.
// 간단하게 반복문을 돌려가며 "O" 와 일치한다면 'plus' 값을 더하고 1 증가시키고, "X"라면 점수를 1로 초기화한다.
// 이 과정을 반복!