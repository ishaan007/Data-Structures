package StacksQueuesAssignment;
import Lec11.*;

public class ReverseAQueue extends LinkedList {
	public static Node<Integer> actualHead;
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
	public static Node<Integer>reverse(Node<Integer>head)
	{
		if(head.getNext()==null)
		{
			actualHead=head;
			return head;
		}
		Node<Integer>tmp=head;
		Node<Integer>tmp2=head.getNext();
		Node<Integer>received=reverse(tmp2);
		received.setNext(tmp);
		tmp.setNext(null);
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
	    head=reverse(head);
		printList(actualHead);

	}

}
