package queue;

public class MyQueue {
    private final int[] arr = new int[4];
    // Queue에서 데이터 꺼내는 위치
    private int front = -1;
    // Queue에 데이터 추가하는 위치
    private int rear = -1;

    public MyQueue() {

    }
    //데이터 추가
    public void enQueue(int x) {
        // rear + 1이 배열의 크기만 해질 때
        if (rear == arr.length - 1) {
            throw new RuntimeException("queue is full");
        }
        rear++; // rear를 하나 증가
        arr[rear] = x; // arr[rear]에 data 할당
    }
    // 데이터 회수
    public int deQueeu() {
        // front == rear일 때 큐가 비어있음
        if (front == rear) {
            throw new RuntimeException("queue is empty");
        }
        front++; // front 하나 증가
        return arr[front];
    }
    // 큐가 비어있는 지 확인
    public boolean isEmpty() {
        return front == rear;
    }
    // 다음에 나올 데이터가 무엇인지 확이(Queue에서 빼내지 않음)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front + 1]; // 비어있지 않으면 front + 1 반환
    }

    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        intQueue.enQueue(1);
        intQueue.enQueue(2);
        intQueue.enQueue(3);
        System.out.println(intQueue.deQueeu());
        System.out.println(intQueue.deQueeu());
        System.out.println(intQueue.deQueeu());
    }
}
