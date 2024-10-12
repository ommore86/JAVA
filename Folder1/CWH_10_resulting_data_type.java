public class CWH_10_resulting_data_type {
    public static void main(String[] args) {
        /*  r-result, b-byte, s-short, d-double, i-integer, c-character, l-long
            R = b + s -> int
            R = s + i -> int
            R = l + f -> float
            R = i + f -> float
            R = c + i -> int
            R = c + s -> int
            R = l + d -> double
            R = f + d -> double
         */
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);

        //Increment and Decrement
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

//        int y = 7;
//        int x = ++y + 8;
//        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);
    }
}
