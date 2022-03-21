// Random-Access Memory: Ryan Lau, Ameer Alnasser, Melody Lew
// APCS pd06
// L07: But These Go Up To Eleven
// 2022-03-21m
// time spent: 3.0 hrs

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card random = new Card ("eight", "hearts", 10);
		Card access = new Card ("eight", "hearts", 10);
		Card memory = new Card ("seven", "spades", 15);

		System.out.println(random.rank());
		System.out.println(access.suit());
		System.out.println(memory.pointValue());

		System.out.println(random.matches(access));
		System.out.println(random.matches(memory));

		System.out.println(random);
	}
}
