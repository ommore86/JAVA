import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=0; i<=10; i++){
            if(n==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
