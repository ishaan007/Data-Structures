package BinarySearchTrees;

public class FindFromDistanceK extends BinaryTreeUse {
	
	public static void findAllAtDistK(BinaryTreeNode<Integer>root, int k)
	{
		if(root==null )
		{
			return ;
		}
		if(k==0)
		{
			System.out.println(root.data);
		}
		findAllAtDistK(root.left, k-1);
		findAllAtDistK(root.right, k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(6);
		root.left=new BinaryTreeNode<Integer>(4);
		root.right=new BinaryTreeNode<Integer>(8);
		root.left.left=new BinaryTreeNode<Integer>(3);
		root.left.right=new BinaryTreeNode<Integer>(5);
		root.right.left=new BinaryTreeNode<Integer>(7);
		root.right.right=new BinaryTreeNode<Integer>(9);
		
		BinaryTreeNode<Integer>root2=takeBTInput();
		printBT(root2);
		System.out.println("nodes at distance 2 are ");
		findAllAtDistK(root2, 2);
		//1 2 4 -1 -1 -1 3 -1 5 -1 -1
		//printBT(root);
		//System.out.println(search(root,23));
		//System.out.println(findSumOptimized(root,12));

	}

}
