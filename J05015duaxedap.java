import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05015duaxedap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <dxd> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
            a.add(new dxd(sc.nextLine(), sc.nextLine(), sc.nextLine()));

        Collections.sort(a, new Comparator<dxd>() {
            public int compare(dxd truoc, dxd sau)
            {
                if(truoc.km< sau.km) return 1;
                return -1;
            }
        });

        for(dxd i: a)
            System.out.println(i);
    }
}

class dxd
{
    String ma= "";
    String ten;
    String diadiem;
    String gio;
    double km, aa;

    dxd(String ten, String diadiem, String gio)
    {
        String[] tmp= diadiem.split(" "), tmp1= ten.split(" ");
        for(String i: tmp) ma+= i.substring(0, 1).toUpperCase();
        for(String i: tmp1) ma+= i.substring(0, 1).toUpperCase();

        this.ten= ten;
        this.diadiem= diadiem;

        km= 120.0* 6.0/ (double)((Integer.parseInt(gio.substring(0, 1))* 60+ Integer.parseInt(gio.substring(2, 4)))- 6* 60);
        
        this.aa= Math.round(km* 10.0);
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ diadiem+ " "+ String.format("%.0f Km/h", aa);
    }
}

// 3
// Tran Vu Minh
// Ha Noi
// 8:30
// Vu Ngoc Hoang
// Hoa Binh
// 8:20
// Pham Dinh Tan
// An Giang
// 8:45
// HBVNH Vu Ngoc Hoang Hoa Binh 51 Km/h
// HNTVM Tran Vu Minh Ha Noi 48 Km/h
// AGPDT Pham Dinh Tan An Giang 44 Km/h