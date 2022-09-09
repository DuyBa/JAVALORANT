import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.Scanner;

public class J05036tinhgiaban1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tgb> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tgb(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
            sc.nextLine();
        }

        // Collections.sort(a, new Comparator<tgb>() {
        //     public int compare(tgb truoc, tgb sau)
        //     {
        //         if(truoc.ban< sau.ban) return 1;
        //         return -1;
        //     }
        // });

        for(tgb i: a)
            System.out.println(i);
    }
}

class tgb
{
    String ma= "MH";
    String ten;
    String donvi;
    long nhap;
    long sl;
    long vanchuyen;
    long tien;
    long ban;

    tgb(int i, String ten, String donvi, long nhap, long sl)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.ten= ten;
        this.donvi= donvi;
        double aaa= (nhap* sl)* 5/ 100;
        this.vanchuyen= Math.round(aaa);
        double bbb= nhap* sl+ aaa;
        this.tien= Math.round(bbb);
        this.ban= Math.round( bbb+ Math.round(bbb* 2/ 100));
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ donvi+ " "+ String.valueOf(vanchuyen)+ " "+ String.valueOf(tien)+ " "+ String.valueOf(ban);
    }
}