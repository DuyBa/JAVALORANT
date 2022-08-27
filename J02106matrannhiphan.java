import java.util.Scanner;



public class j02106matrannhiphan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] a= new int[n][3];
        int dem= 0;
        for(int i= 0; i< n; i++)
        {
            int tong= 0;
            for(int j= 0; j< 3; j++)
            {
                a[i][j]= sc.nextInt();
                tong+= a[i][j];
            }
            if (tong> 1) dem++;
        }
        System.out.println(dem);
    }
}
