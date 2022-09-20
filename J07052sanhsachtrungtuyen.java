import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



/**
 * J07052sanhsachtrungtuyen
 */
public class J07052sanhsachtrungtuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("THISINH.in"));
        int t= sc.nextInt();
        int tt= t;
        sc.nextLine();
        ArrayList <thisinh> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new thisinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        int chitieu= sc.nextInt();
        Collections.sort(a, new Comparator<thisinh>() {
            public int compare(thisinh truoc, thisinh sau)
            {
                if(truoc.tong< sau.tong) return 1;
                if(truoc.tong== sau.tong) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        double diemchuan;
        if(chitieu< tt) diemchuan= a.get(chitieu- 1).tong;
        else diemchuan= a.get(a.size()- 1).tong;
        

        System.out.println(String.format("%.1f", diemchuan));
        for(thisinh i: a)
        {
            if(i.tong>= diemchuan)
                System.out.print(i+ "TRUNG TUYEN\n");
            else System.out.print(i+ "TRUOT\n");
        }
            
    }
}

class thisinh
{
    String ma;
    String ten= "";
    double d1, d2, d3;
    double ut, tong;
    String utt, tongg;

    thisinh(String ma, String ten, double d1, double d2, double d3)
    {
        this.ma= ma;
        ten= ten.trim();

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();
        
        if(ma.charAt(2)== '1') ut= 0.5;
        else if(ma.charAt(2)== '2') ut= 1.0;
        else ut= 2.5;
        
        if(Math.floor(ut)== ut) utt= String.valueOf((int) ut);
        else utt= String.valueOf((ut));
        
        tong= d1* 2+ d2+ d3+ ut;
        
        if(Math.floor(tong)== tong) tongg= String.valueOf((int) (tong));
        else tongg= String.valueOf((tong));
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ utt+ " "+ tongg+ " ";
    }
}