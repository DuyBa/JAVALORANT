import java.util.Scanner;

public class J02014diemcanbang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            int n= sc. nextInt();
            int[] a= new int[n];
            long tong= 0, tong1= 0, ck= 0;
            for(int i= 0; i< n; i++) 
            {
                a[i]= sc.nextInt();
                tong+= a[i];
            }
            
            for(int i= 0; i< n; i++)
            {
                if((tong1== tong- a[i]- tong1))
                {
                    System.out.println(i+ 1);
                    ck= 1;
                    break;
                }
                else tong1+= a[i];
            }
            if(ck== 0) System.out.println(-1);
        }    
    }
}
