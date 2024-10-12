import java.util.Scanner;
public class CWH_19_PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // Question 2
        byte m1, m2, m3;
        System.out.println("Enter your name in Physics: ");
        m1 = sc.nextByte();
        System.out.println("Enter your name in Chemistry: ");
        m2 = sc.nextByte();
        System.out.println("Enter your name in Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall Percentage is: " + avg);
        if (avg>=40 && m1>= 33 && m2 >=33 && m3 >= 33)
        {
            System.out.println("Congratulations, You have been promoted!");
        }
        else
        {
            System.out.println("Sorry, you have not been promoted!");
        }
        */

        /*
        // Question 3
        System.out.println("Enter your income in lakhs per annum: ");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5) {
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
        */

        /*
        // Question 4
        System.out.println("Enter no. of day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }
        */

        // Question 5
        // Write a Java program to find whether a year entered by the user is a leap year or not...
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if (year%2==0)
        {
            System.out.println("The entered year is a leap year!");
        }
        else
        {
            System.out.println("The entered year is not a leap year!");
        }

        /*
        // Question 6
        System.out.println("Enter a Website: ");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
         */
    }
}
