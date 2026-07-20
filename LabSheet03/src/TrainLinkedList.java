public class TrainLinkedList {
    static void main() {
        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");

        System.out.println("All Station   : " + greenline.traversal());

        greenline.insert(2, "Rachakru");

        System.out.println("All Station   : " + greenline.traversal());

        System.out.println("Total Station : " + greenline.length());

        System.out.println("First Station : " + greenline.get(0));

        greenline.set(0, "No-chit (Central Ladprao)");

        System.out.println("All Station   : " + greenline.traversal());

        greenline.remove(3);

        System.out.println("All Station   : " + greenline.traversal());

        greenline.removeLastElement();

        System.out.println("All Station   : " + greenline.traversal());

        greenline.clear();

        System.out.println("Total Station : " + greenline.length());

        System.out.println("All Station   : " + greenline.traversal());
    }
}
