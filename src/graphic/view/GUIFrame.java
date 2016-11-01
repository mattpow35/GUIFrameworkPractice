package graphic.view;

import javax.swing.JFrame;
import graphic.controller.GUIFrameworkController;
import java.awt.Dimension;

public class GUIFrame extends JFrame
{
	private GUIFrameworkController baseController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIFrameworkController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("WOW a window");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}
