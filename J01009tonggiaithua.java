import java.util.Scanner;

/**
 * J01009tonggiaithua
 */
public class J01009tonggiaithua {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long s= 1, tmp= 0;
        for(int i=1; i<= n; i++)
        {
            s*= i;
            tmp+= s;
        }
        System.out.println((long) tmp);
    }
}