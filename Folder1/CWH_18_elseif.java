import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // ......else-if ladder......
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>56)
        {
            System.out.println("You are experienced!");
        }
        else if(age>46)
        {
            System.out.println("You are semi-experienced!");
        }
        else if (age>36)
        {
            System.out.println("You are semi-semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
        */

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        switch (age)
        {
            case 18:
                System.out.println("You are going to be an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 68:
                System.out.println("You are going to get Retired!");
                break;
            default:
                System.out.println("Enjoy your Life!");
                break;
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
