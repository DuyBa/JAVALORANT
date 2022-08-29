import java.math.BigInteger;
import java.util.Scanner;

public class J03015hieuhaisonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger a= sc.nextBigInteger(), b= sc.nextBigInteger();
        BigInteger c= a.subtract(b);
        System.out.println(c);
        
    }
}
