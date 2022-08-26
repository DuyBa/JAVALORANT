import java.util.Scanner;

public class J02034bosungdayso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        a[0]= sc.nextInt();
        int lon= a[0];
        for(int i= 1; i< n; i++) 
        {
            a[i]= sc.nextInt();
            if(a[i]> lon) lon= a[i];
        }
        int ckto= 0;
        for(int i= 1; i<= lon; i++)
        {
            int ck= 0;
            for(int j= 0; j< n; j++)
            {
                if(i== a[j])
                {
                    ck= 1;
                    break;
                }
            }
            if(ck== 0) 
            {
                System.out.println(i);
                ckto= 1;
            }
        }
        if(ckto== 0) System.out.println("Excellent!");
    }
}
