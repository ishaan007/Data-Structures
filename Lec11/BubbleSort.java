package Lec11;

public class BubbleSort extends LinkedList {
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
	
	public static Node<Integer> sort(Node<Integer> head)
	{
		if(head==null||head.getNext()==null )
		{
			return head;
		}
		
		int len=getLength(head);
		for(int i=0;i<len-1;i++)
		{
			Node<Integer>current=head;
			Node<Integer>previous=null;
			while(current!=null && current.getNext()!=null )
			{
				if(current.getData()<=current.getNext().getData())
				{
					previous=current;
					current=current.getNext();
					
				}
				else
				{
					if(previous==null)
					{
						Node<Integer>tmp=current.getNext();
						head=head.getNext();
						current.setNext(tmp.getNext());
						tmp.setNext(current);
						previous=tmp;
						
						
					}
					else
					{
						Node<Integer>tmp=current.getNext();
						previous.setNext(current.getNext());
						current.setNext(tmp.getNext());
						tmp.setNext(current);
						previous=tmp;
						
						
					}
				}
				
			}
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head =sort(head);
		printList(head);
		

	}

}
