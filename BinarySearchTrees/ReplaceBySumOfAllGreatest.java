package BinarySearchTrees;

public class ReplaceBySumOfAllGreatest {

	public static BinaryTreeNode<Integer>replace(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null && root.right==null)
		{
			
		}
		BinaryTreeNode<Integer>tmpRight=replace(root.right);
		BinaryTreeNode<Integer>tmpLeft=replace(root.left);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
