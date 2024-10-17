import java.awt.*;
public class SimpleFrame extends Frame
{
	SimpleFrame()
	{
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setTitle("Hello");
	}

	public static void main (String args[])
	{
		SimpleFrame fm = new SimpleFrame();
	}
}