package graph.animal_game20;

/**
 * Start application
 * 
 * @author Paulo Gervasio.
 * @author pgervasiosousa@gmail.com
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {

		// INITIAL CONFIGURATIONS
		Node leftNode = new Node("tubarão");
		leftNode.isAnAnimal = true;
		//
		Node rightNode = new Node("cachorro");
		rightNode.isAnAnimal = true;		
		//
		
		
		Node firstNode = new Node("vive na terra");
		firstNode.isAnAnimal = false;
		
		firstNode.setLeft(leftNode);
		firstNode.setRight(rightNode);
		
		TweentyQuestionsGame t = new TweentyQuestionsGame(firstNode);
		t.startGame();
	}
}
