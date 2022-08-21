import java.util.Scanner;
import java.lang.Math;
public class J01014uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t--> 0)
        {
            long a= sc.nextLong();
            if( a% 2== 0)
            {
                while( a% 2== 0) a/= 2;
                if( a== 1) System.out.println(2);
            }
            for( int i= 3; i<= Math.sqrt(a); i++)
            {
                if( a% i== 0)
                {
                    while( a% i== 0) a/= i;
                    if( a== 1) 
                    {
                        System.out.printf("%d", i);
                        System.out.println("");
                        break;
                    }
                }
            }
            if( a> 2) System.out.println(a);
        }
    }
}
