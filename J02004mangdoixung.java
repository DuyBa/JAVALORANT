import java.util.Scanner;

/**
 * J02004mangdoixung
 */
public class J02004mangdoixung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc.nextInt();
            int[] a= new int[n];
            for(int i=0; i< n; i++) a[i]= sc.nextInt();
            System.out.println(ck(a));
        }
    }


    public static String ck(int[] a) {
        int c= 0, d= a.length- 1;
        while (c< d)
        {
            if(a[c]!= a[d]) return "NO";
            c++;
            d--;
        }
        return "YES";
    }
}