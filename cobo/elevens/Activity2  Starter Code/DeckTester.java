// Random-Access Memory: Ryan Lau, Ameer Alnasser, Melody Lew
// APCS pd06
// L07: But These Go Up To Eleven
// 2022-03-21m
// time spent: 3.0 hrs

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"hearts", "spades"};
		int[] pointValues = {1, 2, 3};
		Deck random = new Deck(ranks, suits, pointValues);
		System.out.println(random);

		String[] ranks1 = {"ace", "two", "three"};
		String[] suits1 = {"diamonds", "clubs"};
		int[] pointValues1 = {4, 5, 6};
		Deck access = new Deck(ranks1, suits1, pointValues1);
		System.out.println(access.isEmpty());
		System.out.println(access.size());
		while (access.deal() != null){
			System.out.println(access.size());
		}
		System.out.println(access.isEmpty());
		System.out.println(access);

		String[] ranks2 = {"four", "five", "six"};
		String[] suits2 = {"hearts", "clubs"};
		int[] pointValues2 = {7, 8, 9};
		Deck memory = new Deck(ranks2, suits2, pointValues2);


	}
}
