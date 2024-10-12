import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        int a = 3;
        v.add(10);
        v.add(20);
        v.addElement(new Integer(50));
        v.add("Java");
        v.addElement(a);

        System.out.println("array is: " + v);
    }
}
