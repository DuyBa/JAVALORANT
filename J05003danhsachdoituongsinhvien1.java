import java.util.ArrayList;
import java.util.Scanner;

public class J05003danhsachdoituongsinhvien1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dssv> a= new ArrayList<dssv>();
        for(int i= 1; i<= t; i++)
        {
        	a.add(new dssv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        	if(i<t) sc.nextLine();
        }
        for(dssv i: a) 
            System.out.println(i);
    }
}

class dssv
{
    String msv= "B20DCCN";
    String ten;
    String lop;
    String ngay= "";
    String diem;

    dssv(int i, String a, String b, String c, double e)
    {
        if(i< 10) msv+= "00";
        else if(i< 100) msv+= "0";
        msv+= String.valueOf(i);
        ten= a;
        lop= b;
        
        String[] tmp= c.split("/");
        if(Integer.parseInt(tmp[0])< 10) ngay+= "0";
        ngay+= tmp[0]+ "/";
        if(Integer.parseInt(tmp[1])< 10) ngay+= "0";
        ngay+= tmp[1]+ "/"+ tmp[2];

        diem= String.format("%.2f", e);
    }

    public String toString()
    {
        return msv+ " "+ ten+ " "+ lop+ " "+ ngay+ " "+ diem;
    }
}
