import java.util.*;
public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks(out of 100): ");
        int marks = sc.nextInt();

        if(marks<0 || marks>100){
            System.out.println("Invalid Input");
        }

        switch (marks/10) {
            case (10):
            case (9):
                System.out.println("A+ Grade");
                break;
            case (8):
                System.out.println("A Grade");
                break;
            case (7):
                System.out.println("B Grade");
                break;
            case (6):
                System.out.println("C Grade");
                break;
            case (5):
                System.out.println("D Grade");
                break;
            default:
                System.out.println("Fail!");
        }
    }
}
