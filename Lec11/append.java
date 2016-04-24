package Lec11;

public class append extends LinkedList {
	
	public static int getLength(Node<Integer> head)
	{
		int counter=1;
		while(head!=null)
		{
			head=head.getNext();
			counter++;
			
		}
		return counter;
	}
	
	public static Node<Integer>AppendN(Node<Integer> head,int n)
	{
		Node<Integer> tmpHead=head;
		Node<Integer> tail=head;
		Node<Integer> tailPrev=null;
		
		int ctr=1;
		int len=getLength(head);
		if(n>len)
		{
			System.out.println("Not possible");
			return head;
		}
		while(ctr<len-n  )
		{
			ctr++;
			tailPrev=tail;
			tail=tail.getNext();
		}
		int count=0;
		while(count<n)
		{
			tailPrev.setNext(tail.getNext());
			Node<Integer>tmp=head;
			tail.setNext(head);
			tail=head;
			tail=tailPrev.getNext();
			count++;
		}
		return head;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head =AppendN(head,3);
		printList(head);
		

	}

}
