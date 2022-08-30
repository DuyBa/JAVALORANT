import java.util.Scanner;

public class J01022xaunhiphan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        
        long[] a= new long[95];
        a[0]= 0; a[1]= 1;

        for(int i= 2; i<= 93; i++) a[i]= a[i- 1]+ a[i- 2];
        
        String[] s= new String[5];
        s[0]= "0"; s[1]= "1"; s[2]= "01"; 
        
        while(t--> 0)
        {
            int n= sc.nextInt();
            Long m= sc.nextLong();
            while(n> 3)
            {
                if(m<= a[n- 2])  n-= 2;
                else
                {
                    m-= a[n- 2];
                    n--;    
                }
            }
            char[] X=s[n-1].toCharArray();
            Long y= m- 1;
            int x= y.intValue();
            System.out.println(X[x]);
        }
    }
}
