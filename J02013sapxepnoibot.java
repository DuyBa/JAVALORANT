import java.util.Scanner;

public class J02013sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i= 0; i< n; i++) a[i]= sc.nextInt();
        int t= 1;
        while( true)
        {
            int ck= 0;
            for(int i= 1; i< n; i++)
            {
                if(a[i]< a[i- 1])
                {
                    ck= 1;
                    int tmp= a[i];
                    a[i]= a[i- 1];
                    a[i- 1]= tmp;
                }
            }
            if(ck== 0) break;
            else
            {
                System.out.printf("Buoc %d:", t);
                for(int j= 0; j< n; j++) System.out.print(" "+ a[j]);
                System.out.println("");
                t++;
            }
        }
    }
}
