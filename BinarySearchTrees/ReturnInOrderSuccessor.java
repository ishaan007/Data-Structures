package BinarySearchTrees;

public class ReturnInOrderSuccessor extends BinaryTreeUse {
	public static BinaryTreeNode<Integer>toRet;
	static int counter;
	
	public static BinaryTreeNode<Integer> findInOrderSuccessor(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		root.left=findInOrderSuccessor(root.left);
		if(root.left==null  && counter==0)
		{
			toRet=root;
			counter++;
		}
		root.right=findInOrderSuccessor(root.right);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(6);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(3);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(7);
		findInOrderSuccessor(root);
		System.out.println(toRet.data);
		

	}

}
