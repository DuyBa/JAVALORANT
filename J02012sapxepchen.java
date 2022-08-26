import java.util.Scanner;

public class J02012sapxepchen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i= 0; i< n; i++) a[i]= sc.nextInt();
        System.out.printf("Buoc 0: %d", a[0]);
        System.out.println("");
        for(int i= 1; i< n; i++)
        {
            int k= a[i], j= i- 1;
            while(j>= 0&& k< a[j])
            {
                a[j+ 1]= a[j];
                j--;
            }
            a[j+ 1]= k;
            System.out.printf("Buoc %d:", i);
            for(int h= 0; h<= i; h++) System.out.print(" "+ a[h]);
            System.out.println("");
        }
    }
}
