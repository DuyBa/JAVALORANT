import java.util.Scanner;

public class J01018sokhonglienke {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t--> 0)
        {
            String a= sc.next();
            if(ck(a)== 1&& ck1(a)== 1) System.out.println("YES");
            else System.out.println("NO");
        }  
    }

    public static int ck(String a) {
        char[] c= a.toCharArray();
        for(int i=1; i< a.length(); i++)
        {
            if(Math.abs((int)c[i]- (int)c[i- 1])!= 2) return 0;
        }
        return 1;
    }

    public static int ck1(String a) {
        long h= 0;
        char[] b= a.toCharArray();
        for(int i=0; i< a.length(); i++)
            h+= Character.getNumericValue(b[i]);
        if(h% 10== 0) return 1;
        return 0;
    }
}
