package graphic.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import graphic.controller.GUIFrameworkController;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIFrameworkController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public GUIPanel(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;
		
		colorButton = new JButton("Color!");
		randomButton = new JButton("Random");
		
		setupPanel();
		setupLayout();
		setupListener();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListener()
	{
		
	}

}
