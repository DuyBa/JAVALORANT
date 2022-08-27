
import java.util.Scanner;

public class J02103tichmatranvoichuyenvicuano {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int h= 1; h<= t; h++)
        {
            int n= sc.nextInt(), m= sc.nextInt();
            long[][] a= new long[n][m];
            long[][] b= new long[n][n];
            for(int i= 0; i< n; i++)
                for(int j= 0; j< m; j++)
                    a[i][j]= sc.nextLong();
            System.out.printf("Test %d:", h);
            System.out.println("");
            for(int i= 0; i< n; i++)
                for(int j= 0; j< n; j++)
                {
                    b[i][j]= 0;
                    for(int k= 0; k< m; k++)
                        b[i][j]+= a[i][k]* a[j][k];
                }
                    
            for(int i= 0; i< n; i++)
            {
                for(int j= 0; j< n; j++)
                    System.out.print(b[i][j]+ " ");
                System.out.println("");
            }
        }       
    }
}
