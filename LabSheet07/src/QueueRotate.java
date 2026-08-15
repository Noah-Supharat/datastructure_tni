import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
    public static Queue<Integer> queue = new ArrayDeque<Integer>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int respond = 1;
        originalQueue();

        while (true){
            System.out.println();
            System.out.print("Press 1 to rotate queue: ");
            respond = input.nextInt();

            if (respond != 1){
                break;
            }

            if (!queue.isEmpty()){
                System.out.println("Calling queue: " + queue.peek());
                rotateQueue();
                System.out.println("Queue: " + queue);
            }
            else {
                break;
            }
        }
        System.out.println("Exit");
    }

    public static void rotateQueue() {
        queue.add(queue.poll());
    }

    public static void originalQueue() {
        queue.add(101);
        queue.add(102);
        queue.add(103);
        queue.add(104);
        queue.add(105);
        queue.add(106);
        queue.add(107);
    }

}