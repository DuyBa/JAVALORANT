import java.util.Scanner;
import java.lang.Math;

/**
 * J01004songuyento
 */
public class J01004songuyento {
    public static int ck(long n)
    {
        if(n< 2) return 0;
        for(int i= 2; i<= Math.sqrt(n); i++)
            if(n% i== 0) return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t> 0)
        {
            long n= sc.nextLong();
            if( ck(n)== 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}