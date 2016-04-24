package Trees;

public class CountLeafNodes extends TreeUse {
	public static int numLeaf(TreeNode<Integer>root)
	{
		int value=0;
		if(root.children.size()==0)
		{
			value=value+1;
		}
		for(int i=0;i<root.children.size();i++)
		{
			
				value=value+numLeaf(root.children.get(i));
			
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		System.out.println("Number of leaf nodes are" +numLeaf(root));

	}

}
