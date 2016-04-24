package BinaryTrees;

import java.util.*;



public class Ques6  extends BinaryTreeUse{
	
	public static BinaryTreeNode<Integer>removeLeaves(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null && root.right==null)
		{
			root=null;
		}
		else
		{
			root.left=removeLeaves(root.left);
			root.right=removeLeaves(root.right);
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(1);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(3);
		root.left.left=new BinaryTreeNode<Integer>(4);
		root.left.right=new BinaryTreeNode<Integer>(5);
		root.right.left=new BinaryTreeNode<Integer>(6);
		root.right.right=new BinaryTreeNode<Integer>(7);
		printBT(root);
		root=removeLeaves(root);
		//BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);

	}

}
