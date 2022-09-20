import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07048danhsachsanpham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SANPHAM.in"));
        int t= Integer.parseInt(sc.nextLine());
        ArrayList <sanpham> a= new ArrayList<>();
        while(t--> 0)
            a.add(new sanpham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(a, new Comparator<sanpham>() {
            public int compare(sanpham truoc, sanpham sau)
            {
                if(truoc.gia< sau.gia) return 1;
                if(truoc.gia== sau.gia) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        for(sanpham i: a)
            System.out.println(i);
        
    }
}

class sanpham
{
    String ma, ten;
    int gia, han;

    sanpham(String ma, String ten, String gia, String han)
    {
        this.ma= ma;
        this.ten= ten;
        this.gia= Integer.parseInt(gia) ;
        this.han= Integer.parseInt(han) ;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ gia+ " "+ han;
    }
}