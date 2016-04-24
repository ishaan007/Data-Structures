package Trees;

public class ReplaceWithDepth extends TreeUse {
	public static TreeNode<Integer> replaceWithDepth(TreeNode<Integer>root,int n)
	{
		root.setData(n);
		
		for(int i=0;i<root.children.size();i++)
		{
				//value=value+numLeaf(root.children.get(i));
			
			replaceWithDepth(root.children.get(i),n+1);
			
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer>root=takeTreeInput();
		printTreeInput(root);
		root=replaceWithDepth(root,1);
		printTreeInput(root);
		

	}

}
