import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05047bangnhapkhotheochietkhau
 */
/**
 * J05046bangkenhapkho
 */
/**
 * J05047bangnhapkhotheochietkhau
 */
public class J05047bangnhapkhotheochietkhau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bknk> a= new ArrayList<>();
        ArrayList <String> adu= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new bknk(adu, sc.nextLine(), sc.nextInt(), sc.nextInt()));
            // for(String j: adu) System.out.print(j);
            // System.out.println("");
            if(i< t) sc.nextLine();
        }
        
        Collections.sort(a, new Comparator<bknk>() {
            public int compare(bknk truoc, bknk sau)
            {
                if(sau.chietkhau> truoc.chietkhau) return 1;
                return -1;
            }
        });
        
        for(bknk i: a) 
            System.out.println(i);
    }
}

class bknk
{
    String ma= "";
    String ten;
    String loai;
    int chietkhau;
    int tien;

    bknk(ArrayList <String> adu, String ten, int luong, int gia)
    {
        String lag= ten.toUpperCase();
        String[] tmp= lag.split(" ");
        ma+= tmp[0].substring(0, 1)+ tmp[1].substring(0, 1);
        int ress= Collections.frequency(adu, ma);        
        adu.add(ma);
        if(ress< 10) ma+= "0";
        ma+= String.valueOf(ress+ 1);

        this.ten= ten;
        int res= 0;
        if(luong> 10) res+= 5;
        else if(luong>= 8) res+= 2;
        else if(luong>= 5) res+= 1;

        chietkhau= gia* luong* res/ 100;

        tien= gia* luong- chietkhau;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.valueOf(chietkhau)+ " "+ String.valueOf(tien);
    }
}