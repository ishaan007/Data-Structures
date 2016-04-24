package Lec11;

public class Ques13HWAppendNatEnd extends LinkedList{
	
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
	public static Node<Integer> moveLastNtoFirst(Node<Integer> head,int n)
	{
		int len=getLength(head);
		int remaining =len-n;
		Node<Integer> previousToCut=head;
		int counter=1;
		while(counter!=remaining)
		{
			previousToCut=previousToCut.getNext();
			counter++;
			
		}
		Node<Integer>tail=previousToCut;
		while(counter!=len)
		{
			tail=tail.getNext();
			counter++;
			
		}
		tail.setNext(head);
		head=previousToCut.getNext();
		previousToCut.setNext(null);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		System.out.println(getLength(head));
		head=moveLastNtoFirst(head, 2);
		printList(head);

	}

}
