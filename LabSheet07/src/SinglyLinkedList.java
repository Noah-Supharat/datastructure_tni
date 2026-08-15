class Node {

    public int data;

    public Node next;



    public Node(int value) {

        this.data = value;

        this.next = null;

    }

}



public class SinglyLinkedList {

    private Node head;

    private Node tail;



    public SinglyLinkedList() {

        head = null;

        tail = null;

    }



    public String displayList() {

        boolean first = true;

        String display = "[";

        for (Node current = head; current != null; current = current.next) {

            display += (!first ? ", " : "") + current.data;

            first = false;

        }

        display += "]";

        return display;

    }



    public void clear() {

        head = null;

        tail = null;

    }



    public boolean isEmpty() {

        return head == null;

    }



    public void append(int value) {

        Node newNode = new Node(value);

        if (isEmpty()) {

            head = newNode;

            tail = newNode;

        } else {

            tail.next = newNode;

            tail = newNode;

        }

    }



    public Object get(int position) {

        Node current = head;

        if (!isEmpty()) {

            int count = 0;

            while (current != null) {

                if (count == position) {

                    return current.data;

                }

                count++;

                current = current.next;

            }

        }

        return null;

    }



    public void set(int position, int value) {

        Node newNode = new Node(value);

        Node current = head;

        if (!isEmpty()) {

            int count = 0;

            if (position == 0) {

                newNode.next = head.next;

                head = newNode;

                System.out.println("Update data success!!");

            }



            while (current != null && count < position - 1) {

                count++;

                current = current.next;

            }



            if(current != null && current.next != null) {

                newNode.next = current.next.next;

                current.next = newNode;

                System.out.println("Update data success!!");

            } else {

                System.out.println("Update data fail...");

            }



        } else

            System.out.println("Update data fail...");

    }



    public boolean contains(int value) {

        Node current = head;

        if (!isEmpty()) {

            while (current != null) {

                if (current.data == value) {

                    return true;

                }

                current = current.next;

            }

        }

        return false;

    }



    public void addAll(SinglyLinkedList otherlist) {

        if(otherlist == null || otherlist.isEmpty()) {

            return;

        }



        if (this.isEmpty()) {

            this.head = otherlist.head;

            this.tail = otherlist.tail;

        } else {

            this.tail.next = otherlist.head;

            this.tail = otherlist.tail;

        }

    }



}

