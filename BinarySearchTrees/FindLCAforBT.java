package BinarySearchTrees;
import BinarySearchTrees.*;
public class FindLCAforBT  extends MergeSort{
	public static Node<Integer>headeraw;
	
	
	public static int getLength(Node<Integer> head)
	{
		int counter=1;
		while(head!=null)
		{
			head=head.getNext();
			counter++;
			
		}
		return counter-1;
	}
	
	
	
	public static Node<Integer> returnList(BinaryTreeNode<Integer>root,BinaryTreeNode<Integer>node)
	{
		if(root==null)
		{
			return null;
		}
		Node<Integer>ret;
		if(root.data==node.data)
		{
			ret=new Node<Integer>(node.data);
			headeraw=ret;
			return ret;
		}
		else
		{
			ret=null;
		}
		Node<Integer> tmp=returnList(root.left,node);
		Node<Integer> tmp2=returnList(root.right,node);
		if(tmp==null && tmp2==null)
		{
			return null;
		}
		else if(tmp!=null)
		{
			ret=new Node<Integer>(root.data);
			tmp.next=ret;
			return ret;
		}
		else
		{
			ret=new Node<Integer>(root.data);
			tmp2.next=ret;
			return ret;
		}	
	}
	
	public static int findLCA(BinaryTreeNode<Integer>node1,BinaryTreeNode<Integer>node2,BinaryTreeNode<Integer>root)
	{
		Node<Integer> ret=returnList(root,node1);
		Node<Integer> list1=headeraw;
		headeraw=null;
		Node<Integer> ret2=returnList(root,node2);
		Node<Integer> list2=headeraw;
		headeraw=null;
		while(list1!=null)
		{
			Node<Integer>tmp2=list2;
		while(tmp2!=null)
		{
			if(tmp2.data==list1.data)
			{
				return list1.data;
			}
			tmp2=tmp2.next;
		}
		list1=list1.next;
		}
		System.out.println("something is wrong ");
		return -1;
		
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
		//returnList(root,root.left.left);
		System.out.println(findLCA(root.left.right,root.right.left,root));
	
		
		
		
		 

		

	}

}
