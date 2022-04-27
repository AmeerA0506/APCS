// National Security Agency:: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd 6
// L09: Some Folks Call It A Charades
// // 2022-04-26
// time taken: 5 hours

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GUI Frame class for the Teacher Game
 * @author cody.henrichsen
 * @version 2.1 17/09/2018
 */
public class TeacherFrame extends JFrame
{
	//Data members for the JFrame subclass instance

	/**
	 * The instance of the panel used for playing the game.
	 */
	private TeacherPanel gamePanel;

	/**
	 * Blank panel used for the CardLayout switching screens feature.
	 */
	private JPanel panelCards;

	/**
	 * The instance variable used to add a Teacher to the game.
	 */
	private StartPanelTeacher startPanel;

	/**
	 * A reference to the TeacherGame instance to allow for minimized coupling in the object structure.
	 */
	private TeacherGame controller;


	/**
	 * Builds an instance of the CelebFrame with a reference to the TeacherGame instance.
	 * @param controller A reference to a TeacherGame to share with the CelebPanel instance.
	 */
	public TeacherFrame(TeacherGame controllerRef)
	{
		//The first line of any subclass should ALWAYS be a correct call to the super constructor.
		super();
		this.controller = controllerRef;
		this.panelCards = new JPanel(new CardLayout());
		this.gamePanel = new TeacherPanel(controller);
		this.startPanel = new StartPanelTeacher(controller);
		setupFrame();

	}

	/**
	 * Configures the JFrame window subclass to add the panel and set size based information.
	 */
	private void setupFrame()
	{
		panelCards.add(gamePanel, "GAME");
		panelCards.add(startPanel, "START");
		this.setSize(800, 800);
		this.setTitle("Teacher Game");
		this.add(panelCards);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		replaceScreen("START");

		this.setVisible(true);
	}

	/**
	 * Swaps the screen between the existing panels based on the String parameter.
	 * @param screen The name of the screen to open.
	 */
	public void replaceScreen(String screen)
	{
		if(screen.equals("GAME")) {
			gamePanel.addClue(controller.sendClue());
		}
		((CardLayout)panelCards.getLayout()).show(panelCards, screen);
	}

}
