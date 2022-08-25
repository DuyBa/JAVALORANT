import java.util.Scanner;

public class J02007demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int k= 1;
        while(k<= t)
        {
            int n= sc.nextInt();
            int[] a= new int[n], b= new int[100005];
            
            for(int i= 0; i< n; i++)
            {
                a[i]= sc.nextInt();
                b[a[i]]++;
            }
            System.out.printf("Test %d:", k);
            System.out.println("");
            for(int i= 0; i< n; i++)
            {
                if(b[a[i]]!= 0)
                {
                    System.out.printf("%d xuat hien %d lan",a[i], b[a[i]]);
                    b[a[i]]= 0;
                    System.out.println("");
                }
            }
            k++;
        }

    }
}
