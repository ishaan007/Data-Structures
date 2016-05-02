package BinarySearchTrees;

public class FindLCA {
	
	public static BinaryTreeWithParent<Integer> findLCA(BinaryTreeWithParent<Integer>node,int a,int b)
	{
		if(node==null)
		{
			return null;
		}
		if(node.data>a && node.data>b)
		{
			return findLCA(node.left, a, b);
		}
		if(node.data<a && node.data<b)
		{
			return findLCA(node.right, a, b);
		}
		return node;
	}
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeWithParent<Integer>root=new BinaryTreeWithParent<Integer>(4);
		BinaryTreeWithParent<Integer>one=new BinaryTreeWithParent<Integer>(3);
		BinaryTreeWithParent<Integer>two=new BinaryTreeWithParent<Integer>(6);
		BinaryTreeWithParent<Integer>three=new BinaryTreeWithParent<Integer>(1);
		BinaryTreeWithParent<Integer>four=new BinaryTreeWithParent<Integer>(2);
		BinaryTreeWithParent<Integer>five=new BinaryTreeWithParent<Integer>(5);
		BinaryTreeWithParent<Integer>six=new BinaryTreeWithParent<Integer>(7);
		root.parent=null;
		root.left=one;
		root.right=two;
		one.parent=root;
		one.left=three;
		one.right=four;
		two.parent=root;
		two.left=five;
		two.right=six;
		three.parent=one;
		three.left=null;
		three.right=null;
		four.parent=one;
		four.left=null;
		four.right=null;
		five.parent=two;
		five.left=null;
		five.right=null;
		six.parent=two;
		six.left=null;
		six.right=null;
		BinaryTreeWithParent<Integer>ret=findLCA(root,6,7);
		System.out.println(ret.data);
		
		
		

	}

}
