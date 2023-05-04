package Ex1;

public class C {
    public static void main(String[] args) {
        System.out.println("main begin");
        String s1 = null;//cannot invoke length because s1 is null.
        int i = s1.length();// Null pointer exception
        System.out.println("main end");
    }
}
