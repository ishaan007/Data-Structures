package Lec11;

public class Swap extends LinkedList {
	
	public static Node<Integer> swap (Node<Integer> head,int first,int second)
	{
		Node<Integer>prevFirst=head;
		for(int i=1;i<first-1;i++)
		{
			prevFirst=prevFirst.getNext();
		}
		Node<Integer>prevSecond=head;
		for(int i=1;i<second-1;i++)
		{
			prevSecond=prevSecond.getNext();
		}
		prevFirst.setNext(prevSecond.getNext());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=insert(head,head,1,7,1);
		printList(head);
		

	}

}
