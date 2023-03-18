package Chapter05.Practice;

import java.util.Scanner;

// 연습문제 5 : 실습 5-3과 실습 5-6을 각각 수정하여 메서드 호출 횟수를 카운트해 출력하도록 프로그램을 작성하세요.
public class RecurCount {

    static String[] memo;
    static int recurCount = 0;
    static int recurMemoCount = 0;

    static int recur(int n) {

        recurCount++;

        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
        return recurCount;
    }

    // 메모화를 도입한 recur 메서드
    static int recurMemo(int n) {

        recurMemoCount++;

        if (memo[n + 1] != null)
            System.out.print(memo[n + 1]);                        // 메모를 출력
        else {
            if (n > 0) {
                recurMemo(n - 1);
                System.out.println(n);
                recurMemo(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];   // 메모화
            }
            else {
                memo[n + 1] = "";   // 메모화: recur(0)과 recur(-1)은 빈 문자열
            }
        }
        return recurMemoCount;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();
        memo = new String[x + 2];

        System.out.println("recur() 메소드 : " + recur(x) + "번 출력");
        System.out.println("recurMemo() 메소드 : " + recurMemo(x) + "번 출력");
    }
}
