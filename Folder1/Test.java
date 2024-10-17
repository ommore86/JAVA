import java.awt.*;
import javax.swing.*;
import java.applet.*;

/*<applet code="Test" width=300 height=400></applet>*/

public class Test extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		showStatus("Mouse Clicked");
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		showStatus("Mouse Pressed");
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		showStatus("Mouse Released");
		repaint();
	}
	
	public void mouseEntered(MouseEvent me)
	{
		showStatus("Mouse Entered");
		repaint();
	}
	
	public void mouseExited(MouseEvent me)
	{
		showStatus("Mouse Exited");
		repaint();
	}
}