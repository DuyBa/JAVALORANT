import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05055xephangvandongvien1
 */
/**
 * J05056xephangdongvien2
 */
public class J05056xephangdongvien2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <xhdv> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i= 1; i<= t; i++)
            a.add(new xhdv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine() ));

        xhdv.xephangg(a);

        for(xhdv i:  a)
            System.out.println(i);
    }

}

class xhdv
{
    String ma= "VDV";
    String ten;
    String thucte;
    long tt= 0;
    int ut= 0;
    String uutien= "00:00:0";
    String tong;
    long t= 0;
    long tongg;
    int xephang;

    xhdv(int i, String ten, String ngay, String batdau, String kethuc)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.ten= ten;
        
        int tuoi= 2021- Integer.parseInt(ngay.substring(ngay.length()- 4));
        if(tuoi>= 32) ut+= 3;
        else if(tuoi>= 25) ut+= 2;
        else if(tuoi>= 18) ut+= 1;
        else ut+= 0;
        uutien+=  String.valueOf(ut);

        tt+= Long.parseLong(batdau.substring(0, 2))* 60* 60+ Long.parseLong(batdau.substring(3, 5))* 60+ Long.parseLong(batdau.substring(6));
        t+= Long.parseLong(kethuc.substring(0, 2))* 60* 60+ Long.parseLong(kethuc.substring(3, 5))* 60+ Long.parseLong(kethuc.substring(6));

        tongg= t- tt- ut;
        long tmpp= t- tt;
        this.thucte= String.format("%02d:%02d:%02d", tmpp/ 60/ 60, (tmpp% 3600)/ 60, tmpp% 60 );
        this.tong= String.format("%02d:%02d:%02d", tongg/ 60/ 60, (tongg% 3600)/ 60, tongg% 60 );



    }

    static void xephangg(ArrayList <xhdv> a)
    {
        ArrayList <xhdv> aa= a;
        // for(xhdv i: a) aa.add(i);
        Collections.sort(aa, new Comparator<xhdv>() {
            public int compare(xhdv truoc, xhdv sau)
            {
                if(truoc.tongg> sau.tongg) return 1;
                if(truoc.tongg== sau.tongg) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        // double ck= 1000000000000.0;
        int chay= 1;
        aa.get(0).xephang= 1;
        for(int i= 1; i< aa.size(); i++)
        {
            chay++;
            if(aa.get(i).tongg== aa.get(i- 1).tongg) aa.get(i).xephang= aa.get(i- 1).xephang;
            else aa.get(i).xephang= chay;
        }
        
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ thucte+ " "+ uutien+ " "+ tong+ " "+ xephang;
    }
}