import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05014tuyengiaovien
 */
public class J05014tuyengiaovien {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tgv> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tgv(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<tgv>() {
            public int compare(tgv truoc, tgv sau)
            {
                if(truoc.tong< sau.tong) return 1;
                if(truoc.tong== sau.tong) if(truoc.ma.compareTo(sau.ma)== 1) return 1;
                return -1;
            }
        });

        for(tgv i: a)
            System.out.println(i);
    }
}

class tgv
{
    String ma;
    String ten;
    String ketqua;
    String mon;
    double tong;

    tgv(int i, String ten, String ma, double d1, double d2)
    {
        this.ma= String.format("GV%02d", i);
        this.ten= ten;
        double uutien= 0;

        
        if(ma.charAt(0)== 'A') this.mon= "TOAN";
        if(ma.charAt(0)== 'B') this.mon= "LY";
        if(ma.charAt(0)== 'C') this.mon= "HOA";
        
        if(ma.charAt(1)== '1') uutien+= 2;
        else if(ma.charAt(1)== '2') uutien+= 1.5;
        else if(ma.charAt(1)== '3') uutien+= 1;

        this.tong= d1* 2+ d2+ uutien;
        
        if(tong>= 18) this.ketqua= "TRUNG TUYEN";
        else this.ketqua= "LOAI";

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ mon+ " "+ String.format("%.1f", tong)+ " "+ ketqua;
    }
}