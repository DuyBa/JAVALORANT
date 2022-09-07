import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class J05018bangdiemhocsinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bdhs> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new bdhs(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<bdhs>() {
            public int compare(bdhs truoc, bdhs sau)
            {
                if(sau.diem> truoc.diem) return 1;
                if(sau.diem== truoc.diem) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        for(bdhs i: a)
            System.out.println(i);
    }
}

class bdhs
{
    String ma= "HS";
    String ten;
    double diem;
    String diemm;
    String loai;

    bdhs(int i, String ten, double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.ten= ten;
        diem= (a1* 2+ a2* 2+ a3+ a4+ a5+ a6+ a7+ a8+ a9+ a10)/ 12;
        this.diemm= String.valueOf(Math.round(diem* 10.0)/ 10.0);

        if(diem< 5.0) loai= "YEU";
        else if(diem< 7.0) loai= "TB";
        else if(diem< 8.0) loai= "KHA";
        else if(diem< 9.0) loai= "GIOI";
        else loai= "XUAT SAC";
    }

    public String toString()
    {
        String a= "";
        a+= ma+ " "+ ten+ " "+ diemm+ " "+ loai;
        return a;
    }
}