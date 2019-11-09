
import java.util.*;

public class vote {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<20;i++)
        {
            int x=obj.nextInt();
            a[x]+=1;
        }
        System.out.println("Result\n");
        int max=a[0];
        for(int j=0;j<5;j++)
        {
            System.out.println(a[j]);
        }
    }
    
}