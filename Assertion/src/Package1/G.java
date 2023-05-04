package Package1;
//Best practices
public class G {
        public static void main(String[] args)
        {
            System.out.println(1);
            assert test();//calling test method
            System.out.println(2);
        }
        static boolean test()
        {
            return true;//boolean statement
        }
}
