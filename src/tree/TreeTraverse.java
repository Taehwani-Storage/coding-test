package tree;

public class TreeTraverse {
    private int nodes;
    private int[] arr; // 이진 트리를 표현하기 위한 배열
//    {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

//    전위 순회 V -> L -> R
//    preorder(), print -> preorder -> preorder
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", ");
            this.traversePreorder(node * 2); // 왼쪽 자식을 루트로 다시 preorder 호츌
            this.traversePreorder(node * 2 + 1); // 오른쪽 자식을 루트로 다시 preorder 호출
        }
    }
//    중위 순회 L -> V -> R
//    preorder(), print -> preorder -> preorder
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2); // 왼쪽 자식을 루트로 다시 preorder 호츌
            System.out.print(arr[node] + ", ");
            this.traverseInorder(node * 2 + 1); // 오른쪽 자식을 루트로 다시 preorder 호출
        }
    }
//    후위 순회 L -> R -> V
//    preorder(), print -> preorder -> preorder
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2); // 왼쪽 자식을 루트로 다시 preorder 호츌
            this.traversePostorder(node * 2 + 1); // 오른쪽 자식을 루트로 다시 preorder 호출
            System.out.print(arr[node] + ", ");
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });

        tree.traversePreorder(1);
        System.out.println();
        tree.traverseInorder(1);
        System.out.println();
        tree.traversePostorder(1);
        System.out.println();
    }
}
