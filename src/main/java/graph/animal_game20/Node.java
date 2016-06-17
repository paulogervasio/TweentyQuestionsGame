package graph.animal_game20;


/**
 * An Node representing a vertex in the Graph.
 * 
 * @author Paulo Gervasio.
 * @author pgervasiosousa@gmail.com
 *
 */
public class Node {

	private Node left;
	private Node right;
	private String name;
	
	Boolean isAnAnimal = false;

	public Node(String _name) {
		setName(_name);
	}


	
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
