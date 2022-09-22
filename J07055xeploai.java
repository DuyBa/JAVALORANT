import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07055xeploai
 */
public class J07055xeploai {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("BANGDIEM.in"));
        ArrayList <bangdiemm> a= new ArrayList<>();
        int t= sc.nextInt();
        for(int i= 1;i<= t; i++)
        {
            sc.nextLine();
            a.add(new bangdiemm(i, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<bangdiemm>() {
            public int compare(bangdiemm truoc, bangdiemm sau)
            {
                if(truoc.tong< sau.tong) return 1;
                return -1;
            }
        });

        for(bangdiemm i: a)
            System.out.println(i);
    }
}

class bangdiemm
{
    String ma;
    String ten= "";
    int d1, d2, d3;
    double tong;
    String rank;

    bangdiemm(int i, String ten, int d1, int d2, int d3)
    {
        this.ma= String.format("SV%02d", i);
        
        ten= ten.trim();

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        this.tong= (double) (d1* 0.25+ d2* 0.35+ d3* 0.40);

        if(tong>= 8) rank= "GIOI";
        else if(tong>= 6.5) rank= "KHA";
        else if(tong>= 5) rank= "TRUNG BINH";
        else rank= "KEM";

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.format("%.2f", tong)+ " "+ rank;
    }
}