package BinarySearchTrees;

public class FormBinaryTree  extends BinaryTreeUse{
	
	public static BinaryTreeNode<Integer> formBinary(int[]input,int startIndex,int endIndex)
	{
		if(endIndex-startIndex<0)
		{
			return null;
		}
		if((endIndex-startIndex)==0)
		{
			return new BinaryTreeNode<Integer>(input[startIndex]);
		}
		int midIndex=(startIndex+endIndex)/2;
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(input[midIndex]);
		BinaryTreeNode<Integer>lef=formBinary(input,startIndex, midIndex-1);
		BinaryTreeNode<Integer>rig=formBinary(input, midIndex+1,endIndex);
		root.left=lef;
		root.right=rig;
		return root;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input={1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root = formBinary(input, 0, input.length-1);
		printBT(root);

	}

}
