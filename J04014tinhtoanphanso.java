import java.util.Scanner;

public class J04014tinhtoanphanso {
    public static void main(String[] args) throws java.lang.Exception 
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            ps ps1= new ps();
            ps ps2= new ps();
            ps1.input(sc); 
            ps2.input(sc);
            ps tmp= ps1.tong(ps2);
            ps tmp1= ps1.nhan(ps2, tmp);
            System.out.printf("%d/%d", tmp.tu, tmp.mau);
            System.out.print(" ");
            System.out.printf("%d/%d", tmp1.tu, tmp1.mau);
            System.out.println("");
        }
        
    }
}

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
        tmp.tu/= chung; tmp.tu*= tmp.tu;
        tmp.mau/= chung; tmp.mau*= tmp.mau;
        return tmp; 
    }

    ps nhan(ps a, ps b)
    {
        ps tmp= new ps();
        tmp.tu= tu* a.tu* b.tu;
        tmp.mau= mau* a.mau* b.mau;
        long chung= gcd(tmp.tu, tmp.mau);
        tmp.tu/= chung;
        tmp.mau/= chung;
        return tmp;
    }
}