import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05053sapxepdownhang
 */
public class J05053sapxepdownhang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tcdh> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add(new tcdh(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            if(t> 0) sc.nextLine();
        }

        Collections.sort(a, new Comparator<tcdh>() {
            public int compare(tcdh truoc, tcdh sau)
            {
                if(truoc.stt.compareTo(sau.stt)> 0) return 1;
                return -1;
            }
        });

        for(tcdh i: a)
            System.out.println(i);
    }
}

class tcdh
{
    String ten;
    String ma;
    String stt;
    double giam;
    double tien;

    tcdh(String ten, String ma, int gia, int sl)
    {
        this.ten= ten;
        this.ma= ma;
        this.stt= ma.substring(1, 4);
        if(ma.charAt(ma.length()- 1)== '1') giam= gia* sl/ 100* 50;
        else giam= gia* sl/ 100* 30;
        giam= Math.round(giam);
        tien= gia* sl- giam;

    }

    public String toString()
    {
        return ten+ " "+ ma+ " "+ stt+ " "+ (int) giam+ " "+ (int) tien;
    }
}