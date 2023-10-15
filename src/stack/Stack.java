package stack;

public class Stack {
//    스택에 실제 데이터가 저장되는 곳
    private final int[] arr = new int[16];
//    현재 스택 최고점 파악을 위한 top
    private int top = -1;

    public void myStack() {
    }
//    push: 스택의 제일 위에 데이터 넣는 메소드
    public void push(int data) {
//        0. arr 가득 찾는지 판단
        if(arr.length -1 == top) { // 배열 마지막 인덱스는 'arr.length - 1'(15)
            throw new RuntimeException("week9.Stack is Full!");
        }
//        1. top 하나 증가
//        2. arr[tp[]에 data를 할당
        arr[++top] = data;
    }
//    pop: 스택 제일 위에서 데이터 회수 메소드
    public int pop() {
//        0. arr가 비어있는 지 판단
        if(top == -1) {
            throw new RuntimeException("week9.Stack is Full!");
        }
//        1. arr[top]의 값 임시 저장
//        int tmp = arr[top]
//        2. top 값 하나 감소
//        3. 임시 저장했던 값 반환
        return arr[top--];
    }

    public static void main(String[] args) {

    }

    public boolean empty() {
        return empty();
    }
}
