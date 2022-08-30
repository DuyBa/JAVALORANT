import java.util.Arrays;
import java.util.Scanner;

public class J02016bobasopytago {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc.nextInt();
            long[] a= new long[n];
            for(int i= 0; i< n; i++) 
            {
                a[i]= sc.nextLong();
                a[i]= a[i]* a[i];
            }
            Arrays.sort(a);
            int ck= -1;
            for(int i= 0; i< n-2; i++)
            {
                for(int j= i+ 1; j< n- 1; j++)
                {
                    int l= bns(a, j+ 1, n, a[i]+ a[j]);
                    if(l!= -1)
                    {
                        System.out.println("YES");
                        ck= 0;
                        break;
                    }
                }
                if(ck== 0) break;
            }
            if(ck== -1) System.out.println("NO");
        }
    }

    public static int bns(long[] a, int l, int n, long x) {
        int r= n- 1;
        while(l<= r)
        {
            int m= (l+ r)/ 2;
            if(a[m]== x) return m;
            else if(a[m]< x) l= m+ 1;
            else r= m- 1;
        }
        return -1;
    }
}
