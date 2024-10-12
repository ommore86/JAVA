import java.util.*;
public class array_of_objects {
    Scanner sc = new Scanner(System.in);
    String name;
    int marks;
    void get()
    {
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        array_of_objects[] obj = new array_of_objects[5];
        for (int i = 0; i<5; i++)
        {
            obj[i] = new array_of_objects();
        }
        for (int i = 0; i<5; i++)
        {
            obj[i].get();
        }
        for (int i = 0; i<5; i++)
        {
            obj[i].display();
        }

    }
}
