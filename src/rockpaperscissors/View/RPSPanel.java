package rockpaperscissors.View;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import rockpaperscissors.Contoller.RPSController;

public class RPSPanel extends JPanel
{
	private RPSController baseController;
	private JButton SinglePlayerButton;
	private JButton SplitScreenButton;
	private SpringLayout baseLayout;
	private SinglePlayerPanel SinglePlayerPanel;
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		SinglePlayerPanel = new SinglePlayerPanel(baseController);
		SpringLayout springLayout = (SpringLayout) SinglePlayerPanel.getLayout();
		SinglePlayerButton = new JButton("SinglePlayer");
		springLayout.putConstraint(SpringLayout.NORTH, SinglePlayerButton, 10, SpringLayout.NORTH, SinglePlayerPanel);
		springLayout.putConstraint(SpringLayout.WEST, SinglePlayerButton, 322, SpringLayout.WEST, SinglePlayerPanel);
		springLayout.putConstraint(SpringLayout.SOUTH, SinglePlayerButton, 76, SpringLayout.NORTH, SinglePlayerPanel);
		springLayout.putConstraint(SpringLayout.EAST, SinglePlayerButton, 0, SpringLayout.EAST, SinglePlayerPanel);
		SinglePlayerPanel.add(SinglePlayerButton);
		SplitScreenButton = new JButton("SplitScreen");
		baseLayout.putConstraint(SpringLayout.NORTH, SplitScreenButton, 48, SpringLayout.NORTH, SinglePlayerButton);
		baseLayout.putConstraint(SpringLayout.WEST, SplitScreenButton, 44, SpringLayout.WEST, SinglePlayerPanel);
		baseLayout.putConstraint(SpringLayout.EAST, SplitScreenButton, 24, SpringLayout.WEST, SinglePlayerButton);
		SinglePlayerPanel.add(SplitScreenButton);
		

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
		private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.add(SinglePlayerPanel);
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, SinglePlayerButton, 164, SpringLayout.NORTH, SinglePlayerPanel);
			baseLayout.putConstraint(SpringLayout.WEST, SinglePlayerButton, 470, SpringLayout.WEST, SinglePlayerPanel);
			baseLayout.putConstraint(SpringLayout.SOUTH, SinglePlayerButton, 1179, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, SinglePlayerButton, -214, SpringLayout.EAST, SinglePlayerPanel);
			baseLayout.putConstraint(SpringLayout.NORTH, SinglePlayerPanel, 0, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, SinglePlayerPanel, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, SinglePlayerPanel, 0, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, SinglePlayerPanel, 0, SpringLayout.EAST, this);
		}
		
		private void setupListeners()
		{
			SinglePlayerButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					
				}
			});
		}
		
	}
	

