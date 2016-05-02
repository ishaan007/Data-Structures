package BinarySearchTrees;



public class Ques2Assignment extends BinaryTreeUse {
	
	public static BinaryTreeNode<Integer>addToEveryLeft(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		root.left=addToEveryLeft(root.left);
		root.right=addToEveryLeft(root.right);
		if(root.left==null)
		{
			BinaryTreeNode<Integer>tmp=new BinaryTreeNode<Integer>(root.data);
			root.left=tmp;
		}
		else
		{
			BinaryTreeNode<Integer>tmp=new BinaryTreeNode<Integer>(root.data);
			BinaryTreeNode<Integer>currentLeft=root.left;
			root.left=tmp;
			root.left.left=currentLeft;
			
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(2);
		root.left=new BinaryTreeNode<Integer>(1);
		root.right=new BinaryTreeNode<Integer>(3);
		//root.left.left=new BinaryTreeNode<Integer>(1);
		//root.left.right=new BinaryTreeNode<Integer>(10);
		//root.right.left=new BinaryTreeNode<Integer>(5);
		//root.right.right=new BinaryTreeNode<Integer>(7);
		printBT(root);
		root=addToEveryLeft(root);
		printBT(root);

	}

}

