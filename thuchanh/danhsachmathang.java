import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * danhsachmathang
 */
public class danhsachmathang {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dsmh> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new dsmh(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            if(i< t) sc.nextLine();
        }
        Collections.sort(a, new Comparator<dsmh>() {
            public int compare(dsmh truoc, dsmh sau)
            {
                if(truoc.lai< sau.lai) return 1; 
                if(truoc.lai== sau.lai) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        for(dsmh i: a)
            System.out.println(i);
    }
}

class dsmh
{
    String ma;
    String ten;
    String donvi;
    int mua, ban, lai;

    dsmh(int i, String ten, String donvi, int mua, int ban)
    {
        this.ma="MH"+ String.format("%03d", i);
        this.ten= ten;
        this.donvi= donvi;
        this.mua= mua;
        this.ban= ban;
        this.lai= ban- mua;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ donvi+ " "+ mua+ " "+ ban+ " "+ lai;
    }
}