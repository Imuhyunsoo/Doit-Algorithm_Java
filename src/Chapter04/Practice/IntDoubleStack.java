package Chapter04.Practice;

// 연습문제 3 : 하나의 배열을 공유하여 2개의 스택을 구현하는 int 형 데이터용 스택 클래스를 만드세요.
//            스택에 저장하는 데이터는 int 형 값으로 아래 그림처럼 배열의 처음과 끝을 모두 사용하세요.
public class IntDoubleStack {

    private int[] stk;      // 스택용 배열
    private int capacity;   // 스택 용량
    private int ptrA;		// 스택 포인터 A
    private int ptrB;		// 스택 포인터 B

    // 실행 시 예외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    // 생성자
    public IntDoubleStack(int maxLen) {

        ptrA = 0;
        ptrB = capacity - 1;

        capacity = maxLen;
        try {
            stk = new int[capacity];     // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(char sw, int x) throws OverflowIntStackException {

        if (ptrA >= ptrB + 1)
            throw new OverflowIntStackException();
        switch (sw) {
            case 'A':
                stk[ptrA++] = x;
                break;
            case 'B':
                stk[ptrB--] = x;
                break;
        }
        return x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop(char sw) throws EmptyIntStackException {

        int x = 0;

        switch (sw) {
            case 'A':
                if (ptrA <= 0)				// 스택 A가 비어 있음
                    throw new IntDoubleStack.EmptyIntStackException();
                x = stk[--ptrA];
                break;
            case 'B':
                if (ptrB >= capacity - 1)   // 스택 B가 비어 있음
                    throw new IntDoubleStack.EmptyIntStackException();
                x = stk[++ptrB];
                break;
        }
        return x;
    }

}
