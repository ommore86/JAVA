import java.util.Scanner;
public class CWH_06_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");

        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float m5 = sc.nextFloat();

        float per = (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.print("The Percentage of 5 subjects is: " + per);
    }
}
