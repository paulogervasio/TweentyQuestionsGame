package graph.animal_game20;

/**
 * A tweenty questions game representation
 * 
 * @author Paulo Gervasio.
 * @author pgervasiosousa@gmail.com
 *
 */
public class TweentyQuestionsGame implements Playable {

	// the basic node, the first link with all other nodes
	private Node firstNode;

	public TweentyQuestionsGame(Node _firstNode) {
		firstNode = _firstNode;
	}

	/**
	 * main game method.
	 * Start the game.
	 * */
	public void startGame() {

		Banners.bannerInitGame();
		Node p;

		while (true) {

			p = firstNode;

			Banners.bannerStartGame();

			if (!Questions.askYNQuestion(DefaultConfigs.DEFAULT_FIRST_QUESTION, " (s/n)")) {
				System.out.println(DefaultConfigs.FATAL_ERROR);
				break;
			}

			// for negative answers
			Boolean isAnewFeatureL = false;

			// there was an attempt to hit the answer?
			Boolean wasResultAnimalQuestionDone = false;

			while (p.getLeft() != null) {

				Boolean YNanswer = Questions.askYNQuestion("Ele " + p.getName() + "?", " (s/n)");
				String animalName = "";

				// positive answers goes to right node and negative to left
				if (YNanswer) {
					p = p.getRight();
					if (!p.isAnAnimal) {
						continue;
					}
					animalName = p.getName();
				} else {
					p = p.getLeft();
					if (!p.isAnAnimal) {
						continue;
					}
					animalName = p.getLeft() == null?p.getName():p.getLeft().getName();
				}

				if (!Questions.askYNQuestion("É um " + animalName + "?", " (s/n)")) {
					if (YNanswer) {
						wasResultAnimalQuestionDone = true;
					} else {
						isAnewFeatureL = true;
					}
					break;
				} else {
					Banners.bannerEndGame(this);
					return;
				}

			}
			if (!wasResultAnimalQuestionDone && (!isAnewFeatureL)
					&& Questions.askYNQuestion("É um " + p.getName() + "?", " (s/n)")) {
				Banners.bannerEndGame(this);
				return;
			}

			if (isAnewFeatureL && p.getLeft() != null) {
				p = p.getLeft();
			}

			addNewAnimal(p);
		}

	}
	/**
	 * add a new animal to graph
	 * */
	private void addNewAnimal(Node p) {
		String newAnimalName = Questions.askNewNameQuestion(DefaultConfigs.ADD_NEW_NODE_QUESTION);

		String questionPrhase = "Em que o " + newAnimalName + " se diferencia do " + p.getName() + "?";
		//String newAnimalCaracteristic = ;
		
		

		p.setLeft(new Node(p.getName()));
		//
		Node a = new Node(newAnimalName);
		a.isAnAnimal = true;
		p.setRight(a);
		//
		p.setName(Questions.askNewNameQuestion(questionPrhase));
		p.isAnAnimal = false;

		System.out.println(DefaultConfigs.SUCCESSFULLY_NODE_ADDED);

	}

}
