package BinarySearchTrees;

import java.util.ArrayList;

public class TwoNodesEqualSum  extends BinaryTreeUse{
	static ArrayList<Integer> entries=new ArrayList<Integer>();
	
	public static boolean findSumOptimized(BinaryTreeNode<Integer>root,int num)
	{
		convert(root);
		for(int ele:entries)
		{
			System.out.println(ele);
		}
		
		int head=0;
		int tail=entries.size()-1;
		while(head<tail)
		{
			if(entries.get(head)+entries.get(tail)<num)
			{
				head++;
			}
			else if(entries.get(head)+entries.get(tail)>num)
			{
				tail--;
			}
			else
			{
				System.out.println(entries.get(head)+"  , "+entries.get(tail));
				return true;
				
			}
		}
		return false;
	}
	
	public static boolean findSum(BinaryTreeNode<Integer>root,int num)
	{
		convert(root);
		for(int ele:entries)
		{
			

			if(search(root, num-ele))
			{
				entries=null;
				return true;
			}
		}
		entries=null;
		return false;
	}
	
	public static boolean search(BinaryTreeNode<Integer>root,int num)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==num)
		{
			return true;
		}if(root.left!=null)
		{
			if(root.left.data==num)
			{
				return true;
			}
		}
		if(root.right!=null)
		{
			if(root.right.data==num)
			{
				return true;
			}
		}
		return search(root.left, num)||search(root.right, num);
	}

	public static void convert(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return ;
		}
		convert(root.left);
		entries.add(root.data);
		convert(root.right);
		
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
		//printBT(root);
		System.out.println(search(root,23));
		System.out.println(findSumOptimized(root,12));

	}

}
