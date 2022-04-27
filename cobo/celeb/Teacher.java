// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// // 2022-04-26
// time taken: 5 hours

/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Teacher
{
	/**
	 * The clue to determine the celebrity
	 */
	protected String _clue;
	/**
	 * The answer or name of the celebrity.
	 */
	protected String _name;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Teacher(String answer, String clue)
	{
    _clue=clue;
    _name=answer;
	}
  public Teacher(){
    _clue="CS Teacher at Stuyvesant";
    _name="Topher Mykolyk";
  }
	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return _clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return=
	 */
	public String getAnswer()
	{
		return _name;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		_clue=clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		_name=answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return _name+ ": "+_clue;
	}
	public static void main(String[] args){
    Teacher billy=new Teacher("Billie Eilish", "sings hit song bad guy and is a grammy-award winning artist");
    System.out.println(billy);
  }
}
