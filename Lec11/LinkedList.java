package Lec11;
import java.util.*;
public class LinkedList {
	
	
	public static<Integer> void printList(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.getData()+" ->");
			head=head.getNext();
		
		}
		System.out.println("");
	}
	public static Node<Integer> deleteNode(Node<Integer> head,int position)
	{
		if(position<1)
		{
			System.out.println("Faulty Position");
			return head;
		}
		if(position==1)
		{
			return head.getNext();
		}
		Node<Integer> originalHead=head;
		int count=1;
		if(position>1)
		{
			//Node<Integer> previous=new Node<>(0);
			while(count<position)
			{
				
				
				if(count==position-1)
				{
					head.setNext(head.getNext().getNext());
					break;
				}
				head=head.getNext();
				count++;
			}
			
			
		}
		return originalHead;
		
	}
	
	public static Node<Integer> takeLInput(){
		Scanner s=new Scanner(System.in);
		Node<Integer> head=null;
		System.out.println("Enter");
		int nextElement=s.nextInt();
		while(nextElement !=-1)
		{
			Node<Integer> nextNode=new Node<Integer>(nextElement);
			if(head==null)
			{
				head=nextNode;
			}
			else
			{
				Node<Integer> tail=head;
				while(tail.getNext()!=null)
				{
					tail=tail.getNext();
				}
				tail.setNext(nextNode);
			}
			System.out.println("Enter next element");
			//System.out.println("Enter");
			nextElement=s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(takeLInput());
		Node<Integer> head=takeLInput();
		printList(head);
	    head=deleteNode(head,1);
		printList(head);
	

	}

}
