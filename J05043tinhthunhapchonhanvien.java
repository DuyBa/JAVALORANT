import java.util.ArrayList;
import java.util.Scanner;

public class J05043tinhthunhapchonhanvien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tnnv> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tnnv(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
            if(i< t) sc.nextLine();
        }
        
        for(tnnv i: a) 
            System.out.println(i);
    }
}

class tnnv
{
    String ma= "NV";
    String ten;
    long phucap= 0;
    long luong;
    long ung;
    long con;

    tnnv(int i, String ten, String chuc, long luong, long ngay)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);

        this.ten= ten;
        
        if(chuc.compareTo("GD")== 0) phucap+= 500; 
        else if(chuc.compareTo("PGD")== 0) phucap+= 400; 
        else if(chuc.compareTo("TP")== 0) phucap+= 300; 
        else if(chuc.compareTo("KT")== 0) phucap+= 250; 
        else phucap+= 100;
        
        this.luong= ngay* luong;
        double res= (phucap+ this.luong)* 2/ 3;
        if(res< 25000) ung= (long) Math.round(res/ 1000)* 1000;
        else ung= 25000;

        con= this.luong+ phucap- ung;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ phucap+ " "+ luong+ " "+ ung+ " "+ con;
    }
}