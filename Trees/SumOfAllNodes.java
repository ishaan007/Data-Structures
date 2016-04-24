package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfAllNodes extends TreeUse {
	
	public static int SumOfNodes(TreeNode<Integer>root)
	{
		TreeNode<Integer>tmpRoot=root;
		int sum=tmpRoot.getData();
		
		for(int i=0;i<tmpRoot.children.size();i++)
		{
			sum=sum+SumOfNodes(tmpRoot.children.get(i));
			
		}
		return sum;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		System.out.println("Sum is " +SumOfNodes(root));

	}

}
