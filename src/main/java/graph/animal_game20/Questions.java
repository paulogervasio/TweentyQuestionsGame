package graph.animal_game20;

import java.util.Scanner;

/**
 * An utilitary to manipulate user interactions
 * 
 * @author Paulo Gervasio.
 * @author pgervasiosousa@gmail.com
 *
 */
public class Questions {

	private static Scanner scanner;

	private static String captureAnswerFromInput() {

		String answer = "";
		scanner = new Scanner(System.in);
		answer = scanner.nextLine();

		return answer;
	}

	public static Boolean askYNQuestion(String question, String concatExtra) {

		System.out.println(question + concatExtra);
		String answer = captureAnswerFromInput();

		while ((!answer.equals("s") && !answer.equals("n"))) {
			System.out.println(DefaultConfigs.DEFAULT_INPUT_ANSWER_ERROR);
			answer = captureAnswerFromInput();
		}

		return answer.equals("s") ? true : false;
	}

	/**
	 * Return an string with the user answer
	 */
	public static String askNewNameQuestion(String question) {

		System.out.println(question);

		String answer = captureAnswerFromInput();
		return answer;
	}
}
