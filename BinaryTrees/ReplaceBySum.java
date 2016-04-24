package BinaryTrees;

public class ReplaceBySum extends BinaryTreeUse {
	
	public static void replaceSum(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return;
		}
	
		int lef=0;
		int ri=0;
		if(root.left!=null)
		{
		 lef=root.left.data;
		}
		if(root.right!=null)
		{
		 ri=root.right.data;
		}
		
		if(root.left==null && root.right==null)
		{
			root.data=0;
		}
		else
		{
			root.data=lef+ri;
		}
		replaceSum(root.left);
		replaceSum(root.right);
		return ;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		replaceSum(root);
		printBT(root);

	}

}
