import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05055xephangvandongvien1
 */
public class J05055xephangvandongvien1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <shdv> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i= 1; i<= t; i++)
            a.add(new shdv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine() ));

        shdv.xephangg(a);

        for(shdv i:  a)
            System.out.println(i);
    }

}

class shdv
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

    shdv(int i, String ten, String ngay, String batdau, String kethuc)
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

    static void xephangg(ArrayList <shdv> a)
    {
        ArrayList <shdv> aa= new ArrayList<>();
        for(shdv i: a) aa.add(i);
        Collections.sort(aa, new Comparator<shdv>() {
            public int compare(shdv truoc, shdv sau)
            {
                if(truoc.tongg> sau.tongg) return 1;
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