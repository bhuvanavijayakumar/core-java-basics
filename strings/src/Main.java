public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
                String s1 = "java";
                String s2= "java";
                String s3="c";
                String s4="python";
                System.out.println((s1 == s2));
                System.out.println((s2 == s4));
                System.out.println((s2 == s3));
                System.out.println((s4 == s3));
                String s6= new String ("python");
                String s7= new String ("python");
                System.out.println((s6 == s7));// it is in non-constant pool which is stored in heap memory
                System.out.println((s6.equals(s7)));
        System.out.println((s1.equals(s2)));
        System.out.println((s4.equals(s7)));
        System.out.println((s4 == s7));


    }

    }
