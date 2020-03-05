public class Node{


	private String data;
	public Node leftChild;
	public Node rightChild;
	Node root;


	public Node(String data, Node leftChild, Node rightChild){


		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;

	}


	public Node getRightChild(){

		return this.rightChild;

	}


	public Node getLeftChild(){


		return this.leftChild;

	}

	public String getData(){


		return this.data;

	}


}
