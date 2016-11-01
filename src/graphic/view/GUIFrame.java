package graphic.view;

import javax.swing.JFrame;
import graphic.controller.GUIFrameworkController;
import java.awt.Dimension;

public class GUIFrame extends JFrame
{
	private GUIFrameworkController baseController;
	
	public GUIFrame(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}
