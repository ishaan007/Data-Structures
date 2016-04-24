package Lec11;


public class ReverseALinkedList extends LinkedList {
	public static Node<Integer>actualHead;
	
	public static Node<Integer> Reverse(Node<Integer> head)
	{
		if(head.getNext()==null)
		{
			actualHead=head;
			return head;
		}
		Node<Integer>saved=head;
		Node<Integer>tmp=Reverse(head.getNext());
		tmp.setNext(saved);
		saved.setNext(null);
		return saved;
	   
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		Reverse(head);
		printList(actualHead);
		

	}
}