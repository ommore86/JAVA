import java.awt.*;
public class RandomAccessFile
{
    RandomAccessFile()
    {
        Frame fm = new Frame();
        Label lb = new Label("Welcome to Java Graphics");
        lb.setBounds(10, 10, 100, 50);
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setVisible(true);
    }
    public static void main (String[] args)
    {
        RandomAccessFile ta = new RandomAccessFile();
    }
}	