package BinarySearchTrees;

public class CheckIfBstOptimized  extends BinaryTreeUse{
	
	public static  CombinedReturn checkBalanced(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			CombinedReturn leaf=new CombinedReturn();
			leaf.isBalanced=true;
			leaf.max=-1;
			leaf.min=Integer.MAX_VALUE;
			return leaf;
		}
		CombinedReturn toReturn=new CombinedReturn();
		CombinedReturn lef=checkBalanced(root.left);
		CombinedReturn ri=checkBalanced(root.right);
		toReturn.max=Math.max(root.data,Math.max(lef.max,ri.max));
		toReturn.min=Math.min(root.data,Math.min(lef.min,ri.min));
		toReturn.isBalanced=lef.isBalanced && ri.isBalanced && root.data>lef.max && root.data<ri.min ;
		return toReturn;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(6);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(10);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(7);
		CombinedReturn ob=checkBalanced(root);
		boolean result=ob.isBalanced;
		System.out.println(result);

	}

}
