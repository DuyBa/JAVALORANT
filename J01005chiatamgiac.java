import java.util.Scanner;
import java.lang.Math;
public class J01005chiatamgiac {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t> 0)
        {
            int a= sc.nextInt(), b= sc.nextInt();
            for( int i=1; i< a; i++)
            {
                System.out.printf("%.6f ", (float) b* Math.sqrt((double)i/ a));
            }
            System.out.println("");

            t--;
        }

    }
}
