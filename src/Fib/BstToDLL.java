package Fib;

import java.util.ArrayList;
import java.util.List;

import Fib.BstToDLL.BinaryTree;

public class BstToDLL {
	public static class BinaryTree {

		public static BinaryTreeNode create_BST(List<Integer> input) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	// merge(fuse) two sorted linked lists
	static BinaryTreeNode concatenate_lists(BinaryTreeNode head1, BinaryTreeNode head2) {

		if (head1 == null) {
			return head2;
		}

		if (head2 == null) {
			return head1;
		}

		// use left for previous.
		// use right for next.
		BinaryTreeNode tail1 = head1.left;
		BinaryTreeNode tail2 = head2.left;

		tail1.right = head2;
		head2.left = tail1;

		head1.left = tail2;
		tail2.right = head1;
		return head1;
	}

	public static BinaryTreeNode convert_to_linked_list(BinaryTreeNode root) {

		if (root == null) {
			return null;
		}

		BinaryTreeNode list1 = convert_to_linked_list(root.left);
		BinaryTreeNode list2 = convert_to_linked_list(root.right);

		root.left = root.right = root;
		BinaryTreeNode result = concatenate_lists(list1, root);
		result = concatenate_lists(result, list2);

		return result;
	}

	public static void main(String[] args) {

		List<Integer> input = new ArrayList<Integer>();
		input.add(100);
		input.add(50);
		input.add(200);
		input.add(25);
		input.add(75);
		input.add(125);
		input.add(350);
		input.add(30);
		input.add(60);
		BinaryTreeNode root = BinaryTree.create_BST(input);

		BinaryTreeNode head = convert_to_linked_list(root);
		List<Integer> result = get_list(head);
		System.out.println(result);
	}

	static List<Integer> get_list(BinaryTreeNode head) {
		List<Integer> r = new ArrayList<Integer>();
		if (head == null) {
			return r;
		}

		BinaryTreeNode temp = head;
		do {
			r.add(temp.data);
			temp = temp.right;
		} while (temp != head);

		return r;
	}

}
