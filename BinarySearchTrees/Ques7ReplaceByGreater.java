package BinarySearchTrees;

public class Ques7ReplaceByGreater extends BinaryTreeUse {
	
	public static int replceByAllGreaterSum(BinaryTreeNode<Integer>root,int x)
	{
		if(root==null)
		{
			return 0 ;
		}
		int y=replceByAllGreaterSum(root.right, x);
		int z=root.data;
		root.data=y;
		x=replceByAllGreaterSum(root.left, x+y);
		return x+y+z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(7);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(3);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(6);
		replceByAllGreaterSum(root,0);
		//System.out.println(root.data);
		printBT(root);


	}

}
