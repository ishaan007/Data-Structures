package BinaryTrees;

public class Ques2 extends BinaryTreeUse {
	
	public static boolean checkIfBalanced(BinaryTreeNode<Integer>root1,BinaryTreeNode<Integer>root2)
	{
		boolean isRoot1Null=root1==null;
		boolean isRoot2Null=root2==null;
		if(isRoot1Null!=isRoot2Null)
		{
			return false;
		}
		if(root1==null && root2==null)
		{
			return true;
		}
		
		return checkIfBalanced(root1.left,root2.left)&& checkIfBalanced(root1.right,root2.right);
		
		
		
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
		
		BinaryTreeNode<Integer>root1=new BinaryTreeNode<Integer>(1);
		root1.left=new BinaryTreeNode<Integer>(2);
		root1.right=new BinaryTreeNode<Integer>(3);
		root1.left.left=new BinaryTreeNode<Integer>(4);
		root1.left.right=new BinaryTreeNode<Integer>(5);
		root1.right.left=new BinaryTreeNode<Integer>(6);
		root1.right.right=new BinaryTreeNode<Integer>(7);
		System.out.println(checkIfBalanced(root,root1));

	}

}
