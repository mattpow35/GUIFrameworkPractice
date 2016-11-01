package graphic.view;

import javax.swing.JFrame;
import graphic.controller.GUIFrameworkController;

public class GUIFrame extends JFrame
{
	private GUIFrameworkController baseController;
	
	public GUIFrame(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;
	}

}
