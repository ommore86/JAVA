import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

public class AppletFrame extends Applet
{
	SampleFrame f;
	public void init() {
		f = new SampleFrame("A Frame Window");
		f.setSize(250, 250);
		f.setVisible(true);
	}
	public void start() {
		f.setVisible(true);
	}
	public void stop() {
		f.setVisible(false);
	}
	public void paint(Graphics g) {
		g.drawString("This is in applet window", 10, 20);
	}
	public static void main(String[] args) {
		
	}
}

class SampleFrame extends Frame {
	SampleFrame(String title) {
		super(title);
	}
	public void paint(Graphics g) {
		g.drawString("This is in Frame Window", 10, 40);
	}
}