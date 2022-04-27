// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// // 2022-04-26
// time taken: 5 hours

import java.util.ArrayList;

public class MovieTeacher extends Teacher{
  	/**
  	 * The list of clues for the Movie Teacher. They can be titles of texts, important characters, settings, etc...s
  	 */
  	private ArrayList<String> clueList;
    private String role;

  	/**
  	 * Builds a MovieTeacher instance with an answer and a series of clues as a String separated by commas.
  	 * @param answer The Movie Teacher
  	 * @param clues Clues for the Movie Teacher
  	 */
  	public MovieTeacher(String answer, String clues)
  	{
  		super(answer, clues);
  		processClues();
  	}

  	/**
  	 * Processes the series of clues for the MovieTeacher by adding all the values to an ArrayList<String> by
  	 * splitting the original clue to an array of String.
  	 * The original value is not impacted, thus preserving data and inheritance integrity.
  	 */
  	private void processClues()
  	{
  		String [] clues = super.getClue().split(",");
  		clueList = new ArrayList<String>();
  		for (String currentClue : clues)
  		{
  			clueList.add(currentClue);
  		}
  	}

  	/**
  	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
  	 * It recreates the clueList if the user has finished the series of clues.
  	 */
  	@Override
  	public String getClue()
  	{
  		if (clueList.size() == 0)
  		{
  			processClues();
  		}
  		String currentClue = clueList.remove(0);

  		return currentClue;
  	}


  	@Override
  	public String toString()
  	{
  		String dsc = "This is the Movie Teacher: " + getAnswer() + "\nThe clues are:\n";

  		for (String word : super.getClue().split(","))
  		{
  			dsc += word + "\n";
  		}

  		return dsc;
  	}

  }
