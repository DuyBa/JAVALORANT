import java.util.ArrayList;
import java.util.Scanner;


public class J05076nhapxuathang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t= sc.nextInt();
        sc.nextLine();
        
        ArrayList <nxh> a= new ArrayList<>();
       
        while(t--> 0)
            a.add(new nxh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        int n= sc.nextInt();
        sc.nextLine();
       
        while(n--> 0)
        {
            nx aa= new nx(sc.next(), sc.nextLong(), sc.nextLong(), sc.nextLong());
            if(n> 0) sc.nextLine();
            for(nxh i: a)
            {
                if(i.ma.compareTo(aa.ma)== 0)
                {
                    i.nhap= aa.luongnhap* aa.gianhap;
                    i.xuat= aa.luongxuat* aa.gianhap+ (long) (aa.luongxuat* aa.gianhap* i.loaitien);
                    System.out.println(i);
                }
            }
        }
    }
}

class nx
{
    String ma;
    long luongnhap, gianhap, luongxuat;

    nx(String ma, long luong, long nhap, long xuat)
    {
        this.ma= ma;
        this.luongnhap= luong;
        this.gianhap= nhap;
        this.luongxuat= xuat;
    }
}

class nxh
{
    String ma;
    String ten;
    String loai;
    double loaitien;
    long nhap, xuat;

    nxh(String ma, String ten, String loai)
    {
        this.ma= ma;
        this.ten= ten;
        this.loai= loai;
        if(loai.charAt(0)== 'A') loaitien= 0.08;
        else if(loai.charAt(0)== 'B') loaitien= 0.05;
        else if(loai.charAt(0)== 'C') loaitien= 0.02;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ nhap+ " "+ xuat;
    }
}