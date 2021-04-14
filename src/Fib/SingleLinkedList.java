package Fib;

import java.util.Stack;

public class SingleLinkedList {
	static class Node {
		int data;
		Node next;

	};

	static Node deleteNode(Node root, int target) {

		Node current = root;
		Node next = null;
		while (current != null) {
			next = current.next;
			if (current.data == target) {
				current = next.next;
			}
		}

		return root;
	}

	static Node insert(Node root, int item) {

		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;

		Node temp;
		if (root == null) {
			root = newNode;
		} else {
			temp = root;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
		return root;

	}

	static int getMiddleNode(Node nodes) {
		int nodeLength = 0;
		Node p = nodes;
		while (p != null) {
			p = p.next;
			nodeLength++;
		}
		int c = 0;
		p = nodes;
		while (c < (nodeLength / 2)) {
			p = p.next;
			c = c + 1;
		}
		return p.data;

	}

	static Node reverseLinkedList(Node root) {

		Node prev = null;
		Node current = root;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		root = prev;
		return root;

	}

	static void printNode(Node root) {
		while (root != null) {
			System.out.println(root.data);
			root = root.next;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 6, 7 };
		int n = arr.length;
		Node root = arrayToList(arr, n);
		printNode(root);
		System.out.println("Reversed Node is ");
		root = deleteNode(root,6);
		printNode(root);

	}

	static Node arrayToList(int arr[], int n) {
		Node root = null;
		for (int i = 0; i < n; i++)
			root = insert(root, arr[i]);
		return root;
	}

}
