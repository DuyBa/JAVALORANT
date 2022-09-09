import java.util.ArrayList;
import java.util.Scanner;

/**
 * J05040lapbangtinhcong
 */
public class J05040lapbangtinhcong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tl> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tl(i, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextLine(), sc.nextLine()));
        }
        
        for(tl i: a)
            System.out.println(i);

    }
}

class tl
{
    String ma= "NV";
    String ten;
    int luong;
    int thuong= 0;
    int phucap= 0;
    int tong= 0;

    tl(int i, String ten, int luong, int ngay, String adu, String chuc)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);

        this.ten= ten;
        this.luong= luong* ngay;

        if(ngay>= 25) this.thuong+= this.luong* 20/ 100;
        else if(ngay>= 22) this.thuong+= this.luong* 10/ 100;

        if(chuc.compareTo("GD")== 0) phucap+= 250000;
        if(chuc.compareTo("PGD")== 0) phucap+= 200000;
        if(chuc.compareTo("TP")== 0) phucap+= 180000;
        if(chuc.compareTo("NV")== 0) phucap+= 150000;
        
        tong+= this.luong+ thuong+ phucap;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.valueOf(luong)+ " "+ String.valueOf(thuong)+ " "+ String.valueOf(phucap)+ " "+ String.valueOf(tong);
    }
}