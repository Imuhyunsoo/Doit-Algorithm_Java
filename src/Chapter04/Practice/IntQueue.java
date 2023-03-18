package Chapter04.Practice;

// 연습문제 5 : 클래스 IntQueue 에 임의의 데이터를 검색하는 메서드 search 를 추가하세요.
// int search(int x)
//            메서드 indexOf 처럼 찾는 위치의 배열 인덱스를 반환하는 것이 아니라 큐 안에서 논리적으로
//            몇 번째에 있는가를 양수(큐의 프런트에 있으면 1로 함)로 반환합니다. 검색에 실패하면 0을 반환합니다.
public class IntQueue {

    private int[] que;      // 큐용 배열
    private int capacity;   // 큐의 용량
    private int front;      // 맨 앞의 요소 커서
    private int rear;       // 맨 뒤의 요소 커서
    private int num;        // 현재 데이터 개수

    // 실행 시 예외: 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    // 생성자
    public IntQueue(int maxLen) {

        num = front = rear = 0;
        capacity = maxLen;

        try {
            que = new int[capacity];     // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {

        if (num >= capacity)
            throw new OverflowIntQueueException();   // 큐가 가득 참

        que[rear++] = x;
        num++;

        if (rear == capacity)
            rear = 0;

        return x;
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException {

        if (num <= 0)
            throw new EmptyIntQueueException();   // 큐가 비어 있음

        int x = que[front++];
        num--;

        if (front == capacity)
            front = 0;

        return x;
    }

    public int peek() throws EmptyIntQueueException {

        if (num <= 0)
            throw new EmptyIntQueueException();   // 큐가 비어 있음

        return que[front];
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

    public int search(int x) {

        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)
                return i + 1;
        }
        return 0;
    }
}
