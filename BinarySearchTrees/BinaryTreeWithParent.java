package BinarySearchTrees;

public class BinaryTreeWithParent<T> {
	
	public T data;
	public BinaryTreeWithParent<T> left;
	public BinaryTreeWithParent<T> right;
	public BinaryTreeWithParent<T> parent;
	
	public BinaryTreeWithParent(T data) {
		this.data = data;
	}

}
