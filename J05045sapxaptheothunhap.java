import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
/**
 * J05045sapxaptheothunhap
 */
public class J05045sapxaptheothunhap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <sxnvtl> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new sxnvtl(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
            if(i< t) sc.nextLine();
        }
        
        Collections.sort(a, new Comparator<sxnvtl>() {
            public int compare(sxnvtl truoc, sxnvtl sau)
            {
                if(sau.chinh> truoc.chinh) return 1;
                if(sau.chinh== truoc.chinh) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        for(sxnvtl i: a) 
            System.out.println(i);
    }
}

class sxnvtl
{
    String ma= "NV";
    String ten;
    long phucap= 0;
    long luong;
    long ung;
    long con;
    long chinh;

    sxnvtl(int i, String ten, String chuc, long luong, long ngay)
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

        this.chinh= this.luong+ phucap;
        con= this.luong+ phucap- ung;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ phucap+ " "+ luong+ " "+ ung+ " "+ con;
    }
}