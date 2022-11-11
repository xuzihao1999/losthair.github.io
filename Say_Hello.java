import java.util.*;
public class Say_Hello {
    public static void main(String args[]) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = reader.next();
            System.out.println("Hello,Mr."+name+"!how old are you?");
            int age = reader.nextInt();
            System.out.println("Ready?"+"You said you are"+age+"you look so young!");
    }
}
