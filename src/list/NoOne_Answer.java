package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NoOne_Answer {

	static Scanner sc = new Scanner(System.in);

	// 숫자가 들어있는 메소드
	public static String function(int[] numArr) {
		String answer = "";

		// int 배열을 String 배열로 변환
		String[] arr = new String[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			arr[i] = (String.valueOf(numArr[i]));
		}

		// 배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});

		// 0000 처럼 0으로만 구성되어있으면 0 return
		if (arr[0].equals("0"))
			return "0";

		// 그 외의 경우 순차적으로 연결하여 answer return
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;

	}

	public static void main(String[] args) {
		System.out.print("배열의 크기를 입력해주세요 0 ~ x : ");
		int arrayLength = sc.nextInt();
		
		// 숫자 배열
		int[] numArr = new int[arrayLength];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(i + "번째 배열에 들어갈 숫자를 입력해주세요 : ");
			numArr[i] = sc.nextInt();


		}
		
		System.out.println("배열에서 나올 수 있는 최대 값 : " + function(numArr));
	}

}
