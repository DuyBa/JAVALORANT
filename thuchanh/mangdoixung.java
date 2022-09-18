import java.util.Scanner;

public class mangdoixung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc.nextInt();
            long[] a= new long[n];
            for(int i= 0; i< n; i++) a[i]= sc.nextLong();
            if(ck(a)== 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static int ck(long[] a)
    {
        int c= 0, d= a.length- 1;
        while(c< d)
        {
            if(a[c]!= a[d]) return 0;
            c++; d--;
        }
        return 1;
    }
}
