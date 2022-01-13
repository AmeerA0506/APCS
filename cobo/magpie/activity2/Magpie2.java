// Team Aliens Arriving Naughtily: Nakib Abedin + Ameer Alnasser + Alif Rahman
// APCS pd06
// HW56: Turing Training Wheels
// 2022-1-12

/*
Explain
What happens when more then one key word appears in a String?
The keyword that came first in the chain of else if statments will be the one that the chatbot responds to.

Activity 2 Question 1:
A: The problem is that "no" is included in "know." This means that even though the user didn't use the word "no," the chat bot thinks the user used the keyword. We can address this by checking for spaces before and after the keyword. If there are no spaces, then the user used a different word that has the keyword within it.
*/
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("tofr") >= 0 || statement.indexOf("mykolyk") >= 0){
			response = "He sounds like a good teacher.";
		}

		else if (statement.indexOf("sad") >= 0 || statement.indexOf("tired") >= 0){
			response = "So am I :(";
		}
		else if (statement.indexOf("grades") >= 0){
			response = "Quit worrying about grades";
		}
		else if (statement.indexOf("relaxation") >= 0){
			response = "Sounds very... fun";
		}
		else if (statement.trim().length()==0){
			response = "Say something please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4){
			response = "Gee willikersd!";
		}
		else if (whichResponse == 5){
			response = "Wow, that's really cool!";
		}

		return response;
	}
}
