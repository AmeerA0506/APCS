// Random-Access Memory: Ryan Lau, Ameer Alnasser, Melody Lew
// APCS pd06
// L07: But These Go Up To Eleven
// 2022-03-21m
// time spent: 3.0 hrs

/**
 * This is a class that plays the GUI version of the Thirteens game.
 * See accompanying documents for a description of how Thirteens is played.
 */
public class ThirteensGUIRunner {

	/**
	 * Plays the GUI version of Thirteens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
