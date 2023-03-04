package Chapter02.Practice;

import java.util.Arrays;
import java.util.Scanner;

// 연습문제 2 : 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
public class ReverseArray {

    // 배열 소오 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            System.out.println(Arrays.toString(a));
            swap(a, i, a.length - i - 1);
            System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]을 교환합니다.");

        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {

        int[] x = {2, 5, 1, 3, 9, 6, 7};

        reverse(x);   // 배열 x의 요소를 역순으로 정렬
    }
}
