package graph.animal_game20;

/**
 * An utilitary to manipulate banners
 * 
 * @author Paulo Gervasio.
 * @author pgervasiosousa@gmail.com
 *
 */
public class Banners {

	public static void bannerInitGame() {
		System.out.println();
		System.out.println("Pense em um animal.");
		System.out.println("Agora responda:");
		System.out.println();
	}

	public static void bannerStartGame() {
		System.out.println("---------------------------------------");
		System.out.println("	Início do jogo			   			");
		System.out.println("---------------------------------------");
	}

	public static void bannerEndGame(Playable g) {
		System.out.println(DefaultConfigs.ANSWER_CORRECT);
		try {
			Thread.sleep(3000);
			for (int i = 0; i < 5; i++) {
				System.out.println("");
			}
			g.startGame();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}