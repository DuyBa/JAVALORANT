import java.util.Scanner;

public class J02020lietketohop {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] c= new int[11];
        int n= sc.nextInt();
        int m= sc.nextInt();
        long[] tong= new long[1];
        tong[0]= 0;
        bk(1, n, m, tong, c);
        System.out.printf("Tong cong co %d to hop", tong[0]);
        
    }

    public static void bk(int i, int n, int m, long[] tong, int[] c) {
        for(int j= c[i- 1]+ 1; j<= n- m+ i; j++)
        {
            c[i]= j;
            if(i== m)
            {
                out(m, c, tong);
            }
            else bk(i+ 1, n, m, tong, c);
        }
    }

    public static void out( int m, int[] c, long[] tong) {
        for(int i= 1; i<= m; i++)
        {
            System.out.print(c[i]+ " ");
        }
        tong[0]++;
        System.out.println("");
    }
}
