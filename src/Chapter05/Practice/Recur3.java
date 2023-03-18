package Chapter05.Practice;

import Chapter04.Example.IntStack;

import java.util.Scanner;

// 연습문제 6 : 오른쪽의 recur3 메서드를 비재귀적으로 구현한 프로그램을 작성하세요.
public class Recur3 {

    static void recur3(int n) {

        IntStack s = new IntStack(n);

        while (true) {

            if (n > 0) {
                s.push(n);               // n값을 푸시
                n = n - 2;
                continue;
            }
            if (s.isEmpty() != true) {   // 스택이 비어 있지 않으면
                n = s.pop();             // 저장하고 있던 스택값을 팝
                System.out.println(n);
                n = n - 1;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        recur3(x);
    }
}
