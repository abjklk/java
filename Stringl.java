import java.util.*;

public class Stringl {
    public static void main(String[] args) {
        // String a = "asd";
        // System.out.println(a.concat("ggfg"));

       // StringBuffer b = new StringBuffer("Hellooooooo ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
        String u = in.nextLine();
        String username = new String(u);
        // System.out.println(username);
        System.out.println("Enter email");
        u=in.nextLine();
        String email = new String(u);
        // System.out.println(email);
        System.out.println("Enter pass");
        u=in.nextLine();
        StringBuffer pass = new StringBuffer(u);

        if(username.isEmpty())
        {
            System.out.println("Empty username");
        }
        else
        {
            if(email.contains("@") && email.contains(".com"))
            {
                System.out.println("yes!");
            }
            else
            {
                System.out.println("Wrong Email");
            }
        }
        
    }
    
}