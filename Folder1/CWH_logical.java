public class CWH_logical {
    public static void main(String[] args) {
       // AND operator...........
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if(a && b && c)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        // OR operator
        boolean a1 = false;
        boolean b1 = false;
        boolean c1 = false;
        if(a1 || b1 || c1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        // NOT operator
        boolean x = true;
        boolean y = false;
        System.out.println("For Logical NOT");
        System.out.println("Not(x) is ");
        System.out.println(!x);
        System.out.println("Not(y) is ");
        System.out.println(!y);
    }
}
