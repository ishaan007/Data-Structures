package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Ques9 extends BinaryTreeUse {
	
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
	public static int returnIndex(int[]arr,int toSearch)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==toSearch)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	public static BinaryTreeNode<Integer> makeTree(int[]pre,int[]in,int startIndex,int endIndex,int current)
	{
		BinaryTreeNode<Integer>head=new BinaryTreeNode<Integer>(null);
		int i=0
		while(startIndex<endIndex)
		{
			head.data=pre[current];
			int curr=pre[i];
			int indexInIn=returnIndex(in,curr );
			BinaryTreeNode<Integer>lef=makeTree(pre,in,startIndex,indexInIn-1);
			BinaryTreeNode<Integer>ri=makeTree(pre,in,indexInIn+1, endIndex);
			head.left=lef;
			head.right=ri;
		}
		return head;
			
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(1);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(3);
		root.left.left=new BinaryTreeNode<Integer>(4);
		root.left.right=new BinaryTreeNode<Integer>(5);
		root.right.left=new BinaryTreeNode<Integer>(6);
		root.right.right=new BinaryTreeNode<Integer>(7);
		printBT(root);

	}

}
