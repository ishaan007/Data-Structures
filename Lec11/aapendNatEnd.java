package Lec11;

public class aapendNatEnd  extends LinkedList{
	public static int getLength(Node<Integer> head)
	{
		Node<Integer> orhead=head;
		
		int counter=1;
		while(orhead!=null)
		{
			orhead=orhead.getNext();
			counter++;
			
		}
		return counter;
	}
	
	public  static Node<Integer> nAppend(Node<Integer> head)
	{
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		System.out.println(getLength(head));

	}

}
