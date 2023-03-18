package Chapter05.Practice;

// 연습문제 3 : 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
public class GCDArray {

    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return (x);
    }

    static int gcdArray(int a[], int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }

    public static void main(String[] args) {

        // TEST CODE
        int[] array = {22, 33, 55};
        System.out.println(gcdArray(array,0,array.length));
    }
}
