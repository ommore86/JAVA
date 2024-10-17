import java.awt.*;
public class Testawt
{
	Testawt()
	{
		Frame fm = new Frame();
		Label lb = new Label("Welcome to Java Graphics");
		lb.setBounds(10, 10, 100, 50);
		fm.add(lb);
		fm.setSize(300, 300);
		fm.setVisible(true);
		fm.setTitle("hello");
	}
	public static void main (String[] args)
	{
		Testawt ta = new Testawt();
	}
}	