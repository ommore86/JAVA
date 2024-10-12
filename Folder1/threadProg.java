class X extends Thread
{
    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("Thread X : i = " + i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j = 0; j<5; j++)
        {
            System.out.println("Thread B : j = " + j);
        }
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k = 0; k<5; k++)
        {
            System.out.println("Thread C : k = " + k);
        }
    }
}

public class threadProg {
    public static void main(String[] args) {
        X x1 = new X();
        B b1 = new B();
        C c1 = new C();
        x1.start();
        b1.start();
        c1.start();
    }
}
