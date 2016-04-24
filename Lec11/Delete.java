package Lec11;

public class Delete extends LinkedList {
	
	public static Node<Integer> delete (Node<Integer> head,Node<Integer>current,int position,int count)
	{
		if(position==1)
		{
			
			return head.getNext();
		}
		if(count==position-1)
		{
			current.setNext(current.getNext().getNext());
			return head;

		}
		return delete(head,current.getNext(),position,count+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=delete(head,head,1,1);
		printList(head);
		

	}

}
