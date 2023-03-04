package Chapter02.Practice;

import java.util.Arrays;

// 연습문제 3 : 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class SumOfMethodFromArray {

    static int sumOf(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 3, 9, 6, 7};

        System.out.println(sumOf(a));
    }
}
