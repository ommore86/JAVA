public class CWH_09_Associativity {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
            30-34/2
            30-17
            13
         */
        int b = 60/5-34*2;
        /*
            12-34*2
            12-68
            -56
         */

        System.out.println(a);
        System.out.println(b);

        //Quick Quiz
        int x = 6;
        int y = 1;
        int z = x * y / 2;
        System.out.println(z);

        int l = 5;
        int m = 1;
        int n = 4;
        int k = (m*m-4*l*n)/(2*l); //Run with and without braces
        System.out.println(k);
    }
}
