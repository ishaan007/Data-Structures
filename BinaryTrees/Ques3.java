package BinaryTrees;

public class Ques3 extends BinaryTreeUse{
	
	public static int getHeight(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+(int)(Math.max(getHeight(root.left), getHeight(root.right)));
	}
	public static boolean checkIfBal(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return true;
		}
		if(Math.abs(getHeight(root.left)-getHeight(root.right))>1)
		{
			return false;
		}
		return checkIfBal(root.left) && checkIfBal(root.left);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 4 -1 -1 -1 3 -1 5 -1 -1
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(1);
		root.left=new BinaryTreeNode<Integer>(2);
		//root.right=new BinaryTreeNode<Integer>(3);
		root.left.left=new BinaryTreeNode<Integer>(4);
		root.left.right=new BinaryTreeNode<Integer>(5);
		//root.right.left=new BinaryTreeNode<Integer>(6);
		//root.right.right=new BinaryTreeNode<Integer>(7);
		//BinaryTreeNode<Integer> root = takeBTInput();
		
		printBT(root);
		System.out.println(checkIfBal(root));
		//System.out.println("height is "+getHeight(root.left));

	}

}
