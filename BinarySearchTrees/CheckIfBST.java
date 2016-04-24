package BinarySearchTrees;

import BinaryTrees.BinaryTreeNode;

public class CheckIfBST extends BinaryTreeUse {
	
	public static int findMin(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(findMin(root.left), findMin(root.right)));
	}
	public static int findMax(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return -1;
		}
		return Math.max(root.data,Math.max(findMax(root.left), findMax(root.right)));
	}
	public static boolean checkBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		if(root.left!=null)
		{
			if(findMax(root.left)>root.data )
			{
				
				return false;
			}
		}
		if(root.right!=null)
		{
			if(findMin(root.right)<root.data )
			{
				
				return false;
			}
		}
		
		return checkBST( root.left)&& checkBST( root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(6);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(10);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(7);
		System.out.println(findMin(root));
		System.out.println(findMax(root));
		System.out.println(checkBST(root));

	}

}
