import java.math.BigInteger;

import java.util.Scanner;

public class J03033boisochungnhonhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            BigInteger a= sc.nextBigInteger(), b= sc.nextBigInteger();
            BigInteger c= a.gcd(b);
            System.out.println((a.multiply(b)).divide(c));
        }
    }
}
