import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstFive {
    static void main() {
        Queue<Integer> n_queue = new LinkedList<Integer>();

        for(int i = 101; i <= 110; i++){
            n_queue.add(i);
        }

        System.out.println("Queue => " + n_queue);

        int size = n_queue.size();
        for(int i = 0; i < size; i++){
            int temp = n_queue.poll();
            if (i < 5){
                System.out.println(temp);
            }
            n_queue.add(temp);
        }

        System.out.println("Queue => " + n_queue);
    }
}
