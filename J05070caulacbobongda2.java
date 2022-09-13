import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05070caulacbobongda2
 */
public class J05070caulacbobongda2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <doibong> a= new ArrayList<>();
        while(t--> 0)
        {
           a.add(new doibong(sc.nextLine(), sc.nextLine(), sc.nextInt()));
           if(t> 0) sc.nextLine(); 
        }

        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String ss= sc.next(); 
            long aa= sc.nextLong();
            if(n> 0) sc.nextLine();
            for(doibong i: a)
                if(i.ma.compareTo(ss.substring(1, 3))== 0)
                    i.lam(ss, aa);
        }

        Collections.sort(a, new Comparator<doibong>() {
            public int compare(doibong truoc, doibong sau)
            {
                if(truoc.tien< sau.tien) return 1;
                if(truoc.tien== sau.tien) if(truoc.ten.compareTo(sau.ten)> 1) return 1;
                return -1;
            }
        });

        for(doibong i: a)
            System.out.println(i);
    }
}

class doibong
{
    String ma;
    String ten;
    int sl;
    long tien;

    doibong(String ma, String ten, int sl)
    {
        this.ma= ma;
        this.ten= ten;
        this.sl= sl;
    }

    public void lam(String ma, long tien)
    {
        this.ma= ma;
        this.tien= tien* this.sl;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ tien;
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000