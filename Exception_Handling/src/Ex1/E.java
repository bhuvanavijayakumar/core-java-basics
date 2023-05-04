package Ex1;

public class E {
    public static void main(String[] args) {
        System.out.println("main begin");
        Object obj = new Object();
        String s1 = (String) obj;//casting object to string will produce 'class cast exception' for any non-null value
        System.out.println("main end");
    }
}
