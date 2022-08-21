import java.util.Scanner;

public class J01012uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t--> 0)
        {
            int a= sc.nextInt();
            long dem= 0;
            if( a% 2!= 0) System.out.println(0);
            else
            {
                for(int i= 1; i<= Math.sqrt(a);i++)
                {
                    if( a% i== 0)
                    {
                        if( i% 2== 0) dem++;
                        if((a/i) % 2== 0&& i!= a/i) dem++;
                    }
                    
                }
                System.out.println(dem);
            }

        }
    }
}
