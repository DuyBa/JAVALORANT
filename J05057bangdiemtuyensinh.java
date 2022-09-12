import java.util.ArrayList;
import java.util.Scanner;


public class J05057bangdiemtuyensinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bdts> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new bdts(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(t> 0) sc.nextLine();
        }

        for(bdts i: a)
            System.out.println(i);
    }
}

class bdts
{
    String ma;
    String ten;
    double d1, d2, d3;
    double ut, tong;
    String utt, tongg;
    String status;

    bdts(String ma, String ten, double d1, double d2, double d3)
    {
        this.ma= ma;
        this.ten= ten;
        if(ma.charAt(2)== '1') ut= 0.5;
        else if(ma.charAt(2)== '2') ut= 1.0;
        else ut= 2.5;
        if(Math.floor(ut)== ut) utt= String.valueOf((int) ut);
        else utt= String.valueOf((ut));
        tong= d1* 2+ d2+ d3+ ut;
        if(Math.floor(tong- ut)== tong- ut) tongg= String.valueOf((int) (tong- ut));
        else tongg= String.valueOf((tong- ut));
        if(tong< 24.0) status= "TRUOT";
        else status= "TRUNG TUYEN";
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ utt+ " "+ tongg+ " "+ status;
    }
}