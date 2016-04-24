package Lec11;

public class Ques11OddEven extends LinkedList{
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
	public static Node<Integer>oddEven(Node<Integer> head)
	{
		Node<Integer>oddHead=null;
		Node<Integer>oddTail=null;
		Node<Integer>evenHead=null;
		Node<Integer>evenTail=null;
		Node<Integer>runner=head;
		int oddCounter=1;
		int evenCounter=1;
		while(runner!=null)
		{
			if(runner.getData()%2==1)
			{
				if(oddCounter==1)
				{
					oddHead=runner;
					oddTail=runner;
					oddCounter++;
				}
				else
				{
					oddTail.setNext(runner);
					oddTail=runner;
					
				}
			}
			else
			{
				if(evenCounter==1)
				{
					evenHead=runner;
					evenTail=runner;
					evenCounter++;
					
				}
				else
				{
					evenTail.setNext(runner);
					evenTail=runner;
				}
				
			}
			runner=runner.getNext();
		}
		oddTail.setNext(evenHead);
		evenTail.setNext(null);
		return oddHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=oddEven(head);
		printList(head);

	}

}
