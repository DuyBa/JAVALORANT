import java.util.Scanner;

public class J04003phanso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ps a= new ps();
        a.input(sc);
        a.in();
    }
    
}

class ps{
    long tu;
    long mau;
    
    void input(Scanner sc)
    {
        this.tu= sc.nextLong();
        this.mau= sc.nextLong();
    }

    void in()
    {
        Long chung= gcd(this.tu, this.mau);
        System.out.print(this.tu/ chung);
        System.out.print("/");
        System.out.print(this.mau/chung);
    }

    long gcd(long a, long b)
    {
        long lon= Math.max(a, b), be= Math.min(a, b);

        while(be!= 0)
        {
            long c= lon% be;
            lon= be;
            be= c;
        }
        return lon;
    }

}
