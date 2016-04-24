package Lec11;

public class Insert extends LinkedList {
	
	public static Node<Integer> insert (Node<Integer> head,Node<Integer>current,int position,int data,int count)
	{
		if(position==1)
		{
			Node<Integer> toAdd=new Node<Integer>(data);
			toAdd.setNext(head);
			return toAdd;
		}
		if(count==position-1)
		{
			Node<Integer> toAdd=new Node<Integer>(data);
			toAdd.setNext(current.getNext());
			current.setNext(toAdd);
			return head;

		}
		return insert(head,current.getNext(),position,data,count+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeLInput();
		printList(head);
		head=insert(head,head,1,7,1);
		printList(head);
		

	}

}
