package Chapter04.Practice;

// 실습 4-1[A] : int 형 고정 길이 스택
public class IntArrayQueue {

    private int[] que;      // 큐용 배열
    private int capacity;   // 큐 용량
    private int num;        // 현제 데이터 개수

    // 실행 시 예외: 스택이 비어 있음
    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() { }
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() { }
    }

    // 생성자
    public IntArrayQueue(int maxLen) {

        num = 0;
        capacity = maxLen;
        try {
            que = new int[capacity];     // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 큐에 x를 인큐
    public int enQueue(int x) throws OverflowIntArrayQueueException {

        if (num >= capacity)
            throw new OverflowIntArrayQueueException();
        return que[num++] = x;
    }

    // 큐에서 데이터를 디큐(프런트 처음에 있는 데이터를 꺼냄)
    public int deQueue() throws EmptyIntArrayQueueException {

        if (num <= 0)
            throw new OverflowIntArrayQueueException();

        int x = que[0];

        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];

        num--;

        return x;
    }

    // 큐에서 데이터를 피크(프런트에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntArrayQueueException {

        if (num <= 0)
            throw new OverflowIntArrayQueueException();
        return que[num - 1];
    }

    // 큐을 비움
    public void clear() {

        num = 0;
    }

    // 큐에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) {

        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i;   // 검색 성공
        return -1;          // 검색 실패
    }

    // 큐의 용량을 반환
    public int getCapacity() {

        return capacity;
    }

    // 큐에 쌓여 있는 데이터 개수를 반환
    public int size() {

        return num;
    }

    // 큐가 비어 있는가?
    public boolean isEmpty() {

        return num <= 0;
    }

    // 큐가 가득 찼는가?
    public boolean isFull() {

        return num >= capacity;
    }

    // 큐 안에 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {

        if (num <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
