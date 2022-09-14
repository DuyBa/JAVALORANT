import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05012tinhtien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <ttien> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            a.add(new ttien(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextLong()));
            if(t> 0) sc.nextLine();
        }

        Collections.sort(a, new Comparator<ttien>() {
            public int compare(ttien truoc, ttien sau)
            {
                if(sau.tong> truoc.tong) return 1;
                return -1;
            }
        });

        for(ttien i: a)
            System.out.println(i);
    }   
}

class ttien
{
    String ma;
    String ten;
    int sl;
    long gia, chietkhau, tong;

    ttien(String ma, String ten, int sl, long gia, long chietkhau)
    {
        this.ma= ma;
        this.ten= ten;
        this.sl= sl;
        this.gia= gia;
        this.chietkhau= chietkhau;
        this.tong= sl* gia- chietkhau;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ sl+ " "+ gia+ " "+ chietkhau+ " "+ tong;
    }
}