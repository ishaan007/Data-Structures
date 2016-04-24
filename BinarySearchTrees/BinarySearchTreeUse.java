package BinarySearchTrees;

public class BinarySearchTreeUse extends BinaryTreeUse{
	private BinaryTreeNode<Integer>root;
	
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
	private static BinaryTreeNode<Integer> findSuccessiveInorder(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			return null;
		}
		
		findSuccessiveInorder(root.left)
		findSuccessiveInorder(root.right)
		
	}
	private static BinaryTreeNode<Integer>delete(BinaryTreeNode<Integer>root,int element)
	{
		if(root==null)
		{
			return null;
		}
		else if(root.left==null && root.right==null && root.data==element)
		{
			root=null;
			//return null;

		}
		else if(root.left!=null && root.right==null && root.data==element)
		{
			root.data=root.left.data;
			root.left=null;
			//return root;

		}
		else if(root.right!=null && root.left==null && root.data==element)
		{
			root.data=root.right.data;
			root.right=null;
			//return root;

		}

		else if(root.data<element)
		{
			root.right=delete(root.right, element);
		}
		else
		{
			root.left=delete(root.left, element);
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
		tr.root=tr.delete(3);
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		printBT(tr.root);
	}

}
