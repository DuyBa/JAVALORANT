
import java.util.Scanner;

public class J02008boisonhonhatcuansonguyenduongdautien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            long n= sc.nextLong(), bsc= 1;
            for(int i= 1; i<= n; i++)
            {
                bsc= ck(i, bsc);
            }
            System.out.println(bsc);
        }
    }

    public static long ck(long i, long bsc) {
        return i* bsc/ gcd(i, bsc);
    }

    public static long gcd(long a, long b) {
        while(b!= 0)
        {
            long c= a% b;
            a= b; 
            b= c;
        }
        return a;
    }
}
