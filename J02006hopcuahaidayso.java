import java.util.Scanner;

public class J02006hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] a= new int[10000];
        for(int i= 0; i< n; i++)
        {
            int tmp= sc.nextInt();
            a[tmp]= 1;
        }
        for(int i= 0; i< m; i++)
        {
            int tmp= sc.nextInt();
            a[tmp]++;
        }

        for(int i= 0; i< a.length; i++)
        {
            if(a[i]> 0) System.out.print(i+ " ");
        }
    }
}
