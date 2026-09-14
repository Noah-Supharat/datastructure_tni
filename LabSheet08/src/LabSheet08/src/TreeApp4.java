import java.util.Scanner;

public class TreeApp4 {
    static void main() {
        System.out.print("Input N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BinaryTree tree = new BinaryTree();
        tree.createTree6();
        tree.find(n);
    }
}
