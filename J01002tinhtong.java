import java.util.Scanner;

/**
 * J01002tinhtong
 */
public class J01002tinhtong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t> 0)
        {
            long a= sc.nextLong();
            System.out.println((1+ a)* a/ 2);
            t--;
        }
    }
}