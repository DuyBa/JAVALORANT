import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * nhonhatvalonnhat
 */
public class nhonhatvalonnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            Set <BigInteger> a= new HashSet<>();
            ArrayList <BigInteger> aa;
            int t= sc.nextInt();
            if(t== 0) break;
            while(t--> 0)
                a.add(sc.nextBigInteger());
            aa= new ArrayList<>(a);
            Collections.sort(aa);
            if(aa.size()== 1) System.out.println("BANG NHAU");
            else System.out.println(aa.get(0)+ " "+ aa.get(aa.size()- 1));
            sc.nextLine();
        }
    }
}
