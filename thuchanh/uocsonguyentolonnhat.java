import java.util.Scanner;

public class uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            long a= sc.nextLong();
            while(a% 2== 0) a/= 2;
            if(a== 1) System.out.println("2");
            for(int i= 3; i<= Math.sqrt(a); i++)
            {
                while(a% i== 0) a/= i;
                if(i== 1) System.out.println(i);
            }    
            if(a> 2) System.out.println(a);
        }
    }
}
