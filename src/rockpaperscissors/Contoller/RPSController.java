package rockpaperscissors.Contoller;

import rockpaperscissors.View.RPSFrame;

public class RPSController
{
	private RPSFrame baseFrame;
	
	public void start()
	{
		baseFrame = new RPSFrame(this);
	}
	
}
