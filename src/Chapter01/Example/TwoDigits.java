package Chapter01.Example;

import java.util.Scanner;

// 실습 1C-2
public class TwoDigits {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요");

        do {
            System.out.print("no값: ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수 no 값은 " + no + "이 되었습니다.");
    }
}
