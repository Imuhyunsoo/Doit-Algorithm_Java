package Chapter04.Practice;

// 연습문제 6 : 임의의 객체형 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스 Queue<E>를 작성하세요.
public class Queue<E> {

    private E[] que;      // 큐용 배열
    private int capacity;   // 큐의 용량
    private int front;      // 맨 앞의 요소 커서
    private int rear;       // 맨 뒤의 요소 커서
    private int num;        // 현재 데이터 개수

    // 실행 시 예외: 큐가 비어 있음
    public static class EmptyGenericQueueException extends RuntimeException {
        public EmptyGenericQueueException() { }
    }

    // 실행 시 예외: 큐가 가득 참
    public static class OverflowGenericQueueException extends RuntimeException {
        public OverflowGenericQueueException() { }
    }

    // 생성자
    public Queue(int maxLen) {

        num = front = rear = 0;
        capacity = maxLen;

        try {
            que = (E [])new Object[capacity];     // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 큐에 데이터를 인큐
    public E enque(E x) throws OverflowGenericQueueException {

        if (num >= capacity)
            throw new OverflowGenericQueueException();   // 큐가 가득 참

        que[rear++] = x;
        num++;

        if (rear == capacity)
            rear = 0;

        return x;
    }

    // 큐에서 데이터를 디큐
    public E deque() throws EmptyGenericQueueException {

        if (num <= 0)
            throw new EmptyGenericQueueException();   // 큐가 비어 있음

        E x = que[front++];
        num--;

        if (front == capacity)
            front = 0;

        return x;
    }

    public E peek() throws EmptyGenericQueueException {

        if (num <= 0)
            throw new EmptyGenericQueueException();   // 큐가 비어 있음

        return que[front];
    }

    // 큐를 비움
    public void clear() {

        num = front = rear = 0;
    }

    // 큐에서 x를 검색하여 인덱스(참지 못하면 -1)를 반환
    public int indexOf(E x) {

        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 싸하여 있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있나요?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼나요?
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {

        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }
}
