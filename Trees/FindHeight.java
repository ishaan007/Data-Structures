package Trees;

public class FindHeight extends TreeUse {
	
	public static int height(TreeNode<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.children.size()==0)
		{
			return 1;
		}
		int max=1;
		for(int i=0;i<root.children.size();i++)
		{
			int heightChild=1+height(root.children.get(i));
			if(heightChild>max)
			{
				max=heightChild;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		System.out.println("Height of tree is " +height(root));

	}

}
