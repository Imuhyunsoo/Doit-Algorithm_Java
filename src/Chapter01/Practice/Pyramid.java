package Chapter01.Practice;

// 연습문제 15
public class Pyramid {

    static void spira(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat((i - 1) * 2 + 1));
        }
        // System.out.println("*".repeat((n - 1) * 2 + 1));
    }

    public static void main(String[] args) {

        // TEST CODE
        spira(4);
    }
}
