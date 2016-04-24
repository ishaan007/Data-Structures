package BinaryTrees;

public class FindMax extends BinaryTreeUse {
	
	public static int max(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return -1;
		}
		int max=root.data;
		int lef=max(root.left);
		int right=max(root.right);
		int lefRiMax=0;
		if(lef>right)
		{
			lefRiMax=lef;
		}
		else
		{
			lefRiMax=right;
		}
		if(lefRiMax>max)
		{
			max=lefRiMax;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		System.out.println("Maximum is "+max(root));

	}

}
