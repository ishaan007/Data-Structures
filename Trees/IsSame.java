package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class IsSame extends TreeUse {
	
public static boolean checkIfSame(TreeNode<Integer>root1,TreeNode<Integer>root2){
		
		Queue<TreeNode<Integer>>queue1=new LinkedList<>();
		queue1.add(root1);
		Queue<TreeNode<Integer>>queue2=new LinkedList<>();
		queue2.add(root2);
		TreeNode<Integer>tmpRoot1=root1;
		TreeNode<Integer>tmpRoot2=root2;
		while(!queue1.isEmpty()&& !queue2.isEmpty())
		{
			tmpRoot1=queue1.peek();
			tmpRoot2=queue2.peek();
			int tmpRootData1=tmpRoot1.getData();
			int tmpRootData2=tmpRoot2.getData();
			int numChild1=tmpRoot1.children.size();
			int numChild2=tmpRoot2.children.size();
			queue1.remove(tmpRoot1);
			queue2.remove(tmpRoot2);
			if(numChild1!=numChild2)
			{
				return false;
			}
		for(int i=0;i<numChild1;i++)
		{
			TreeNode<Integer>child1=tmpRoot1.children.get(i);
			TreeNode<Integer>child2=tmpRoot2.children.get(i);
			if(tmpRoot1.children.get(i).getData()!=tmpRoot2.children.get(i).getData())
			{
				return false;
			}
			queue1.add(child1);
			queue2.add(child2);
		}
		}
		if(queue1.isEmpty()&& queue2.isEmpty())
		{
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root1=takeTreeInput();
		printTreeInput(root1);
		TreeNode<Integer>root2=takeTreeInput();
		printTreeInput(root2);
		System.out.println(checkIfSame(root1, root2));
		

	}

}
