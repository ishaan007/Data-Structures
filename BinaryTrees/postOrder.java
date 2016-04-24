package BinaryTrees;

public class postOrder extends BinaryTreeUse {
	public static void postOr(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return;
		}
		postOr(root.left);
		postOr(root.right);
		System.out.println(root.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		postOr(root);

	}

}
