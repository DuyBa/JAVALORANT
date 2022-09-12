import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05054xapxephocsinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <sxhs> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i= 1; i<= t; i++)
        {
            a.add(new sxhs (i, sc.nextLine(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        sxhs.xephang(a);

        for(sxhs i: a)
            System.out.println(i);
    }
}

class sxhs
{
    String ma= "HS";
    String ten;
    double diem;
    String xeploai;
    int xephang;

    sxhs(int i, String ten, double diem)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.diem= diem;
        this.ten= ten;

        if(diem< 5) this.xeploai= "Yeu";
        else if(diem< 7) this.xeploai= "Trung Binh";
        else if(diem< 9) this.xeploai= "Kha";
        else this.xeploai= "Gioi";

    }

    static void xephang(ArrayList <sxhs> a)
    {
        ArrayList <sxhs> aa= new ArrayList<>();
        for(sxhs i: a) aa.add(i);
        Collections.sort(aa, new Comparator<sxhs>() {
            public int compare(sxhs truoc, sxhs sau)
            {
                if(truoc.diem< sau.diem) return 1;
                return -1;
            }
        });

        // double ck= 1000000000000.0;
        int chay= 1;
        aa.get(0).xephang= 1;
        for(int i= 1; i< aa.size(); i++)
        {
            chay++;
            if(aa.get(i).diem== aa.get(i- 1).diem) aa.get(i).xephang= aa.get(i- 1).xephang;
            else aa.get(i).xephang= chay;
        }
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ diem+ " "+ xeploai+ " "+ xephang;
    }
}