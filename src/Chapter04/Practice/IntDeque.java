package Chapter04.Practice;

// 실습 4-3 : int 형 고정 길이 큐
public class IntDeque {

    private int[] que;      // 큐용 배열
    private int capacity;   // 큐의 용량
    private int front;      // 맨 앞의 요소 커서
    private int rear;       // 맨 뒤의 요소 커서
    private int num;        // 현재 데이터 개수

    // 실행 시 예외: 큐가 비어 있음
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() { }
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() { }
    }

    // 생성자
    public IntDeque(int maxLen) {

        num = front = rear = 0;
        capacity = maxLen;

        try {
            que = new int[capacity];     // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 덱의 맨앞에 데이터를 인큐
    public int enqueFront(int x) throws IntDeque.OverflowIntDequeException {
        if (num >= capacity)
            throw new IntDeque.OverflowIntDequeException();   // 덱이 가득 참
        num++;
        if (--front < 0)
            front = capacity - 1;
        que[front] = x;
        return x;
    }

    // 덱의 맨끝에 데이터를 인큐
    public int enqueRear(int x) throws IntDeque.OverflowIntDequeException {
        if (num >= capacity)
            throw new IntDeque.OverflowIntDequeException();   // 덱이 가득 참
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear = 0;
        return x;
    }

    // 덱의 맨앞 데이터를 디큐
    public int dequeFront() throws IntDeque.EmptyIntDequeException {
        if (num <= 0)
            throw new IntDeque.EmptyIntDequeException();   // 덱이 비었음
        int x = que[front++];
        num--;
        if (front == capacity)
            front = 0;
        return x;
    }

    // 덱의 맨뒤 데이터를 디큐
    public int dequeRear() throws IntDeque.EmptyIntDequeException {
        if (num <= 0)
            throw new IntDeque.EmptyIntDequeException();   // 덱이 비었음
        num--;
        if (--rear < 0)
            rear = capacity - 1;
        return que[rear];
    }

    public int peekFront() throws IntDeque.EmptyIntDequeException {
        if (num <= 0)
            throw new IntDeque.EmptyIntDequeException();   // 덱이 비어있음

        return que[front];
    }

    public int peekRear() throws IntDeque.EmptyIntDequeException {

        if (num <= 0)
            throw new IntDeque.EmptyIntDequeException();   // 덱이 비어있음

        return que[rear == 0 ? capacity - 1 : rear - 1];
    }

    // 큐를 비움
    public void clear() {

        num = front = rear = 0;
    }

    // 큐에서 x를 검색하여 인덱스(참지 못하면 -1)를 반환
    public int indexOf(int x) {

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
