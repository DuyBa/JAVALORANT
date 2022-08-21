import java.util.Scanner;

public class J01007kiemtrasofibaonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long[] a= new long[100];
        a[0]= 0;
        a[1]= 1;
        for(int i= 2; i<= 92; i++)
            a[i]= a[i- 1]+ a[i- 2];
        int t= sc.nextInt();
        while( t--> 0)
        {
            int ck= 0;
            long n= sc.nextLong();
            for(int i=0; i<= 92; i++)
            {
                if(a[i]== n)
                {
                    System.out.println("YES");
                    ck= 1;
                    break;
                }
            }
            if( ck== 0) System.out.println("NO");
        }
    }
}
