import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class J05030bangdiemthanhphan1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bdtp> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new bdtp(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<bdtp>() {
            public int compare(bdtp truoc, bdtp sau)
            {
                if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        int dem= 1;
        for(bdtp i: a)
        {
            System.out.printf("%d ", dem);
            System.out.println(i);
            dem++;
        }
    }
}

class bdtp
{
    String ma;
    String ten;
    String lop;
    String d1, d2, d3;

    bdtp(String ma, String ten, String lop, double d1, double d2, double d3)
    {
        this.ma= ma;
        this.ten= ten;
        this.lop= lop;
        this.d1= String.format("%.1f", d1);
        this.d2= String.format("%.1f", d2);
        this.d3= String.format("%.1f", d3);
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ lop+ " "+ d1+ " "+ d2+ " "+ d3; 
    }
}