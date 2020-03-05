import java.util.*;
import java.io.*;

class LSBSTApp{

	Node root;
	public int IopCounter =0;
	public int opCounter = 0;
	public void visit(Node n){


		System.out.println(n.getData());


	}



	public void insert(String data){
	
		if(root == null){

			root = new Node(data, null, null);

		}else{

			insert(data, root);

		}

	}

	public void insert(String data, Node n){
	

		if(data.compareTo(n.getData()) <= 0){
			

			if(n.leftChild == null){

				
				n.leftChild = new Node(data, null, null);
				
			}else{

				insert(data, n.leftChild);


			}

		}else{

			if(n.rightChild == null){


				n.rightChild = new Node(data, null, null);


			}else{


				insert(data, n.rightChild);


			}



		}

		
	}


	public void inOrderTraverseTree(Node n ){


		if(n != null){

			inOrderTraverseTree(n.getLeftChild());
			visit(n);
			inOrderTraverseTree(n.getRightChild());

		}



	}



	public Node search(String data){
		

		if(root == null){
		
			return null;


		}else{

			return search(data, root);

		}


	}


	public Node search(String data, Node n){

		String temp = n.getData();
		String temp1 = temp.substring( 0, temp.indexOf(" "));	
		int cmp = data.compareTo(temp1);
		if(cmp == 0){
			opCounter++;
			System.out.println(temp.substring(temp.indexOf(" ")+1));
			return n;

		}else if(cmp < 0){
			opCounter++;
			return (n.getLeftChild() == null) ? null : search(data, n.getLeftChild());

		}else{
			opCounter++;
			return (n.getRightChild() == null) ? null : search(data, n.getRightChild());

		}
	

	}


	public static void main(String[] args){

		LSBSTApp theTree = new LSBSTApp();

		int Wcount; = 0;
		



		String temp = "";	

	
		try{
			Scanner kb = new Scanner(System.in);
	                String fileName = kb.nextLine(); 

		
			file = new File("/home/nirata/SWNNIS001/"+fileName);
			Scanner fl = new Scanner(file);

			while(fl.hasNext()){


				temp = fl.nextLine();
				
				theTree.insert(temp);

				


			}


		}catch(FileNotFoundException e){

			
			System.out.println("File Not Found!");


		}

		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		String fInput = input.replace(' ', '_');
		if(!(input.equals(""))){

			
			theTree.search(fInput);


		}else{

			theTree.inOrderTraverseTree(theTree.root);


		}
		System.out.println("The number of operations used for search is: "+ theTree.opCounter);


	}


}

