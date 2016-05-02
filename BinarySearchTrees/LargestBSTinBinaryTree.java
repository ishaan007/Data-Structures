package BinarySearchTrees;


public class LargestBSTinBinaryTree extends BinaryTreeUse {
	
	public static  FindLargestBSTinBTdata findLargest(BinaryTreeNode<Integer>root,int min,int max,boolean isBinary)
	{
		if(root==null)
		{
			return null;
		}
		FindLargestBSTinBTdata lef=findLargest(root.left,min,max,isBinary);
		FindLargestBSTinBTdata ri=findLargest(root.right,min,max,isBinary);
		if(lef==null && ri==null)
		{
			FindLargestBSTinBTdata toRet=new FindLargestBSTinBTdata();
			toRet.isBolean=true;
			toRet.max=root.data;
			toRet.min=root.data;
			toRet.size=1;
			return toRet;
		}
		else if(lef==null)
		{
			if(ri.min>root.data && ri.isBolean)
			{
			ri.min=root.data;
			ri.max=Math.max(ri.max, root.right.data);
			ri.isBolean=true;
			ri.size++;
			}
			else
			{
				//ri.min=root.data;
				//ri.max=root.data;
				ri.isBolean=false;
				
			}
			return ri;
		}
		else if(ri==null)
		{
			if(lef.max<root.data && lef.isBolean)
			{
			lef.min=Math.min(root.left.data,lef.min );
			lef.max=root.data;
			lef.isBolean=true;
			lef.size++;
			}
			else
			{
				//lef.min=root.data;
				//lef.max=root.data;
				lef.isBolean=false;
				
			}
			return lef;
			
		}
		else
		{
			if(lef.max<root.data && ri.min>root.data && ri.isBolean && lef.isBolean)
			{
			lef.min=Math.min(root.left.data,lef.min );
			lef.max=Math.max(ri.max, root.right.data);;
			lef.isBolean=true;
			lef.size=lef.size+ri.size+1;
			return lef;
			}
			else
			{
				if(lef.size>ri.size)
				{
					if(lef.isBolean)
					{

					//lef.isBolean=false;
					//return lef;
						if(lef.max<root.data)
						{
						lef.min=Math.min(root.left.data,lef.min );
						lef.max=root.data;
						lef.isBolean=true;
						lef.size++;
						return lef;
						}
						else
						{
							lef.isBolean=false;
							return lef;
							
							
						}
					}
					else
					{
						lef.isBolean=false;
						return lef;
						
					}
				}
				else
				{
					if(ri.isBolean)
					{
						if(ri.min>root.data)
						{
						ri.min=root.data;
						ri.max=Math.max(ri.max, root.right.data);
						ri.isBolean=true;
						ri.size++;
						return ri;
						}
						else
						{
							ri.isBolean=false;
							return ri;
						}
						
					}
					else
					{
					ri.isBolean=false;
					return ri;
					}
				}
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(10);
		root.left=new BinaryTreeNode<Integer>(5);
		root.right=new BinaryTreeNode<Integer>(15);
		root.left.left=new BinaryTreeNode<Integer>(1);
		root.left.right=new BinaryTreeNode<Integer>(20);
		root.right.left=new BinaryTreeNode<Integer>(7);
		//root.right.right=new BinaryTreeNode<Integer>(3);
		FindLargestBSTinBTdata ret=findLargest(root,Integer.MAX_VALUE,Integer.MIN_VALUE,false);
		System.out.println("Is whole tree binary tree "+ret.isBolean);
		System.out.println("Max Value "+ret.max);
		System.out.println("Min Value "+ret.min);
		System.out.println("Size "+ret.size);

	}

}
