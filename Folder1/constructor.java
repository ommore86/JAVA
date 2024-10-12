public class constructor {
    int x, y;
    constructor()
    {
        x = 10;
        y = 20;
    }

    constructor(int a, int b)
    {
        x = a;
        y = b;
    }
    public static void main(String[] args) {
        constructor obj = new constructor();
        constructor obj1 = new constructor(1, 2);
        System.out.println("x: " + obj.x);
        System.out.println("y: " + obj.y);
        System.out.println("x: " + obj1.x);
        System.out.println("y: " + obj1.y);
    }
}
