
// bai nay chu y ep kieu float truoc khi math round

import java.util.ArrayList;
import java.util.Scanner;

public class J05048bangtheodoinhapxuathang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <nxhh> a= new ArrayList<>();
        long t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            a.add(new nxhh(sc.nextLine(), sc.nextLong()));
            if(t> 0) sc.nextLine();
        }

        

        for(nxhh i: a)
            System.out.println(i);
    }
}

class nxhh
{
    String ma;
    long nhap;
    long xuat;
    long gia;
    long tien;
    long thue;

    nxhh(String ma, long nhap)
    {
        this.ma= ma;
        this.nhap= nhap;
        if(isa(ma.charAt(0))== true) xuat= Math.round((float) (nhap* 60)/ 100) ;
        else xuat= Math.round((float) (nhap* 70)/ 100) ;

        if(isy(ma.charAt(ma.length()- 1))== true) this.gia= 110000;
        else this.gia= 135000;

        this.tien= xuat* gia;

        if(isa(ma.charAt(0))== true)
        {
            if(isy(ma.charAt(ma.length()- 1))== true) thue= tien* 8/ 100 ;
            else thue= tien* 11/ 100;
        }
        else 
        {
            if(isy(ma.charAt(ma.length()- 1))== true) thue= tien* 17/ 100 ;
            else thue= tien* 22/ 100;
        }

    }

    boolean isa(Character x)
    {
        if(x== 'A') return true;
        return false;
    }
    boolean isy(Character x)
    {
        if(x== 'Y') return true;
        return false;
    }

    public String toString()
    {
        return ma+ " "+ nhap+ " "+ xuat+ " "+ gia+ " "+ tien+ " "+ thue;
    }

}
