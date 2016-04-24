package Lec11;

public class ReverseWithoutRecusion extends LinkedList {
	
	public static Node<Integer> reverse (Node<Integer>head)
	{
		Node<Integer>orhead=head;;
		Node<Integer>current=head;
		Node<Integer>next=current.getNext();
		Node<Integer>nextNext=next.getNext();
		Node<Integer>first=head;
		while((current!=null && current.getNext()!=null) && nextNext !=null )
		{
			next.setNext(current);
			
			Node<Integer>ahead=nextNext.getNext();
			current=next;
			next=nextNext;
			nextNext=ahead;
		}
		next.setNext(current);
		first.setNext(null);
		return next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=reverse(head);
		printList(head);

	}

}
