package BinarySearchTrees;

public class FindParent {
	public static BinaryTreeNode<Integer>parent;
	
	public static BinaryTreeNode<Integer>returnParent(BinaryTreeNode<Integer>toRet,BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		if(root==toRet)
		{
			parent=root;
		}
		
		returnParent(toRet,root.left);	
		returnParent(toRet,root.right);	
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
