package tree;

public class BinaryTreeArray {
    private int[] tree;
    private int size;

    public BinaryTreeArray(int size) {
        this.size = size;
        tree = new int[size];
    }

    public void setRoot(int value) {
        tree[0] = value;
    }

    public void setLeftChild(int parentIndex, int value) {
        int leftChildIndex = (2 * parentIndex) + 1;
        if (leftChildIndex < size) {
            tree[leftChildIndex] = value;
        }
    }

    public void setRightChild(int parentIndex, int value) {
        int rightChildIndex = (2 * parentIndex) + 2;
        if (rightChildIndex < size) {
            tree[rightChildIndex] = value;
        }
    }

    public int getRoot() {
        return tree[0];
    }

    public int getLeftChild(int parentIndex) {
        int leftChildIndex = (2 * parentIndex) + 1;
        if (leftChildIndex < size) {
            return tree[leftChildIndex];
        }
        return -1; // 자식이 없을 경우 -1을 반환하거나 예외 처리를 할 수도 있습니다.
    }

    public int getRightChild(int parentIndex) {
        int rightChildIndex = (2 * parentIndex) + 2;
        if (rightChildIndex < size) {
            return tree[rightChildIndex];
        }
        return -1; // 자식이 없을 경우 -1을 반환하거나 예외 처리를 할 수도 있습니다.
    }

    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray(7);

        tree.setRoot(1);
        tree.setLeftChild(0, 2);
        tree.setRightChild(0, 3);
        tree.setLeftChild(1, 4);
        tree.setRightChild(1, 5);
        tree.setLeftChild(2, 6);
        tree.setRightChild(2, 7);

        int rootValue = tree.getRoot();
        int leftChildValue = tree.getLeftChild(0);
        int rightChildValue = tree.getRightChild(0);
        int parentValue = tree.getRoot(); // 부모 자체가 루트인 경우

        System.out.println("Root: " + rootValue);
        System.out.println("Left Child: " + leftChildValue);
        System.out.println("Right Child: " + rightChildValue);
        System.out.println("Parent: " + parentValue);
    }
}
