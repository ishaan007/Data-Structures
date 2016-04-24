package Lec11;

public class QueueUsingLinkedList {
	private Node<Integer> head;
	private Node<Integer> tail;
	private int size;
	public void enqueue(int element)
	{
		if(size==0)
		{
			head=new Node<Integer>(element);
			tail=head;
			size++;
			return;
			
		}
		Node<Integer> tmp=new Node<Integer>(element);
		tail.setNext(tmp);
		tail=tmp;
		size++;
		
		
		
	}
	public int dequeue() throws QUnderFlowException
	{
		if(size==0)
		{
			QUnderFlowException qu=new QUnderFlowException();
			throw qu;
			
		}
		int toRet=head.getData();
		head=head.getNext();
		size--;
		return toRet;
		
	}
	public int top() throws QUnderFlowException
	{
		if(size==0)
		{
			QUnderFlowException ob=new QUnderFlowException();
			throw ob;
			
			
		}
		
		return head.getData();
	}
	public  void printList()
	{
		Node<Integer> orhead=head;
		while(orhead!=null)
		{
			System.out.print(orhead.getData()+" ->");
			orhead=orhead.getNext();
		
		}
		System.out.println("");
	}

	public static void main(String[] args) throws QUnderFlowException {
		// TODO Auto-generated method stub
		//Node<Integer> head=takeLInput();
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.printList();
		queue.enqueue(1);
		queue.enqueue(3);
		queue.enqueue(5);
		System.out.println("top element is "+queue.top());
		queue.printList();
		queue.dequeue();
		queue.printList();
		queue.dequeue();
		//queue.dequeue();
		queue.printList();
		//queue.dequeue();
		System.out.println("top element is "+queue.top());
		
		

	}

}
