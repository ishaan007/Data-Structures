package Lec11;

public class SelectionSortWithoutRecusrion extends LinkedList{
	
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
	public static Node<Integer>sort(Node<Integer>head)
	{
		int len=getLength(head);
		Node<Integer>previous=null;
		Node<Integer>current=head;
		Node<Integer>nex=head.getNext();
		int counter=1;
		for(int i=1;i<len;i++)
		{
			Node<Integer>startFrom=current;
			Node<Integer>small=current;
			int smallNum=current.getData();
			int smallInd=i;
			for(int j=i;j<len+1;j++)
			{
				if(smallNum>startFrom.getData())
				{
					smallNum=startFrom.getData();
					small=startFrom;
					smallInd=j;
					counter++;
				}
				startFrom=startFrom.getNext();
			}
			head=swap(head,i,smallInd);
			if(Math.abs(smallInd-i)==1)
			{	
			previous=nex;
			nex=current.getNext();
			}
			else
			{
				previous=current;
				current=nex;
				nex=nex.getNext();
			}
			
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=sort(head);
		printList(head);


	}

}
