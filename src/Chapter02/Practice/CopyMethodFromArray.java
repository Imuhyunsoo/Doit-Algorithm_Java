package Chapter02.Practice;

import java.util.Arrays;

// 연습문제 4 : 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy 를 작성하세요.
public class CopyMethodFromArray {

    static void copy(int[] a, int[] b) {

        // System.arraycopy(a, 0, b, 0, a.length);
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
    }

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 3, 9, 6, 7};
        int[] b = new int[a.length];

        copy(a, b);

        System.out.println(Arrays.toString(b));
    }
}
