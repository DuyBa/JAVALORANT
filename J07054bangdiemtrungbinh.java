import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07054bangdiemtrungbinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("BANGDIEM.in"));
        ArrayList <bangdiem> a= new ArrayList<>();
        int t= sc.nextInt();
        for(int i= 1;i<= t; i++)
        {
            sc.nextLine();
            a.add(new bangdiem(i, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<bangdiem>() {
            public int compare(bangdiem truoc, bangdiem sau)
            {
                if(truoc.tong< sau.tong) return 1;
                if(truoc.tong== sau.tong) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        a.get(0).rank= 1;
        int chay= 1;

        for(int i= 1; i< a.size(); i++)
        {
            chay++;
            if(a.get(i).tong== a.get(i- 1).tong) a.get(i).rank= a.get(i- 1).rank;
            else a.get(i).rank= chay;
        }

        for(bangdiem i: a)
            System.out.println(i);
    }
}

class bangdiem
{
    String ma;
    String ten= "";
    int d1, d2, d3;
    double tong;
    int rank;

    bangdiem(int i, String ten, int d1, int d2, int d3)
    {
        this.ma= String.format("SV%02d", i);
        
        ten= ten.trim();

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        this.tong= (double) (d1* 3+ d2* 3+ d3* 2)/ 8.0;


    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.format("%.2f", tong)+ " "+ rank;
    }
}