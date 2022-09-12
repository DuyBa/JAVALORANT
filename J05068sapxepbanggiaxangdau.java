import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05067quanlixangdau
 */
public class J05068sapxepbanggiaxangdau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <qlxd> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new qlxd(sc.next(), sc.nextLong()));
            if(t> 0) sc.nextLine();
        }

        Collections.sort(a, new Comparator<qlxd>() {
            public int compare(qlxd truoc, qlxd sau)
            {
                if(truoc.tien< sau.tien) return 1;
                return -1;
            }
        });

        for(qlxd i: a)
            System.out.println(i);
    }
}

class qlxd
{
    String ma;
    String ten;
    String hang;
    long gia, tien, thuee;
    double thue;

    qlxd(String ma, long luong)
    {


        String dau= ma.substring(0, 1);
        if(dau.compareTo("X")== 0)
        {
            gia= 128000;
            thue= (double) 3/ 100;
        }
        if(dau.compareTo("D")== 0)
        {
            gia= 11200;
            thue= 3.50/ 100;
        }
        if(dau.compareTo("N")== 0)
        {
            gia= 9700;
            thue= (double) 2/ 100;
        }

        this.ma= ma;
        String tmp= ma.substring(ma.length()- 2);
        if(tmp.compareTo("BP")== 0) ten= "British Petro";
        if(tmp.compareTo("ES")== 0) ten= "Esso";
        if(tmp.compareTo("SH")== 0) ten= "Shell";
        if(tmp.compareTo("CA")== 0) ten= "Castrol";
        if(tmp.compareTo("MO")== 0) ten= "Mobil";
        if(tmp.compareTo("TN")== 0) 
        {
            ten= "Trong Nuoc";
            thue= 0;
        }

        this.thuee= (long) (gia* luong* thue);
        tien= gia* luong+ thuee;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ gia+ " "+ thuee+ " "+ tien;
    }
}
