package Package1;

public class I {
    public static void main(String[] args)
    {
        System.out.println(1);
        assert true : test();// method calling statement other than void.
        System.out.println(2);
    }
    static int test()
    {
        return 10;
    }
}
