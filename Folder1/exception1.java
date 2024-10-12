public class exception1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try
        {
            int x = a/b;
            System.out.println("x = " + x);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero");
        }
        finally
        {
            System.out.println("End of program");
        }
    }
}
