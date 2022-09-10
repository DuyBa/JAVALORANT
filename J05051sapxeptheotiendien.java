import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05051sapxeptheotiendien
 */
public class J05051sapxeptheotiendien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <ttd> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new ttd(i, sc.nextLine(), sc.nextInt(), sc.nextInt()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<ttd>() {
            public int compare(ttd truoc, ttd sau)
            {
                if(truoc.tong< sau.tong) return 1;
                return -1;
            }
        });

        for(ttd i: a)
            System.out.println(i);
    }
}

class ttd
{
    String ma= "KH";
    String loai;
    int cu;
    int moi;
    int heso= 0;
    long tien;
    double phu;
    double tong;

    ttd(int i, String loai, int cu, int moi)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        if(loai.compareTo("KD")== 0) heso+= 3;
        if(loai.compareTo("NN")== 0) heso+= 5;
        if(loai.compareTo("TT")== 0) heso+= 4;
        if(loai.compareTo("CN")== 0) heso+= 2;
    
        int res= moi- cu;
        tien= res* heso* 550;

        if(res< 50) phu= 0.0;
        if(res<= 100&& res>= 50) phu= tien/ 100.0* 35;
        if(res> 100) phu= tien* 100.0/ 100;
        phu= Math.round(phu);

        tong= phu+ tien;
    }

    public String toString()
    {
        return ma+ " "+ heso+ " "+ tien+ " "+ (int) phu+ " "+ (int) tong;
    }
}