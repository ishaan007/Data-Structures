package BinaryTrees;

public class preOrder extends BinaryTreeUse {
	public static void preOr(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preOr(root.left);
		preOr(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		preOr(root);

	}

}
