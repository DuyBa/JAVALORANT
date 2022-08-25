import java.util.Scanner;

public class J01021tinhluythua {
    
    public static void main(String[] args) {
        long M= (int)1e9+ 7;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            long a= sc.nextLong();
            long b= sc.nextLong();
            if(a== 0 && b== 0) break;
            else
            {
                System.out.println(pw(a, b, M));
            }
        }
    }

    public static long pw(long a, long b, long M) {
        if(b== 0) return 1;
        long x= pw(a, b/ 2, M);
        if(b% 2== 0) return (x% M* x% M)% M;
        return (a% M* x% M* x% M)% M;
    }
}
