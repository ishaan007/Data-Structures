package Lec11;

public class Ques12PrintInReverse extends LinkedList {
	
	public static void printInReverse(Node<Integer> head)
	{
		if(head.getNext()==null)
		{
			System.out.print(head.getData()+" <- ");
			return;
		}
		Node<Integer>tmpHead=head;
	    printInReverse(head.getNext());
		System.out.print(head.getData()+" <- ");
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		printInReverse(head);
		

	}

}
