import java.util.Scanner;

/**
 * J01008phantichthuasonguyento
 */
public class J01008phantichthuasonguyento {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for( int nt= 1; nt<= t; nt++)
        {
            long n= sc.nextLong();
            int dem= 0;
            System.out.printf("Test %d:", nt);
            if( n% 2== 0)
            {
                while( n% 2== 0)
                {
                    dem++;
                    n/= 2;
                }
                System.out.printf(" 2(%d)", dem);
            }
            for(int i= 3; i<= Math.sqrt(n); i++)
            {
                if( n% i== 0)
                {
                    dem= 0;
                    while( n% i== 0)
                    {
                        dem++;
                        n/= i;
                    }
                    System.out.printf(" %d(%d)", i, dem);
                }
            } 
            if( n> 2) System.out.printf(" %d(1)", n);
            System.out.println("");
        }
    }
}