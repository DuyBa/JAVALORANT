import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05064bangthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <btngv> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new btngv(sc.nextLine(), sc.nextLine(), sc.nextLong()));
            if(t> 0) sc.nextLine();
        }

        ArrayList <String> tmp= new ArrayList<>();

        for(btngv i: a)
        {
            String tmpp= i.ma.substring(0, 2);
            tmp.add(tmpp);
            if(tmpp.compareTo("HT")== 0) if(Collections.frequency(tmp, tmpp)== 1) System.out.println(i);
            if(tmpp.compareTo("HP")== 0) if(Collections.frequency(tmp, tmpp)<= 2) System.out.println(i);
            if(tmpp.compareTo("GV")== 0) System.out.println(i);
        }
    }
}

class btngv
{
    String ma;
    String tmp;
    String ten;
    int bac;
    long phucap, thunhap;

    btngv(String ma, String ten, long luong)
    {
        this.ma= ma;
        this.ten= ten;
        bac= Integer.parseInt(ma.substring(ma.length()-2));

        this.tmp= ma.substring(0, 2);
        if(tmp.compareTo("HT")== 0) phucap= 2000000;
        if(tmp.compareTo("HP")== 0) phucap= 900000;
        if(tmp.compareTo("GV")== 0) phucap= 500000;

        thunhap= luong* bac+ phucap;

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ bac+ " "+ phucap+ " "+ thunhap;
    }
}

// HT: 2.000.000
// HP: 900.000
// GV: 500.000