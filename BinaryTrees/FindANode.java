package BinaryTrees;

public class FindANode extends BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer>root,int x)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==x)
		{
			return root;
		}
			
		BinaryTreeNode<Integer>lef=findNode(root.left, x);
		if(lef!=null)
		{
			return lef;
		}
		else
		{
			return findNode(root.right, x);
		}	
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeBTInput();
		printBT(root);
		BinaryTreeNode<Integer> result=findNode(root,10);
		if(result!=null)
		{
		System.out.println("results is "+result.data);
		}
		else
		{
			System.out.println("results is "+result);
		}

	}

}
