package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintInZigZag extends BinaryTreeUse {
	
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
	
	public static void printZig(BinaryTreeNode<Integer>root)
	{
		Queue<BinaryTreeNode<Integer>>queue=new LinkedList<>();
		BinaryTreeNode<Integer>tmpRoot=root;
		queue.add(root);
		int ht=height(root);
		ArrayList<Integer>
		while(!queue.isEmpty())
		{
			tmpRoot=queue.peek();
			int tmpHt=height(tmpRoot);
			if(ht-tmpHt==1)
			{
				ht--;
				System.out.println("");
			}
			System.out.print(tmpRoot.data+" ");
			queue.remove();
			if(tmpRoot!=null)
			{
			if(tmpRoot.left!=null)
			{
				queue.add(tmpRoot.left);
				
			}
			if(tmpRoot.right!=null)
			{
				queue.add(tmpRoot.right);
				
			}
			}
		}
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
