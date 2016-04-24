package Lec11;

public class Bsort extends LinkedList {
	
	public static int getLength(Node<Integer> head)
	{
		int counter=1;
		while(head!=null)
		{
			head=head.getNext();
			counter++;
			
		}
		return counter-1;
		Node<Integer> Current=head;
		for(int i=0;i<len-1;i++)
		{
			
			for(int j=i;j<len-i-1;j++)
			{
				
			}
		}
	}
	
	public static Node<Integer> sort(Node<Integer> head)
	{
		int len=getLength(head);
		System.out.println(len);
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
