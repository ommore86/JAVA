import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();

        if(n%2==0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
