import java.util.Scanner;

public class J03011uocsochungcuasonguyenlon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            Long a= sc.nextLong();
            sc.nextLine();
            String b= sc.nextLine();
            giam(a, b);
            if(a== 0) System.out.println(b);
            else
            {
                long h= giam(a, b);
                System.out.println(gcd(a, h));
            }
        }
    }
    public static long giam(long a, String b) {
        char[] c= b.toCharArray();
        long tong= 0;
        for(int i= 0; i< c.length; i++)
        {
            tong= (tong*10 + Character.getNumericValue(c[i]))% a;
        }
        return tong;
    }   

    public static long gcd(long a, long b) {
        while(a!= b)
        {
            if(a< b) b= b- a;
            else a= a- b;
        }
        return a;
    }
}
