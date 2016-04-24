package Trees;

public class NodeJustGreaterThanX extends TreeUse {
	
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
	public static int JustMax(TreeNode<Integer>root,int n)
	{
		TreeNode<Integer>tmpRoot=root;
		TreeNode<Integer>tmpRoot2=root;
		int value=FindMax(tmpRoot2);
		if(tmpRoot.getData()>n)
		{
			value=tmpRoot.getData();
		}
		
		for(int i=0;i<tmpRoot.children.size();i++)
		{
			int tmp=JustMax(tmpRoot.children.get(i),n);
			if(tmp>n && tmp<value)
			{
			value=tmp;
			}
			
		}
		return value;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		System.out.println("Just greater is " +JustMax(root,3));

	}

}
