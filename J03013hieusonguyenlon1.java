import java.math.BigInteger;
import java.util.Scanner;

public class J03013hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            BigInteger a= sc.nextBigInteger(), b= sc.nextBigInteger();
            BigInteger c= a.subtract(b);
            c= c.abs();
            String s= a.toString(), ss= b.toString(), tmp= c.toString();
            long dai= Math.max(s.length(), ss.length());
            while(dai> tmp.length())
                tmp= "0"+ tmp;
            System.out.println(tmp);
        }
    }
}
