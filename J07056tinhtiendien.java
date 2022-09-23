import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07056tinhtiendien {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("KHACHHANG.in"));
        ArrayList <khachhangg> a= new ArrayList<>();
        int t= sc.nextInt();
        for(int i= 1;i<= t; i++)
        {
            sc.nextLine();
            a.add(new khachhangg(i, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(a, new Comparator<khachhangg>() {
            public int compare(khachhangg truoc, khachhangg sau)
            {
                if(truoc.tongtien< sau.tongtien) return 1;
                return -1;
            }
        });

        for(khachhangg i: a)
            System.out.println(i);
    }
}

class khachhangg
{
    String ma;
    String ten= "";
    String loai;
    long dau, cuoi;
    long trong, vuot, tongtien, thue;

    khachhangg(int i, String ten, String loai, int dau, int cuoi)
    {
        this.ma= String.format("KH%02d", i);
        
        ten= ten.trim();

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        int tongdien= cuoi- dau;

        int dinhmuc= 0;
        if(loai.charAt(0)== 'A') dinhmuc= 100;
        if(loai.charAt(0)== 'B') dinhmuc= 500;
        if(loai.charAt(0)== 'C') dinhmuc= 200;
        
        if(tongdien< dinhmuc) trong= tongdien* 450;
        else if(tongdien> dinhmuc) trong= dinhmuc* 450;
        
        if(tongdien> dinhmuc) vuot= (tongdien- dinhmuc)* 1000;
        else vuot= 0;

        thue= vuot* 5/ 100;

        tongtien= trong+ vuot+ thue;

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ trong+ " "+ vuot+ " "+ thue+ " "+ tongtien;
    }
}