class superClass{
    public void print()
    {
        System.out.println("Printed in SuperClass");
    }
}

class sub extends superClass{
    @Override
    public void print() {
        super.print();
        System.out.println("Printed in SubClass");
    }
}

public class inheritance {
    public static void main(String[] args)
    {
        sub s = new sub();
        s.print();
    }
}
