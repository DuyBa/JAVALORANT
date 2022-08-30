import java.util.Scanner;

public class J02009xephang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int[][] a= new int[101][2];
        for(int i= 0; i< t; i++)
        {
            a[i][0]= sc.nextInt();
            a[i][1]= sc.nextInt();
        }
        for(int i= 0; i< t- 1; i++)
        {
            for(int j= i+ 1; j< t; j++)
            {
                if(a[j][0]< a[i][0])
                {
                    int tmp= a[j][0], tmp1= a[j][1];
                    a[j][0]= a[i][0]; a[j][1]= a[i][1];
                    a[i][0]= tmp; a[i][1]= tmp1;
                }
            }
        }
        int tong= a[0][0]+ a[0][1];
        for(int i= 1; i< t; i++)
        {
            if(a[i][0]> tong) tong= a[i][0]+ a[i][1];
            else if(a[i][0]< tong) tong+= a[i][1]; 
        }
        System.out.println(tong);
    }
}
