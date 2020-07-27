package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NoOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력해주세요 0 ~ x : ");
		int arrayLength = sc.nextInt();

		// =================================

		int[] array = new int[arrayLength];
		String res = "";
		int result = 0;

		// =================================

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "번째 배열에 들어갈 숫자를 입력해주세요 : ");
			array[i] = sc.nextInt();

			res += array[i];

			result = Integer.parseInt(res);

		}

//		//배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
//        Arrays.sort(array, new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return (s2+s1).compareTo(s1+s2);
//            }
//        });
//        
//        //0000 처럼 0으로만 구성되어있으면 0 return
//        if (array[0].equals("0")) return "0";
//        
//        //그 외의 경우 순차적으로 연결하여 answer return
//        for (int i = 0; i < array.length; i++) {
//            result += array[i];
//        }
//        
//        return result;
//
//	}
//
//	 System.out.println(result);

	}
}