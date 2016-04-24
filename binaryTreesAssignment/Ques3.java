package binaryTreesAssignment;

import BinaryTrees.BinaryTreeNode;

public class Ques3 extends BinaryTreeUse{
	
	public static int getHeight(BinaryTree<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		int lef=getHeight(root.left);
		int ri=getHeight(root.right);
		return 1+(int)(Math.max(lef, ri));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		//System.out.println(countNumNodes(root));

	}

}
