package Ex1;

public class D {
    public static void main(String[] args) {
        System.out.println("main begin");
        int[] elements = new int[7];
        int i = elements[10];//array index out of bounds exception because Array index out of range: 10
        System.out.println("main end");
    }

}
