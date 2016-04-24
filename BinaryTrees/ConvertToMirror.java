package BinaryTrees;

public class ConvertToMirror extends BinaryTreeUse {
	
	public static BinaryTreeNode<Integer>mirror(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer>tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		return root;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		root=mirror(root);
		printBT(root);
		

	}

}
