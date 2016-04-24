package Lec11;

public class LinkedList3K3K13K2 extends LinkedList  {
	
	public static  Node<Integer> formOutput(Node<Integer>head)
	{
		Node<Integer>zeroHead=null;
		Node<Integer>zeroTail=null;
		Node<Integer>firstHead=null;
		Node<Integer>firstTail=null;
		Node<Integer>twoHead=null;
		Node<Integer>twoTail=null;
		int zero=0;
		int first=0;
		int second=0;
		while(head!=null)
		{
			if(head.data%3==0)
			{
				if(zero==0)
				{
					zeroHead=head;
					zeroTail=head;
					zero++;
				}
				else
				{
					zeroTail.next=head;
					zeroTail=head;
					zero++;
					
				}
			}
			if(head.data%3==1)
			{
				if(first==0)
				{
					firstHead=head;
					firstTail=head;
					first++;
				}
				else
				{
					firstTail.next=head;
					firstTail=head;
					first++;
					
				}
			}
			if(head.data%3==2)
			{
				if(second==0)
				{
					twoHead=head;
					twoTail=head;
					second++;
				}
				else
				{
					twoTail.next=head;
					twoTail=head;
					second++;
					
				}
			}
			head=head.next;
			
		}
		zeroTail.next=firstHead;
		firstTail.next=twoHead;
		twoTail.next=null;
		return zeroHead;
		
		
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
	    head =formOutput(head);
		printList(head);

	}

}
