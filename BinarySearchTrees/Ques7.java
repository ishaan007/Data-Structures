package BinarySearchTrees;

public class Ques7 extends BinaryTreeUse {
	public static int great=0;
	
	public static Ques7Data replaceByGreatestInBST(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			
			return null;
		}
		Ques7Data ri=replaceByGreatestInBST(root.right);
		//Ques7Data lef=replaceByGreatestInBST(root.left);
		/*if(lef==null && ri==null)
		{
			Ques7Data ret=new Ques7Data();
			int tmp=root.data;
			root.data=great;
			ret.greatest=ret.greatest+tmp;
			great=ret.greatest;
			return ret;
		}*/
		if(ri!=null)
		{
			
			root.data=great;
			ri.greatest=ri.greatest+root.data;
			great=ri.greatest;
			return ri;
		}
		/*else if(lef!=null)
		{
			
			great=great+root.data;
			lef.greatest=great;
			root.left.data=great;;
			return lef;
			
		}
		*/
		/*else
		{
			root.data=great;
			great=great+root.data;
			ri.greatest=great;
			//root.left.data=great;
			return ri;
			
		}
		*/
		Ques7Data lef=replaceByGreatestInBST(root.left);
		
		
		
	}
	public static void main(String[] args)
	{
		
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(6);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(3);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(7);
		printBT(root);
		System.out.println("Changed tree");
		replaceByGreatestInBST(root);
		printBT(root);
	}

}
