package Heaps;

import java.util.ArrayList;

public class HeapUse {
	ArrayList<HeapData<Integer>>heap;
	public HeapUse()
	{
		heap=new ArrayList<>();
		heap.add(null);
	}
	public int HeapSize()
	{
		return heap.size()-1;
	}
	public boolean isEmpty()
	{
		return heap.size()==1;
	}
	public void add(int element)
	{
		HeapData<Integer>heapElement=new HeapData<>();
		heapElement.data=element;
		heapElement.priority=element;
		if(heap.size()==1)
		{
			heap.add(heapElement);
			return;
		}
		heap.add(heapElement);
		int childIndex=heap.size()-1;
		int parentIndex=childIndex/2;
		while(childIndex!=1)
		{
			if(heap.get(childIndex).priority>=heap.get(parentIndex).priority)
			{
				return;
			}
			else
			{
				HeapData<Integer>child=heap.get(childIndex);
				heap.set(childIndex,heap.get(parentIndex));
				heap.set(parentIndex, child);
				childIndex=parentIndex;
				parentIndex=parentIndex/2;
			}
		}
		
	}
	public HeapData<Integer> deleteMin()
	{
		HeapData<Integer>min=heap.get(1);
		heap.set(1, heap.get(heap.size()-1));
		heap.set(heap.size()-1, min);
		heap.remove(heap.size()-1);
		int parentIndex=1;
		int LeftChildIndex=2*parentIndex;
		int RightChildIndex=2*parentIndex+1;
		while(RightChildIndex<=heap.size()-1)
		{
			
			if(heap.get(parentIndex).priority<heap.get(LeftChildIndex).priority && heap.get(parentIndex).priority<heap.get(RightChildIndex).priority) 
			{
				return min;		
			}
			else
			{
				
				if(heap.get(RightChildIndex).priority<heap.get(LeftChildIndex).priority)
				{
					// swap right
					HeapData<Integer>tmp=new HeapData<>();
					tmp.data=heap.get(parentIndex).data;
					tmp.priority=heap.get(parentIndex).priority;
					heap.set(parentIndex, heap.get(RightChildIndex));
					heap.set(RightChildIndex, tmp);
					parentIndex=RightChildIndex;
					LeftChildIndex=2*parentIndex;
					RightChildIndex=2*parentIndex+1;
				}
				else
				{
					// swap left
					HeapData<Integer>tmp=new HeapData<>();
					tmp.data=heap.get(parentIndex).data;
					tmp.priority=heap.get(parentIndex).priority;
					heap.set(parentIndex, heap.get(LeftChildIndex));
					heap.set(LeftChildIndex, tmp);
					parentIndex=LeftChildIndex;
					LeftChildIndex=2*parentIndex;
					RightChildIndex=2*parentIndex+1;
				}
				
			}
		}
		
		return min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapUse hp=new HeapUse();
		/*hp.add(10);
		hp.add(5);
		hp.add(4);
		System.out.println(hp.deleteMin().data);
		System.out.println(hp.deleteMin().data);
		System.out.println(hp.HeapSize());
		System.out.println(hp.deleteMin().data);
		System.out.println(hp.HeapSize());
		System.out.println(hp.isEmpty());
		*/
		for(int i=10;i>0;i--)
		{
			hp.add(i);
		}
		for(int i=10;i>0;i--)
		{
			System.out.println(hp.deleteMin().data);
		}
		
		

	}

}
