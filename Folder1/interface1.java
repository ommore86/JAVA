class student
{
    int roll;
    String name;
    student(int n, String a)
    {
        roll = n;
        name = a;
    }
}

interface marks
{
    int m1 = 90;
    int m2 = 95;
}

class print extends student implements marks
{
    print(int n, String a)
    {
        super(n,a);
    }
    void display()
    {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks1 = "+ m1);
        System.out.println("Marks2 = "+ m2);
        System.out.println("Total = "+ (m1+m2));
    }
}

public class interface1 {
    public static void main(String[] args) {
        print p = new print(10, "om");
        p.display();
    }
}
