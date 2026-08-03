
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

         for (int i = 1; i <= 5; i++) {
             System.out.print("Enqueue: ");
             q.add(input.nextInt());
         }
        System.out.println("Queue => " + q);
        System.out.println();

         while (!q.isEmpty()) {
             System.out.println("Calling number: " + q.peek());
             System.out.println("Providing service number: " + q.remove());
             System.out.println();
         }

        System.out.println("Queue => " + q);
    }
}
