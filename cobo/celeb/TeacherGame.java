// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// // 2022-04-26
// time taken: 5 hours

import java.util.ArrayList;

// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// 2022-04-26

/**
 * The framework for the Teacher Game project
 *
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class TeacherGame
{
	/**
	 * A reference to a Teacher or subclass instance.
	 */
	 private Teacher gameTeacher;  // the current one; the one that is curretly at play

	/**
	 * The GUI frame for the Teacher game.
	 */
	 public TeacherFrame gameWindow;

	/**
	 * The ArrayList of Teacher values that make up the game
	 */
	 private ArrayList<Teacher> celebGameList;

	/**
	 * Builds the game and starts the GUI
	 */
	public TeacherGame()
	{
		celebGameList=new ArrayList<Teacher>();
		gameWindow=new TeacherFrame(this);
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		celebGameList = new ArrayList<Teacher>();
		gameWindow.replaceScreen("START");
	}

	/**
	 * Determines if the supplied guess is correct.
	 *
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		return (guess==gameTeacher._name);
	}

	/**
	 * Asserts that the list is initialized and contains at least one Teacher.
	 * Sets the current Teacher as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		if (celebGameList!= null && celebGameList.size()>0){
		this.gameTeacher=celebGameList.get(0);
		gameWindow.replaceScreen("GAME");
	}
	}

	/**
	 * Adds a Teacher of specified type to the game list
	 *
	 * @param name
	 *            The name of the Teacher
	 * @param guess
	 *            The clue(s) for the Teacher
	 * @param type
	 *            What type of Teacher
	 */
	 public void addTeacher(String name, String guess, String type)
 	{
 		if (validateTeacher(name) && validateClue(guess, type)) {
 			if (type.trim().equalsIgnoreCase("Literature")) {
 				celebGameList.add(new LiteratureTeacher(name, guess));
 			}
 			else if (type.trim().equalsIgnoreCase("Movie")) {
 				celebGameList.add(new MovieTeacher(name, guess));
 			}
 		celebGameList.add(new Teacher(name, guess));
 		}
 	}

 	/**
 	 * Validates the name of the Teacher. It must have at least 4 characters.
 	 * @param name The name of the Teacher
 	 * @return If the supplied Teacher is valid
 	 */
 	public boolean validateTeacher(String name)
 	{
 		name = name.trim();
 		return name.length() >= 4;
 	}

 	/**
 	 * Checks that the supplied clue has at least 10 characters or is a series of clues
 	 * This method would be expanded based on your subclass of Teacher.
 	 * @param clue The text of the clue(s)
 	 * @param type Supports a subclass of Teacher
 	 * @return If the clue is valid.
 	 */
 	public boolean validateClue(String clue, String type)
 	{
 		clue = clue.trim();
 		if (type.trim().equalsIgnoreCase("literature") || type.trim().equalsIgnoreCase("sports")) {
 				String[] temp = clue.split(",");
 				if (temp.length > 1) {
 					return true;
 				}
 				else {
 					return false;
 				}
 			}

 		return clue.length() >= 10;
 	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 *
	 * @return Remaining number of celebrities
	 */
	public int getTeacherGameSize()
	{
		return celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 *
	 * @return The String clue from the current Teacher.
	 */
	public String sendClue()
	{
		return gameTeacher._clue;
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 *
	 * @return The String answer from the current Teacher.
	 */
	public String sendAnswer()
	{
		return gameTeacher._name;
	}
}
