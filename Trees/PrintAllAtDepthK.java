package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllAtDepthK extends TreeUse {
public static void printAtK(TreeNode<Integer>root,int k){
	if(k==1)
	{
		System.out.println(root.getData());
		
	}
	for(int i=0;i<root.children.size();i++)
	{
		printAtK(root.children.get(i),k-1);
	}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		//printTreeInput(root);
		printAtK(root,3);


	}

}
