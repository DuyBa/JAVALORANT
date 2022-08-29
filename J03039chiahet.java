import java.math.BigInteger;
import java.util.Scanner;



public class J03039chiahet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s= sc.nextLine();
            String[] a= s.split(" ");
            BigInteger lon= new BigInteger(a[0]), be= new BigInteger(a[1]), khong= new BigInteger("0") ;
            if(lon.compareTo(be)== -1)
            {
                BigInteger tmp= lon;
                lon= be;
                be= tmp;
            }
            if((lon.mod(be)).compareTo(khong)== 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
