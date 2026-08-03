
public class QueueLinkedList {

    // pointer of the front and rear node
    private Node front;
    private Node rear;

    // create an empty queue
    public QueueLinkedList() {
        front = null;
        rear  = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else  {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int peek() {
        return isEmpty() ? -1 : front.data;
    }

    public int dequeue() {
        if (!isEmpty()) {
            int temp = front.data;
            Node tempNode = front;
            front = front.next;
            tempNode = null;
            return temp;
        }
        return -1;
    }

}

