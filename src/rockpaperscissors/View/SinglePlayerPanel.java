package rockpaperscissors.View;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import rockpaperscissors.Contoller.RPSController;

public class SinglePlayerPanel extends JPanel
{
	private RPSController baseController;
	private JButton Rock;
	private JButton Paper;
	private JButton Scissors;
	private SpringLayout baseLayout;
	
	public SinglePlayerPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		Rock = new JButton("Rock");
		baseLayout.putConstraint(SpringLayout.WEST, Rock, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, Rock, -124, SpringLayout.SOUTH, this);
		Paper = new JButton("Paper");
		baseLayout.putConstraint(SpringLayout.NORTH, Paper, 147, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, Paper, -124, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Rock, -38, SpringLayout.WEST, Paper);
		baseLayout.putConstraint(SpringLayout.EAST, Paper, -144, SpringLayout.EAST, this);
		Scissors = new JButton("Scissors");
		baseLayout.putConstraint(SpringLayout.NORTH, Scissors, 147, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, Scissors, 344, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, Scissors, -124, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Scissors, -10, SpringLayout.EAST, this);


		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
		private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.add(Rock);
			this.add(Paper);
			this.add(Scissors);
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.WEST, Paper, 173, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, Rock, 147, SpringLayout.NORTH, this);
		
		}
		
		private void setupListeners()
		{

		}
		
	}
	