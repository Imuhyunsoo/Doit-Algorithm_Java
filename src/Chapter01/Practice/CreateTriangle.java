package Chapter01.Practice;

// 연습문제 14
public class CreateTriangle {

    // 왼쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleLB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변삼각형을 출력
    static void triangleLU(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--)
                System.out.print('*');
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변삼각형을 출력
    static void triangleRU(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(i - 1));
            for (int j = 5; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleRB(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // TEST CODE
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
    }
}
