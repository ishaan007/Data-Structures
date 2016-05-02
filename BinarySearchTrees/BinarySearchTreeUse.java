package BinarySearchTrees;

public class BinarySearchTreeUse extends BinaryTreeUse{
	private BinaryTreeNode<Integer>root;
	private static BinaryTreeNode<Integer> getMin(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		root.left=getMin(root.left);
		root.right=getMin(root.right);
		
		if(root.left.data>root.right.data)
		{
			if(root.left.data>root.data)
			{
				return root.left;
			}
			return root;
		}
		else
		{
			if(root.right.data>root.data)
			{
				return root.right;
			}
			return root;
			
		}
	}
	
	private static BinaryTreeNode<Integer>insert(BinaryTreeNode<Integer>root,int element)
	{
		if(root==null)
		{
			return new BinaryTreeNode<Integer>(element);
		}
		else if(root.data<element)
		{
			root.right=insert(root.right, element);
		}
		else
		{
			root.left=insert(root.left, element);
		}
		return root;
		
	}
	
	public  BinaryTreeNode<Integer>insert(int element)
	{
		return insert(root,element);
	}
	
	private static BinaryTreeNode<Integer>delete(BinaryTreeNode<Integer>root,int element)
	{
		if(root==null)
		{
			return null;
		}
		else if(root.data<element)
		{
			root.left=delete(root.left, element);
		}
		else if(root.data>element)
		{
			root.right=delete(root.right, element);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			BinaryTreeNode<Integer> min=getMin(root.right);
			root.data=min.data;
			root.right=delete(root.right, min.data);
		}
		return root;
	}
	
	public  BinaryTreeNode<Integer>delete(int element)
	{
		return delete(root,element);
	}
	private static boolean search(BinaryTreeNode<Integer>root,int element)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==element)
		{
			return true;
		}
		return search(root.left,element)||search(root.right,element);
		
	}
	
	public  boolean search(int element)
	{
		return search(root,element);
	}
	private static int size(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		
		return 1+size(root.left)+size(root.right);
		
	}
	
	public  int size()
	{
		return size(root);
	}
	
	
	public  boolean isEmpty()
	{
		return size()==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeUse tr=new BinarySearchTreeUse();
		
		tr.root=tr.insert(1);
		tr.root=tr.insert(2);
		tr.root=tr.insert(3);
		tr.root=tr.insert(4);
		printBT(tr.root);
		tr.root=tr.delete(1);
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		printBT(tr.root);
	}

}
