import java.util.Scanner;

public class J01011boisochunguocsochung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t--> 0)
        {
            long a= sc.nextLong(), b= sc.nextLong();
            long aa= a, bb= b;
            while( a!= b)
            {
                if(a> b) a-= b;
                else b-= a;
            }
            System.out.println((aa* bb/ a) +" "+ a);
        }
    }
}
