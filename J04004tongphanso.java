import java.util.Scanner;

/**
 * J04004tongphanso
 */
class ps{
    long tu;
    long mau;
    
    void input(Scanner sc)
    {
        tu= sc.nextLong();
        mau= sc.nextLong();
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


    ps tong(ps b)
    {
        ps tmp= new ps();

        tmp.tu= tu* b.mau+ mau* b.tu;
        tmp.mau= mau* b.mau;
        long chung= gcd(tmp.tu, tmp.mau);
        tmp.tu/= chung;
        tmp.mau/= chung;
        return tmp; 
    }
}

public class J04004tongphanso {

    public static void main(String[] args) throws java.lang.Exception 
    {
        Scanner sc= new Scanner(System.in);
        ps ps1= new ps();
        ps ps2= new ps();
        ps1.input(sc); 
        ps2.input(sc);
        ps tmp= ps1.tong(ps2);
        System.out.printf("%d/%d", tmp.tu, tmp.mau);
    }
}



