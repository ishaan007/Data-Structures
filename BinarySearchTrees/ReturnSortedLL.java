package BinarySearchTrees;
import java.util.*;

public class ReturnSortedLL extends BinaryTreeUse {
	
	public static<Integer> void printList(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.getData()+" ->");
			head=head.getNext();
		
		}
		System.out.println("");
	}

	
	public static CombinedLL returnSorted(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			CombinedLL ob=new CombinedLL();
			ob.head=null;
			ob.tail=null;
			return ob;
		}
		if(root.left==null && root.right==null)
		{
			CombinedLL ob=new CombinedLL();
			ob.head=new Node<Integer>(root.data);
			ob.tail=ob.head;
			return ob;
		}
		CombinedLL lef=returnSorted(root.left);
		CombinedLL ri=returnSorted(root.right);
		CombinedLL toRet=new CombinedLL();
		if(lef.tail==null)
		{
			toRet.head=new Node<Integer>(root.data);
			toRet.tail=toRet.head;
		}else
		{
			toRet.head=lef.head;
			toRet.tail=lef.tail;
			Node<Integer>tmpTail=new Node<Integer>(root.data);
			toRet.tail.next=tmpTail;
			toRet.tail=tmpTail;
		}
		if(ri.tail!=null)
		{
			Node<Integer>riHead=ri.head;
			toRet.tail.next=riHead;
			toRet.tail=ri.tail;
		}
		return toRet;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node<Integer> head=takeLInput();
		//printList(head);
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(4);
		root.left=new BinaryTreeNode<Integer>(2);
		root.right=new BinaryTreeNode<Integer>(6);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(3);
		root.right.left=new BinaryTreeNode<Integer>(5);
		root.right.right=new BinaryTreeNode<Integer>(7);
		CombinedLL lis=returnSorted(root);
		lis.tail.next=null;
		printList(lis.head);

	}

}
