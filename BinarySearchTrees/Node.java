package BinarySearchTrees;

public class Node<T> {
	public T data;
	public Node<T> next;
	public Node(T data)
	{
		this.data=data;
	}

	public 	T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

