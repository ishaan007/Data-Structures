package Heaps;

import java.util.ArrayList;

public class HeapUse {
	ArrayList<HeapData<Integer>>heap;
	public HeapUse()
	{
		heap=new ArrayList<>();
	}
	public void add(int element)
	{
		HeapData<Integer>heapElement=new HeapData<>();
		heapElement.data=element;
		heapElement.priority=element;
		if(heap.size()==0)
		{
			heap.add(heapElement);
			return;
		}
		heap.add(heapElement);
		int childIndex=heap.size()-1;
		int parentIndex=childIndex/2;
		while(childIndex!=1))
		{
			if(heap.get(childIndex).priority>=heap.get(parentIndex).priority)
			{
				return;
			}
			else
			{
				int childData=heap.get(childIndex).data;
				heap.set(childIndex, heap.get(parentIndex));
				
				heap.set(parentIndex, childData);
				childIndex=parentIndex;
				parentIndex=parentIndex/2;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
