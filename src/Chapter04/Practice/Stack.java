package Chapter04.Practice;

import java.util.ArrayList;
import java.util.List;

// 연습문제 2 : 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Stack<E>를 작성하세요.
public class Stack<E> {

    private E [] stk;      // 스택용 배열
    private int capacity;   // 스택 용량
    private int ptr;        // 스택 포인터

    // 실행 시 예외: 스택이 비어 있음
    public static class EmptyGenericStackException extends RuntimeException {
        public EmptyGenericStackException() { }
    }

    // 실행 시 예외: 스택이 가득 참
    public static class OverflowGenericStackException extends RuntimeException {
        public OverflowGenericStackException() { }
    }

    // 생성자
    public Stack(int maxLen) {

        ptr = 0;
        capacity = maxLen;
        try {
            stk = (E[])new Object[capacity];     // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public E push(E x) throws OverflowGenericStackException {

        if (ptr >= capacity)
            throw new OverflowGenericStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public E pop() throws EmptyGenericStackException {

        if (ptr <= 0)
            throw new OverflowGenericStackException();
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public E peek() throws EmptyGenericStackException {

        if (ptr <= 0)
            throw new OverflowGenericStackException();
        return stk[ptr - 1];
    }

    // 스택을 비움
    public void clear() {

        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(E x) {

        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
                return i;   // 검색 성공
        return -1;          // 검색 실패
    }

    // 스택의 용량을 반환
    public int getCapacity() {

        return capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {

        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {

        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {

        return ptr >= capacity;
    }

    // 스택 안에 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {

        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}
