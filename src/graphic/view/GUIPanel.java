package graphic.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import graphic.controller.GUIFrameworkController;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanel extends JPanel
{
	private GUIFrameworkController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random");
		baseLayout = new SpringLayout();
		

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -10, SpringLayout.EAST, this);
	}
	
	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue =(int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.MAGENTA);
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackground();
			}
		});
	}

}
