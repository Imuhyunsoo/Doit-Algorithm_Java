package Chapter05.Practice;

import java.util.Scanner;

// 연습문제 7 : 실습 5=7을 숫자가 아닌 문자열로 기둥 이름을 출력하도록 수정한 프로그램을 작성하세요.
//            예를 들어 'A 기둥' 'B 기둥' 'C 기둥'과 같이 출력하면 됩니다.
public class HanoiString {

    static final String[] COLUMN  = {"A", "B", "C"};

    // no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.printf("원반[%d]을(를) %s 기둥에서 %s 기둥으로 옮김\n", no, COLUMN[x - 1], COLUMN[y - 1]);

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = stdIn.nextInt();

        move(n, 1, 3);
    }
}
