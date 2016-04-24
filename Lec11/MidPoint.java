package Lec11;

public class MidPoint extends LinkedList {
	public static Node<Integer>findMid(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head.getNext();
		while(fast!=null && fast.getNext()!=null)
		{
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		return slow;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		Node<Integer> mid =findMid(head);
		System.out.println("Mid Point is "+mid.getData());

	}

}
