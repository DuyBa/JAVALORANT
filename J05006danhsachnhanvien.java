import java.util.ArrayList;
import java.util.Scanner;


public class J05006danhsachnhanvien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dsnvv> a= new ArrayList<dsnvv>();
        for(int i= 1; i<= t; i++)
        {
        	a.add(new dsnvv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        	// if(i<t) sc.nextLine();
        }


        for(dsnvv i: a) 
            System.out.println(i);
    }
}

class dsnvv
{
    String ma= "";
    String ten="";
    String gt;
    String ngay= "";
    String dc;
    String so;
    String ngay1;

    dsnvv(int i, String ten, String gt, String ngay, String dc, String so, String ngay1)
    {
        if(i< 10) ma+= "0000";
        else if(i< 100) ma+= "000";
        else if(i< 1000) ma+= "00";
        else if(i< 10000) ma+= "0";
        ma+= String.valueOf(i);
        
        this.ten= ten;
        this.gt= gt;
        this.ngay= ngay;
        this.dc= dc;
        this.so= so;
        this.ngay1= ngay1;

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ gt+ " "+ ngay+ " "+ dc+ " "+ so+ " "+ ngay1;
    }
}
