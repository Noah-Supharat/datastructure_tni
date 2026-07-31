
public class StackLinkedList {

	// pointer to the top node
	private Node top;

	// create an empty stack
	public StackLinkedList() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int value) {
		Node new_node = new Node(value);
		if (isEmpty()) {
			top = new_node;
		} else {
			new_node.next = top;
			top = new_node;
		}
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return top.data;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			Node temp = top;
			int temp_data = top.data;
			top = top.next;
			temp = null;
			return temp_data;
		}
	}

	public void popAll() {
		top = null;
	}
}