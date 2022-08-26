import java.util.Scanner;

public class J02022soxacach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc.nextInt();
            int[] a= new int[n], ck= new int[1000];
            bk(0, n, a, ck);
        }
    }

    public static void bk(int i, int n, int[] a, int[] ck) {
        for(int j= 1; j<= n; j++)
        {
            if(ck[j]== 0)
            {
                ck[j]= 1;
                a[i]= j;
                if(i== n-1) out(n, a);
                else bk(i+ 1, n, a, ck);
                ck[j]= 0;
            }
        }
    }

    public static void out(int n, int[] a) {
        if(ck(n, a)== 1)
        {
            System.out.println("");
            for(int i= 0; i< n; i++)
            {
                System.out.print(a[i]);
            }
            
        } 
    }

    public static int ck(int n, int[] a) {
        for(int i= 1; i< n; i++)
        {
            if(Math.abs(a[i]- a[i- 1])== 1) return 0;
        }
        return 1;
    }
}
