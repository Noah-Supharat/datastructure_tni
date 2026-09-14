public class TreeApp3 {
    static void main() {
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");

        BinaryTree tree2 = new BinaryTree();
        tree2.createTree5();
        tree2.printTree(tree2.getRoot(), 0);

        System.out.println("------------------------------");
        System.out.println("Delete leaf from createTree6()");
        System.out.println("------------------------------");

        BinaryTree tree4 = new BinaryTree();
        tree4.createTree5();
        tree4.delete(25);
        tree4.printTree(tree4.getRoot(), 0);

        System.out.println("-------------------------------------------");
        System.out.println("Delete node with 1 child from createTree6()");
        System.out.println("-------------------------------------------");

        BinaryTree tree5 = new BinaryTree();
        tree5.createTree5();
        tree5.delete(20);
        tree5.printTree(tree5.getRoot(), 0);

        System.out.println("----------------------------------------------");
        System.out.println("Delete node with 2 children from createTree6()");
        System.out.println("----------------------------------------------");

        BinaryTree tree6 = new BinaryTree();
        tree6.createTree5();
        tree6.delete(30);
        tree6.printTree(tree6.getRoot(), 0);
    }
}
