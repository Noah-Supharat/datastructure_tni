public class TreeApp2 {



    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree4()");
        System.out.println("------------------------------");

        tree.createTree4();
        tree.printTree(tree.getRoot(), 0);
        System.out.println();
        tree.searchDeleteNode(15);

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");

        BinaryTree tree2 = new BinaryTree();
        tree2.createTree5();
        tree2.printTree(tree2.getRoot(), 0);

        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree6()");
        System.out.println("------------------------------");

        BinaryTree tree3 = new BinaryTree();
        tree3.createTree6();
        tree3.printTree(tree3.getRoot(), 0);
    }
}