package Lec11;

public class MergeTwoSortedLists extends LinkedList {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1=takeLInput();
		printList(head1);
		Node<Integer> head2=takeLInput();
		printList(head2);
		Node<Integer> resultHead=submerge(head1,head2);
		printList(resultHead);

	}

}
