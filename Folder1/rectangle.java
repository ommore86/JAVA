package rect;
public class rectangle
{
	int length;
	int breadth;

	public void setdata(int l, int b)
	{
	length = l;
	breadth=b;
	}
	
	public void area()
	{
	int a = length * breadth;
	System.out.println("area = " + a);
}
}