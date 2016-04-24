package BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {

	private static Scanner s = new Scanner(System.in);
	
	public static int countNumNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int count = 1;
		count = count + countNumNodes(root.left) + countNumNodes(root.right);
		return count;
	}
	
	public static void printBT(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		
		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted = toBePrinted + root.left.data;
		}
		
		if (root.right != null) {
			toBePrinted = toBePrinted + "," +  root.right.data;
		}
		System.out.println(toBePrinted);
		printBT(root.left);
		printBT(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeBTInput() {
		System.out.println("Enter root data");
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeBTInput();
		root.right = takeBTInput();
		return root;
	}
	
	public static void main(String[] args) {
		// 1 2 4 -1 -1 -1 3 -1 5 -1 -1
		
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		Scanner s1 = new Scanner(System.in);
//		int b = s1.nextInt();
//		System.out.println(a + b);
		
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		System.out.println(countNumNodes(root));
	}
}

