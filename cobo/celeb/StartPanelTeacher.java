// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// // 2022-04-26
// time taken: 5 hours

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * The start screen for the TeacherGame app.
 *
 * @author cody.henrichsen
 * @version 2.1 18/09/2018 Refactored away validation to controller.
 */
public class StartPanelTeacher extends JPanel
{
  /**
   * Reference to the Game to call methods.
   */
  private TeacherGame controller;

  /**
   * The layout manager for the screen.
   */
  private SpringLayout panelLayout;

  /**
   * Logical container for the RadioButtons to guarantee only one is selected
   * at a time.
   */
  private ButtonGroup typeGroup;

  /**
   * RadioButton for the default type.
   */
  private JRadioButton TeacherRadio;

  /**
   * RadioButton for the Teacher type.
   */
  private JRadioButton literatureRadio;
    /**
     * RadioButton for the Teacher type.
     */
    private JRadioButton movieRadio;


  /**
   * Customize the JRadioButton for the class created sub class
   */

  /**
   * Label to guide the user to what should be inputted.
   */
  private JLabel clueLabel;
  private JLabel answerLabel;


  /**
   * Label for displaying the current number of celebrities added to the game
   */
  private JLabel TeacherCountLabel;

  /**
   * Textfield to type in the answer for the Teacher.
   */
  private JTextField answerField;

  /**
   * Textfield to type in the clue for the Teacher.
   */
  private JTextField clueField;

  /**
   * Button used to verify and add a Teacher to the ArrayList of Teacher for the game
   */
  private JButton addTeacherButton;

  /**
   * Button used to start the game.
   */
  private JButton startButton;

  /**
   * String to populate the clueLabel if Teacher is picked.
   */
  private String TeacherClue;
  private String TeacherAnswer;

  /**
   * String to populate the clueLabel if Literature Teacher is picked.
   */
  private String literatureClue;

  /**
   * String to populate the clueLabel if Class Generated Teacher is picked.
   */
   private String movieClue;


  /**
   * String used for static text in label.
   */
  private String countLabelText;

  /**
   * The current number of celebrities added to the game
   */
  private int TeacherCount;


  /**
   * Constructs a StartPanel with a reference to the game passed as a
   * parameter to be used as a data member.
   *
   * @param controller
   *            The reference to the game
   */
  public StartPanelTeacher(TeacherGame controller)
  {
    super();
    this.controller = controller;
    this.panelLayout = new SpringLayout();
    this.typeGroup = new ButtonGroup();
    this.TeacherRadio = new JRadioButton("Teacher");
    this.literatureRadio = new JRadioButton("Literature Teacher");
    this.movieRadio = new JRadioButton("Movie Teacher");
    this.TeacherClue = "Enter the clue for the Teacher";
    this.TeacherAnswer = "Enter the name of the Teacher";
    this.literatureClue = "Enter the clues for the literature celeb separated by commas";
    this.movieClue = "Enter the clues for the movie celeb separated by commas";

    this.clueLabel = new JLabel(TeacherClue);
    this.answerLabel = new JLabel(TeacherAnswer);

    this.answerField = new JTextField("Type Teacher here (4 letters minimum)");
    this.clueField = new JTextField("Enter Teacher clue here (10 letters minimum)");
    this.addTeacherButton = new JButton("Add current Teacher");
    this.startButton = new JButton("Start Teacher game");
    this.TeacherCount = 0;
    this.countLabelText = "Current Teacher Count: " + TeacherCount;
    this.TeacherCountLabel = new JLabel(countLabelText);

    setupPanel();
    setupLayout();
    setupListeners();
  }

  /**
   * Validation method for the text to create a Teacher instance.
   *
   * @param answerText
   *            The name of the Teacher. Validation requires at least 4
   *            characters.
   * @param clueText
   *            The text for the clue. Validation depends on the selected
   *            Teacher type, but at least 10 characters are required.
   * @return Whether the appropriate text amounts are filled and the correct
   *         type of clue is given.
   */
  private boolean validate(String answerText, String clueText)
  {
    boolean validClue = false;
    boolean validAnswer = false;

    if (literatureRadio.isSelected())
    {
      validClue = controller.validateClue(clueText, "Literature");
    }
    else if (movieRadio.isSelected())
      {
        validClue = controller.validateClue(clueText, "Movie");
      }
    else
    {
      validClue = controller.validateClue(clueText, "");
    }

    if (answerText.length() > 4)
    {
      validAnswer = controller.validateTeacher(answerText);
    }

    return (validClue && validAnswer);
  }

  /**
   * Adds all components to the StartPanel and uses the SpringLayout variable,
   * panelLayout, as the layout manager.
   */
  private void setupPanel()
  {
    this.setLayout(panelLayout);
    this.add(clueLabel);
    this.add(answerLabel);
    this.add(TeacherRadio);
    this.add(literatureRadio);
    this.add(movieRadio);
    this.add(answerField);
    this.add(clueField);
    this.add(startButton);
    this.add(TeacherCountLabel);
    this.add(addTeacherButton);

    // Adds the RadioButtons to the group so only one can be selected.
    TeacherRadio.setSelected(true);
    startButton.setEnabled(true);
    typeGroup.add(TeacherRadio);
    typeGroup.add(literatureRadio);
    typeGroup.add(movieRadio);



  }

  /**
   * Uses the Springlayout constraint system to place all GUI components on
   * screen. All constraints grouped together to keep code clean and
   * maintainable.
   */
  private void setupLayout()
  {
    panelLayout.putConstraint(SpringLayout.SOUTH, answerLabel, 150, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.WEST, answerLabel, 0, SpringLayout.WEST, TeacherRadio);

    panelLayout.putConstraint(SpringLayout.WEST, clueLabel, 0, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.NORTH, TeacherRadio, 15, SpringLayout.NORTH, this);
    panelLayout.putConstraint(SpringLayout.WEST, TeacherRadio, 15, SpringLayout.WEST, this);
    panelLayout.putConstraint(SpringLayout.EAST, addTeacherButton, 0, SpringLayout.EAST, startButton);
    panelLayout.putConstraint(SpringLayout.NORTH, addTeacherButton, 20, SpringLayout.SOUTH, clueField);
    panelLayout.putConstraint(SpringLayout.WEST, addTeacherButton, 0, SpringLayout.WEST, TeacherRadio);

    panelLayout.putConstraint(SpringLayout.NORTH, startButton, 20, SpringLayout.SOUTH, addTeacherButton);
    panelLayout.putConstraint(SpringLayout.NORTH, TeacherCountLabel, 0, SpringLayout.NORTH, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.EAST, TeacherCountLabel, -45, SpringLayout.EAST, this);

    //Put your custom radio button info here

    panelLayout.putConstraint(SpringLayout.NORTH, literatureRadio, 10, SpringLayout.SOUTH, movieRadio);
    panelLayout.putConstraint(SpringLayout.WEST, movieRadio, 0, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.NORTH, movieRadio, 40, SpringLayout.SOUTH, TeacherRadio);


    panelLayout.putConstraint(SpringLayout.WEST, literatureRadio, 0, SpringLayout.WEST, TeacherRadio);

    panelLayout.putConstraint(SpringLayout.NORTH, clueLabel, 10, SpringLayout.SOUTH, answerField);
    panelLayout.putConstraint(SpringLayout.NORTH, answerField, 40, SpringLayout.SOUTH, literatureRadio);
    panelLayout.putConstraint(SpringLayout.WEST, answerField, 0, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.EAST, answerField, -15, SpringLayout.EAST, this);

    panelLayout.putConstraint(SpringLayout.WEST, clueField, 0, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.SOUTH, clueField, 55, SpringLayout.SOUTH, answerField);
    panelLayout.putConstraint(SpringLayout.EAST, clueField, 0, SpringLayout.EAST, answerField);
    panelLayout.putConstraint(SpringLayout.WEST, startButton, 0, SpringLayout.WEST, TeacherRadio);
    panelLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, answerField);

  }

  /**
   * Used to link all Listeners to the associated GUI components.
   */
  private void setupListeners()
  {
    /**
     * Links the submitButton to the validation and submit code. Provides
     * user input if information is not valid.
     */
    startButton.addActionListener(new ActionListener()
                                    {
      public void actionPerformed(ActionEvent mouseClick)
      {
        controller.play();
      }
    });

    addTeacherButton.addActionListener(new ActionListener()
                                           {
      public void actionPerformed(ActionEvent mouseClick)
      {
        answerField.setBackground(Color.WHITE);
        clueField.setBackground(Color.WHITE);
        if (validate(answerField.getText(), clueField.getText()))
        {
          addToGame();
        }
        else
        {
          invalidInput();
        }
        TeacherCount = controller.getTeacherGameSize();
        TeacherCountLabel.setText(countLabelText + TeacherCount);
      }
    });

    /**
     * Adds listeners to the radio buttons using the Java 8+ Lambda structure
     * for short code.
     *
     */
    literatureRadio.addActionListener(select -> clueLabel.setText(literatureClue));
    TeacherRadio.addActionListener(select -> clueLabel.setText(TeacherClue));
    TeacherRadio.addActionListener(select -> clueLabel.setText(movieClue));


  }

  private void invalidInput()
  {
    answerField.setText("Type in the Teacher!!");
    answerField.setBackground(Color.RED);
    clueField.setText("Type in the clue");
    clueField.setBackground(Color.RED);
  }

  private void addToGame()
  {
    String type = "Teacher";
    if (literatureRadio.isSelected())
    {
      type = "Literature";
    }
    else if (movieRadio.isSelected())
    {
      type = "Movie";
    }
    String answer = answerField.getText().trim();
    String clue = clueField.getText().trim();
    answerField.setText("");
    clueField.setText("");
    controller.addTeacher(answer, clue, type);
    startButton.setEnabled(true);
  }

}
