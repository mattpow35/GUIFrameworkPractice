package graphic.view;

import javax.swing.JPanel;
import graphic.controller.GUIFrameworkController;

public class GUIPanel extends JPanel
{
	private GUIFrameworkController baseController;
	
	public GUIPanel(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;
	}

}
