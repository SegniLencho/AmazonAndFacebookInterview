package helper;

public class Node {
	public int key;
	public Node prev;
	public Node next;

	public Node(int data) {
		this.key = data;
		prev = null;
		next = null;

	}
}
