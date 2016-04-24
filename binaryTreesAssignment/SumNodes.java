package binaryTreesAssignment;

public class SumNodes extends BinaryTreeUse {

	public static int sum(BinaryTree<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		int su=root.data;
		su=su+sum(root.left)+sum(root.right);
		return su;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer>root=formBT();
		printB(root);
		System.out.println(sum(root));
		

	}

}
