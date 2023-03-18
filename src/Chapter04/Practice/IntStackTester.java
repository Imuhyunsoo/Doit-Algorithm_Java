package Chapter04.Practice;

import Chapter04.Example.IntStack;

import java.util.Scanner;

// 연습문제 1 : 실습 4-2에서 사용하는 메서드는 size, getCapacity, push, pop, peek, dump 뿐입니다.
//            클래스 intStack 의 모든 메서드를 사용하는 프로그램을 작성하세요.
public class IntStackTester {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);   // 최대 64개를 푸시할 수 있는 스택

        while (true) {

            System.out.println();                // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 초기화 (6) 용량체크 (7) 찾기 (0) 종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:   // 푸시
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:   // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:   // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:   // 덤프
                    s.dump();
                    break;

                case 5:   // 초기화
                    s.clear();
                    break;

                case 6:   // 용량 체크
                    if (s.isEmpty())
                        System.out.println("스택이 비어있습니다.");
                    else if (s.isFull())
                        System.out.println("스택이 가득찼습니다.");
                    else
                        System.out.println("아직 추가할 수 있습니다.");

                    break;

                case 7:
                    System.out.print("찾을 데이터: ");
                    x = stdIn.nextInt();
                    if(s.indexOf(x) == -1)
                        System.out.println("그 값의 요소가 없습니다.");
                    else
                        System.out.println("그 값은 x[" + s.indexOf(x) + "]에 있습니다.");
            }
        }
    }
}
