package Lec11;

public class SwapTwo extends LinkedList {
	
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
	public static Node<Integer> swap(Node<Integer> head,int i,int j)
	{
		if(i==j)
		{
			return head;
		}
		if(i>j)
		{
			int tmp=i;
			i=j;
			j=tmp;
		}
		Node<Integer>orhead=head;
		Node<Integer>beforeI=head;
		Node<Integer>beforeJ=head;
		int counter=1;
		if(i!=1)
		{
		while(counter!=i-1)
		{
			beforeI=beforeI.getNext();
			counter++;
			
		}
		}
		System.out.println(beforeI.getData());
		counter=1;
		while(counter!=j-1)
		{
			beforeJ=beforeJ.getNext();
			counter++;
			
		}
		if(i==1)
		{
			if(Math.abs(i-j)>1)
			{
			Node<Integer>I=head;
			Node<Integer>J=beforeJ.getNext();
			Node<Integer>iNext=I.getNext();
			I.setNext(J.getNext());
			J.setNext(iNext);
			beforeJ.setNext(I);
			head=J;
			
			}
			else
			{
				Node<Integer>I=head;
				Node<Integer>J=beforeJ.getNext();
				I.setNext(J.getNext());
				J.setNext(I);
				head=J;
				
			}
			
		}
		else
		{
		if(Math.abs(i-j)>1)
		{
		Node<Integer>I=beforeI.getNext();
		Node<Integer>J=beforeJ.getNext();
		Node<Integer>iNext=I.getNext();
		beforeI.setNext(J);
		beforeJ.setNext(I);
		I.setNext(J.getNext());
		J.setNext(iNext);
		}
		else
		{
			Node<Integer>I=beforeI.getNext();
			Node<Integer>J=beforeJ.getNext();
			Node<Integer>JNext=J.getNext();
			beforeI.setNext(J);
			J.setNext(I);
			I.setNext(JNext);
			
		}
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		// first should be less than two
		head=swap(head,4,5);
		printList(head);
		

	}

}
