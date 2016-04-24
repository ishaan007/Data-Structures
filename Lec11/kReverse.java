package Lec11;

public class append extends LinkedList {
	
	public static Node<Integer>AppendN(Node<Integer> head,int k)
	{
		Node<Integer> tmpHead=head;
		Node<Integer> tail=head;
		while(tail!=null && tail.getNext()!=null)
		{
			tail=tail.getNext();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		Node<Integer> mid =findMid(head);
		System.out.println("Mid Point is "+mid.getData());

	}

}
