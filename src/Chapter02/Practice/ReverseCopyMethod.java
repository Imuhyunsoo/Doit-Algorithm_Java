package Chapter02.Practice;

import java.util.Arrays;

// 연습문제 5 : 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy 를 작성하세요.
public class ReverseCopyMethod {

    static void rcopy(int[] a, int[] b) {

        // System.arraycopy(a, 0, b, 0, a.length);
        for (int i = 0; i < a.length; i++)
            b[i] = a[a.length - i - 1];
    }

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 3, 9, 6, 7};
        int[] b = new int[a.length];

        rcopy(a, b);

        System.out.println(Arrays.toString(b));
    }
}
