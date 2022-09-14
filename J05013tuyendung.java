import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05013tuyendung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tdung> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tdung(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<tdung>() {
            public int compare(tdung truoc, tdung sau)
            {
                if(truoc.diem< sau.diem) return 1;
                return -1;
            }
        });

        for(tdung i: a)
            System.out.println(i);
    }
}

class tdung
{
    String ma;
    String ten;
    double lt, th, diem;
    String xl, diemm;

    tdung(int i, String ten, double lt, double th)
    {
        this.ma= String.format("TS%02d", i);
        this.ten= ten;
        this.lt= lt;
        this.th= th;

        if(th> 10) 
        {
            int thh= (int) th;
            String tmp= String.valueOf(thh);
            tmp= tmp.substring(0, 1)+ "."+ tmp.substring(1);
            this.th= Double.parseDouble(tmp);            
        }
        if(lt> 10) 
        {
            int ltt= (int) lt;
            String tmp= String.valueOf(ltt);
            tmp= tmp.substring(0, 1)+ "."+ tmp.substring(1);
            this.lt= Double.parseDouble(tmp);            
        }

        double res= (this.lt+ this.th)/ 2;
        this.diem= res;
        if(res< 5) xl= "TRUOT";
        else if(res> 5&& res< 8) xl= "CAN NHAC";
        else if(res>=8&& res<= 9.5) xl= "DAT";
        else if(res> 9.5) xl= "XUAT SAC";

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.format("%.2f", diem)+" "+ xl;
    }
}