import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05037tinhgiaban2
 */
public class J05037tinhgiaban2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tgbb> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tgbb(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<tgbb>() {
            public int compare(tgbb truoc, tgbb sau)
            {
                if(truoc.ban< sau.ban) return 1;
                return -1;
            }
        });

        for(tgbb i: a)
            System.out.println(i);
    }
}

class tgbb
{
    String ma= "MH";
    String ten;
    String donvi;
    long nhap;
    long sl;
    long vanchuyen;
    long tien;
    long ban;

    tgbb(int i, String ten, String donvi, long nhap, long sl)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.ten= ten;
        this.donvi= donvi;
        double aaa= (nhap* sl)* 5/ 100;
        this.vanchuyen= Math.round(aaa);
        double bbb= nhap* sl+ aaa;
        this.tien= Math.round(bbb);
        this.ban= (long) (Math.ceil((bbb+ bbb* 2/ 100)/ sl/ 100)* 100);
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ donvi+ " "+ String.valueOf(vanchuyen)+ " "+ String.valueOf(tien)+ " "+ String.valueOf(ban);
    }
}