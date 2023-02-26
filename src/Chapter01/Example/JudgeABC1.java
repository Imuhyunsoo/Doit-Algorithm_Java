package Chapter01.Example;

import java.util.Scanner;

// 실습 1-4
public class JudgeABC1 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
