import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * J05058sapxepbangdiemtuyensinh
 */
public class J05058sapxepbangdiemtuyensinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bdtss> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new bdtss(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(t> 0) sc.nextLine();
        }

        Collections.sort(a, new Comparator<bdtss>() {
            public int compare(bdtss truoc, bdtss sau)
            {
                if(truoc.tong< sau.tong) return 1;
                if(truoc.tong== sau.tong) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        for(bdtss i: a)
            System.out.println(i);
    }
}

class bdtss
{
    String ma;
    String ten;
    double d1, d2, d3;
    double ut, tong;
    String utt, tongg;
    String status;

    bdtss(String ma, String ten, double d1, double d2, double d3)
    {
        this.ma= ma;
        this.ten= ten;
        if(ma.charAt(2)== '1') ut= 0.5;
        else if(ma.charAt(2)== '2') ut= 1.0;
        else ut= 2.5;
        if(Math.floor(ut)== ut) utt= String.valueOf((int) ut);
        else utt= String.valueOf((ut));
        tong= d1* 2+ d2+ d3+ ut;
        if(Math.floor(tong)== tong) tongg= String.valueOf((int) (tong));
        else tongg= String.valueOf((tong));
        if(tong< 24.0) status= "TRUOT";
        else status= "TRUNG TUYEN";
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ utt+ " "+ tongg+ " "+ status;
    }
}