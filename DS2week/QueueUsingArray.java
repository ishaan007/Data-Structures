package DS2week;

public class QueueUsingArray {
	private int[] data;
	private int firstElementIndex;
	private int nextElementIndex;
	public int size;
	public QueueUsingArray()
	{
		data=new int[5];
		firstElementIndex=-1;
		nextElementIndex=0;
		size=0;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public boolean checkEmpty()
	
	{
		if(size()==0)
		{
			return true;
		}
		return false;
		
	}
	public void enqueue(int element)
	{
		if(size==data.length)
		{
			int[] tmp=data;
			data=new int[data.length*2];
			int k=0;
			for(int i=firstElementIndex;i<=tmp.length;i++)
			{
				data[k]=tmp[i];
				k++;
			}
			for(int i=0;i<=nextElementIndex;i++)
			{
				data[k]=tmp[i];
				k++;
			}
			firstElementIndex=0;
			nextElementIndex=tmp.length;
		}
		if(firstElementIndex==-1)
		{
			firstElementIndex=0;
		}
		data[nextElementIndex]=element;
		nextElementIndex=(nextElementIndex+1)%data.length;	
		size++;
	}
	public void print()
	{
		
		int k=0;
		for(int i=firstElementIndex;i<=data.length;i++)
		{
			System.out.println(data[k]);
			k++;
		}
		for(int i=0;i<=nextElementIndex;i++)
		{
			System.out.println(data[k]);
			k++;
		}
	}
	public int dequeue() throws QueueEmptyException
	{
		if(nextElementIndex==0)
		{
			throw new QueueEmptyException();
		}
		
		int toRet=data[firstElementIndex];
		firstElementIndex=(firstElementIndex+1)%data.length;
		size--;
		return toRet;
		
		
		
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray queue=new QueueUsingArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		

	}

}
