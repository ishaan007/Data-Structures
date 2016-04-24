package Trees;

public class SumOfAllChildrenAndNodes extends TreeUse {
	public static int largest;

	public static int  findMaxSum(TreeNode<Integer>root)
	{ if(root.children.size()==0)
	{
		return root.getData();
	}
		int max=0;
	    largest=root.getData();
		for(int i=0;i<root.children.size();i++)
		{
			max=max+ root.children.get(i).getData();
		}
		
		for(int i=0;i<root.children.size();i++)
		{
			int tmp=root.getData()+findMaxSum(root.children.get(i));
			if(tmp>max)
			{
				max=tmp;
				largest=root.getData();
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		//printTreeInput(root);
		findMaxSum(root);
		System.out.println(largest);

	}

}
