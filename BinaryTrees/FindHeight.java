package BinaryTrees;

public class FindHeight extends BinaryTreeUse {
	
	public static int height(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		int lef=height(root.left);
		int rig=height(root.right);
		if(lef>rig)
		{
			return 1+lef;
		}
		return 1+rig;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		System.out.println(height(root));

	}

}
