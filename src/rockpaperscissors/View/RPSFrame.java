package rockpaperscissors.View;

import javax.swing.JFrame;
import rockpaperscissors.Contoller.RPSController;


public class RPSFrame extends JFrame
{
	private RPSController baseController;
	private RPSPanel basePanel;
	
	public RPSFrame(RPSController baseController)
	{
		this.baseController = baseController;
		basePanel = new RPSPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("ROCK, PAPER, SCISSORS");
		this.setSize(900, 680);
		this.setVisible(true);
	}
}
