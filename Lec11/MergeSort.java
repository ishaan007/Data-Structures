package Lec11;

public class MergeSort extends LinkedList{
	
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
	
	public static Node<Integer>submerge(Node<Integer>head1,Node<Integer>head2)
	{
		int len1=getLength(head1);
		int len2=getLength(head2);
		Node<Integer>resultHead= (head1.getData()>head2.getData()) ? head2 :head1 ;
		Node<Integer>resultTail=resultHead;
		if(head1.getData()<head2.getData())
		{
			head1=head1.getNext();
		}
		else
		{
			head2=head2.getNext();
		}

		while((head1 !=null ) && (head2 !=null))
		{
			if(head1.getData()<head2.getData() )
			{
				resultTail.setNext(head1);
				resultTail=head1;
				head1=head1.getNext();
				
			}
			else
			{
				
				resultTail.setNext(head2);
				resultTail=head2;
				head2=head2.getNext();
				
			}
			
		}
		//System.out.println(head1.getData());
		if(head1==null)
		{
			resultTail.setNext(head2);
		}
		else
		{
			resultTail.setNext(head1);
		}
		return resultHead;
	}
	public static Node<Integer> sort(Node<Integer> head)
	{
		if(head==null ||head.getNext()==null)
		{
			return head;
		}
		Node<Integer>mid=findMid(head);
		Node<Integer>head2=mid.getNext();
		Node<Integer>head1=head;
		mid.setNext(null);
		Node<Integer>newHead1=sort(head1);
		Node<Integer>newHead2=sort(head2);
		return submerge(newHead1,newHead2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=sort(head);
		printList(head);
	}

}
