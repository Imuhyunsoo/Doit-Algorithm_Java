package Chapter01.Practice;

// 연습문제 16
public class NumberPyramid {

    static void npira(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + String.valueOf(i).repeat((i - 1) * 2 + 1));
        }
    }

    public static void main(String[] args) {

        // TEST CODE
        npira(4);
    }
}
