import java.util.Scanner;
public class CWH_12_PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);

        //Question 2
        //Encrypting the grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //Question 3
        int x = sc.nextInt();
        System.out.println(x>8);

        //Question 4
        int v = 1;
        int u = 2;
        int s = 4;
        float r = (v*v) - (u*u) / (2*a*s);
        System.out.println(r);
    }
}
