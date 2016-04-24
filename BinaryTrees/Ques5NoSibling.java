package BinaryTrees;

public class Ques5NoSibling extends BinaryTreeUse {
	
	public static void printNoSiblingNode(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return ;
		}
		if(root.left!=null)
		{
			if(root.right==null)
			{
				System.out.println(root.left.data);
			}
		}
		if(root.right!=null)
		{
			if(root.left==null)
			{
				System.out.println(root.right.data);
			}
		}
		printNoSiblingNode(root.left);
		printNoSiblingNode(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(1);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(3);
		root.left.left=new BinaryTreeNode<Integer>(4);
		root.left.right=new BinaryTreeNode<Integer>(5);
		root.right.left=new BinaryTreeNode<Integer>(6);
		//root.right.right=new BinaryTreeNode<Integer>(7);
		printNoSiblingNode(root);
		

	}

}
