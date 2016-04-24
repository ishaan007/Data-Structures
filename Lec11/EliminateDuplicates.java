package Lec11;

public class EliminateDuplicates extends LinkedList {
	
	public static boolean checkIfDuplicates(Node<Integer> head)
	{
		Node<Integer>current=head;
		Node<Integer>runner=head.getNext();
		while(runner!=null )
		{
			if(current.getData()==runner.getData())
			{
				return true;
			}
			runner=runner.getNext();
			current=current.getNext();
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		boolean result=checkIfDuplicates(head);
		System.out.println(result);

	}

}
