package BinarySearchTrees;

public class Ques9AssignmentBST {
	
	public static void  printAllPathsIfEqualToSum(BinaryTreeNode<Integer>root,int sum,String path)
	{
		if(root==null)
		{
			return;
		}
		if(sum-root.data==0)
		{
			System.out.println(path+" "+root.data);
			return;
		}
		path=path+" "+root.data;
		printAllPathsIfEqualToSum(root.left,sum-root.data,path);
		printAllPathsIfEqualToSum(root.right,sum-root.data,path);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(1);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(3);
		root.left.left=new BinaryTreeNode<Integer>(3);
		root.left.right=new BinaryTreeNode<Integer>(3);
		root.right.left=new BinaryTreeNode<Integer>(2);
		root.right.right=new BinaryTreeNode<Integer>(2);
		printAllPathsIfEqualToSum(root, 6, "");

	}

}
