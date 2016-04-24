package Trees;

import java.util.Scanner;
import java.util.*;

public class TreeUse {
	
	public static TreeNode<Integer>takeTreeInput(){
		System.out.println("Enter Root");
		Scanner s=new Scanner(System.in);
		int rootData=s.nextInt();
		TreeNode<Integer>root=new TreeNode<>(rootData);
		Queue<TreeNode<Integer>>queue=new LinkedList<>();
		queue.add(root);
		TreeNode<Integer>tmpRoot=root;
		while(!queue.isEmpty())
		{
			tmpRoot=queue.peek();
			int tmpRootData=tmpRoot.getData();
			System.out.println("Enter the number of children of "+tmpRootData);
			int numChild=s.nextInt();
			queue.remove(tmpRoot);
		for(int i=0;i<numChild;i++)
		{
			System.out.println("Enter "+i+" th child of "+tmpRootData);
			int childData=s.nextInt();
			TreeNode<Integer>child=new TreeNode<Integer>(childData);
			tmpRoot.children.add(child);
			queue.add(child);
		}
		}
		return root;
		
		
	}
	public static void printTreeInput(TreeNode<Integer>root){
		
		Queue<TreeNode<Integer>>queue=new LinkedList<>();
		queue.add(root);
		TreeNode<Integer>tmpRoot=root;
		while(!queue.isEmpty())
		{
			tmpRoot=queue.peek();
			int tmpRootData=tmpRoot.getData();
			System.out.print(tmpRootData+" : ");
			int numChild=tmpRoot.children.size();
			queue.remove(tmpRoot);
		for(int i=0;i<numChild;i++)
		{
			TreeNode<Integer>child=tmpRoot.children.get(i);
			System.out.print(tmpRoot.children.get(i).getData()+" , ");
			queue.add(child);
		}
		System.out.println("");
		}
		return ;
		
		
	}
	public static int NumNodesGX(TreeNode<Integer>root,int x)
	{
		TreeNode<Integer>tmpRoot=root;
		int count=0;
		if(tmpRoot.getData()>x)
		{
			count++;
		}
		for(int i=0;i<tmpRoot.children.size();i++)
		{
			count=count+NumNodesGX(tmpRoot.children.get(i), x);
		}
		return count;
		
		
	}
	public static int FindMax(TreeNode<Integer>root)
	{
		TreeNode<Integer>tmpRoot=root;
		int maxData=root.getData();
		
		for(int i=0;i<tmpRoot.children.size();i++)
		{
			int childMax=FindMax(tmpRoot.children.get(i));
			if(childMax>maxData)
			{
				maxData=childMax;
			}
			
		}
		return maxData;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		System.out.println("Number of nodes greater than 1 are " +NumNodesGX(root, 1));
		System.out.println("Maximum in this tree is "+FindMax(root));
		
		
		
		
		
		

	}

}
